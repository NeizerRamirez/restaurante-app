/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package org.example;

/**
 *
 * @author ACER
 */
public class GestionarColaZz extends javax.swing.JPanel {

    /**
     * Creates new form GestionarColaZz
     */
    public GestionarColaZz() {
        initComponents();
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
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel6.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Número de mesa");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, -1, -1));

        numeroMesa.setBackground(new java.awt.Color(255, 255, 255));
        numeroMesa.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 204, 255), 2, true));
        numeroMesa.setCaretColor(new java.awt.Color(0, 102, 255));
        numeroMesa.setDisabledTextColor(new java.awt.Color(51, 153, 255));
        add(numeroMesa, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, 200, 30));

        enviarALasReservacionesButton.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        enviarALasReservacionesButton.setForeground(new java.awt.Color(0, 0, 0));
        enviarALasReservacionesButton.setText("Agregar reservación");
        enviarALasReservacionesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviarALasReservacionesButtonActionPerformed(evt);
            }
        });
        add(enviarALasReservacionesButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 310, 230, 30));

        textoArriba.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        textoArriba.setForeground(new java.awt.Color(0, 0, 0));
        textoArriba.setText("Atendiendo la reservación de: ");
        add(textoArriba, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 510, -1));

        jLabel8.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Hora de la reserva");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, -1, -1));

        jLabel9.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Cantidad de personas");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 110, -1, -1));

        horaReserva.setBackground(new java.awt.Color(255, 255, 255));
        horaReserva.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 204, 255), 2, true));
        horaReserva.setCaretColor(new java.awt.Color(0, 102, 255));
        horaReserva.setDisabledTextColor(new java.awt.Color(51, 153, 255));
        add(horaReserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 200, 30));

        cantidadPers.setBackground(new java.awt.Color(255, 255, 255));
        cantidadPers.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 204, 255), 2, true));
        cantidadPers.setCaretColor(new java.awt.Color(0, 102, 255));
        cantidadPers.setDisabledTextColor(new java.awt.Color(51, 153, 255));
        add(cantidadPers, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 140, 200, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void enviarALasReservacionesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviarALasReservacionesButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enviarALasReservacionesButtonActionPerformed


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