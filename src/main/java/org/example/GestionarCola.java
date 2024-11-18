package org.example;
import com.GestorBd.GestorBd;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class GestionarCola extends JFrame {
    private JTextField horaReserva;
    private JTextField cantidadPers;
    private GestorBd gestorBd = new GestorBd();
    private ClientePila objetoPila;  // Declarar la variable fuera del bloque try-catch
    private JLabel textoArriba;
    private JPanel panel1;
    private JTextField numeroMesa;
    private JButton enviarALasReservacionesButton;

    public GestionarCola() {
        // Intentar obtener el cliente en espera y manejar el caso en que la pila esté vacía
        try {
            objetoPila = gestorBd.atenderEspera();
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "La pila se encuentra vacía", "Error", JOptionPane.ERROR_MESSAGE);
            objetoPila = null;  // Si la pila está vacía, la variable será null
        }

        // Configuración de la ventana
        setTitle("Reservas");
        setContentPane(panel1);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        pack();
        mostrarNombreEnEspera();

        enviarALasReservacionesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    // Verificar si objetoPila es null antes de proceder
                    if (objetoPila == null) {
                        JOptionPane.showMessageDialog(null, "No hay clientes esperando.", "Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    }

                    // Cargar la última persona y eliminarla
                    // Intentar convertir el número de personas y el número de mesas a entero
                    String horaReser = horaReserva.getText();
                    int numeroPer = Integer.parseInt(cantidadPers.getText());
                    int numeroM = Integer.parseInt(numeroMesa.getText());

                    // Método que añade las 2 horas límite de la reservación
                    int horasExtra = Integer.parseInt(horaReser.substring(0, 2)) + 2;
                    String horaFinStr = String.valueOf(horasExtra) + horaReser.substring(2, 5);

                    // Convertir las horas a LocalTime
                    LocalTime horaReserva = LocalTime.parse(horaReser, DateTimeFormatter.ofPattern("HH:mm"));
                    LocalTime horaFin = LocalTime.parse(horaFinStr, DateTimeFormatter.ofPattern("HH:mm"));

                    // Crear objeto de reservas
                    Reservas reservas = new Reservas(0, objetoPila.getNombreCliente(), horaReserva, horaFin, numeroPer, numeroM, objetoPila.getFechaEntrada().toString());

                    // Insertar la reserva en la base de datos
                    gestorBd.insertarReserva(reservas);

                    // Mostrar mensaje de éxito
                    JOptionPane.showMessageDialog(null, "Cliente añadido con éxito");
                    dispose();
                } catch (NumberFormatException ex) {
                    // Captura errores de conversión a entero o de la fecha
                    JOptionPane.showMessageDialog(null, "Error en la conversión de datos. Verifica que los campos numéricos sean válidos.", "Error", JOptionPane.ERROR_MESSAGE);
                    ex.printStackTrace();  // Imprime el error para fines de depuración
                } catch (DateTimeParseException ex) {
                    // Captura errores de formato de fecha/hora
                    JOptionPane.showMessageDialog(null, "Formato de hora inválido. Asegúrate de que la hora esté en el formato HH:mm.", "Error", JOptionPane.ERROR_MESSAGE);
                    ex.printStackTrace();  // Imprime el error para fines de depuración
                } catch (Exception ex) {
                    // Captura otros errores generales
                    JOptionPane.showMessageDialog(null, "Ocurrió un error inesperado.", "Error", JOptionPane.ERROR_MESSAGE);
                    ex.printStackTrace();  // Imprime el error para fines de depuración
                }
            }
        });
    }

    private void mostrarNombreEnEspera() {
        if (objetoPila != null) {
            textoArriba.setText("Atendiendo reservación de: " + objetoPila.getNombreCliente());
        } else {
            textoArriba.setText("No hay clientes en espera.");
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("GestionarCola");
        frame.setContentPane(new GestionarCola().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }
}
