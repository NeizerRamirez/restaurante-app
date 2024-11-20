/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package org.example;

import com.GestorBd.GestorBd;
import javax.swing.JOptionPane;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

/**
 *
 * @author ACER
 */
public class GestionarColaZz extends javax.swing.JPanel {
    
     private ClientePila objetoPila;  // Declarar la variable fuera del bloque try-catch
     private GestorBd gestorBd = new GestorBd();



    /**
     * Creates new form GestionarColaZz
     */
    public GestionarColaZz() {
        initComponents();
        // Intentar obtener el cliente en espera y manejar el caso en que la pila esté vacía
        try {
            objetoPila = gestorBd.atenderEspera();
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "La pila se encuentra vacía", "Error", JOptionPane.ERROR_MESSAGE);
            objetoPila = null;  // Si la pila está vacía, la variable será null
        }
        
        mostrarNombreEnEspera();


    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        numeroMesa = new javax.swing.JTextField();
        enviarALasReservacionesButton = new javax.swing.JButton();
        textoArriba = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        horaReserva = new javax.swing.JTextField();
        cantidadPers = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(770, 290));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel6.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel6.setText("Número de mesa:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 170, -1));

        numeroMesa.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 102), 2, true));
        numeroMesa.setCaretColor(new java.awt.Color(0, 102, 255));
        numeroMesa.setDisabledTextColor(new java.awt.Color(51, 153, 255));
        add(numeroMesa, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 200, 200, 30));

        enviarALasReservacionesButton.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        enviarALasReservacionesButton.setText("Agregar reservación");
        enviarALasReservacionesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviarALasReservacionesButtonActionPerformed(evt);
            }
        });
        add(enviarALasReservacionesButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 260, 230, 30));

        textoArriba.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        textoArriba.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoArriba.setText("Atendiendo la reservación de: ");
        add(textoArriba, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 770, -1));

        jLabel8.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel8.setText("Hora de la reserva:");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, -1, -1));

        jLabel9.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel9.setText("Cantidad de personas:");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, -1, -1));

        horaReserva.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 102), 2, true));
        horaReserva.setCaretColor(new java.awt.Color(0, 102, 255));
        horaReserva.setDisabledTextColor(new java.awt.Color(51, 153, 255));
        add(horaReserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 80, 200, 30));

        cantidadPers.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 102), 2, true));
        cantidadPers.setCaretColor(new java.awt.Color(0, 102, 255));
        cantidadPers.setDisabledTextColor(new java.awt.Color(51, 153, 255));
        add(cantidadPers, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 140, 200, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void enviarALasReservacionesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviarALasReservacionesButtonActionPerformed
        // TODO add your handling code here:
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
                    LocalTime horaReservaa = LocalTime.parse(horaReser, DateTimeFormatter.ofPattern("HH:mm"));
                    LocalTime horaFin = LocalTime.parse(horaFinStr, DateTimeFormatter.ofPattern("HH:mm"));

                    // Crear objeto de reservas
                    Reservas reservas = new Reservas(0, objetoPila.getNombreCliente(), horaReservaa, horaFin, numeroPer, numeroM, objetoPila.getFechaEntrada().toString());

                    // Insertar la reserva en la base de datos
                    gestorBd.insertarReserva(reservas);

                    // Mostrar mensaje de éxito
                    JOptionPane.showMessageDialog(null, "Cliente añadido con éxito");
                    
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
        
    }//GEN-LAST:event_enviarALasReservacionesButtonActionPerformed

    private void mostrarNombreEnEspera() {
        if (objetoPila != null) {
            textoArriba.setText("Atendiendo reservación de: " + objetoPila.getNombreCliente());
        } else {
            textoArriba.setText("No hay clientes en espera.");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JTextField cantidadPers;
    private javax.swing.JButton enviarALasReservacionesButton;
    private javax.swing.JTextField horaReserva;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField numeroMesa;
    private javax.swing.JLabel textoArriba;
    // End of variables declaration//GEN-END:variables
}
