package org.example;

import com.GestorBd.GestorBd;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class ventanaReservas extends JFrame {
    private JButton reservacion;
    private JPanel panel1;
    private JTextField nombreCliente;
    private JTextField fechaReservacion;
    private JTextField horaReservacion;
   // private JTextField horaFinReservacion; // Nuevo campo
    private JTextField numeroPerso;
    private JTextField numeroMesa;
    private GestorBd controlBd = new GestorBd();

    public ventanaReservas() {
        // Configuración de la ventana
        setTitle("Reservas");
        setContentPane(panel1);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        pack();

        // Acción al presionar el botón de reserva
        reservacion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String nombre = nombreCliente.getText();
                    String fecha = fechaReservacion.getText();
                    String hora = horaReservacion.getText();


                    // Intentar convertir el número de personas y el número de mesas a entero
                    int numeroPer = Integer.parseInt(numeroPerso.getText());
                    int numeroM = Integer.parseInt(numeroMesa.getText());

                    // Verificar que los campos no estén vacíos
                    if (nombre.isEmpty() || fecha.isEmpty() || hora.isEmpty() || numeroPerso.getText().isEmpty()|| numeroMesa.getText().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Todos los campos deben ser completados.");
                        return; // No proceder si falta algún campo
                    }

                    //Método que añade las 2 horas límite de la reservación
                    int horasExtra = Integer.parseInt(hora.substring(0,2)) +2;
                    String horaFinStr = String.valueOf(horasExtra)+ hora.substring(2,5);


                    // Convertir las horas a LocalTime
                    LocalTime horaReserva = LocalTime.parse(hora, DateTimeFormatter.ofPattern("HH:mm"));
                    LocalTime horaFin = LocalTime.parse(horaFinStr, DateTimeFormatter.ofPattern("HH:mm"));

                    // Crear objeto de reservas para insertar a la bd
                    Reservas reserva = new Reservas(0, nombre, horaReserva, horaFin, numeroPer,numeroM, fecha);

                    // Llamar al método insertarReserva en la clase Restaurante
                    controlBd.insertarReserva(reserva);
                    JOptionPane.showMessageDialog(null, "Cliente añadido con éxito");

                    // Cerrar la ventana
                    dispose();
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Error: El número de personas debe ser un valor válido.");
                }catch (DateTimeParseException ex) {
                    JOptionPane.showMessageDialog(null, "Error: El formato de la hora es inválido. Asegúrate de que esté en el formato HH:mm.");
                }catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Ha ocurrido un error: " + ex.getMessage());
                }
            }
        });
    }

    public static void main(String[] args) {
        // Mostrar la ventana de reservas como una ventana independiente
        ventanaReservas frame = new ventanaReservas();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setResizable(true);
        frame.setVisible(true);
    }
}
