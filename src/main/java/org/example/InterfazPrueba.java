/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package org.example;

/**
 *
 * @author ACER
 */
public class InterfazPrueba extends javax.swing.JFrame {

    /**
     * Creates new form InterfazPrueba
     */
    public InterfazPrueba() {
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
        jPanel1 = new javax.swing.JPanel();
        eliminarReserva = new javax.swing.JButton();
        reservasPorTelefonoButton = new javax.swing.JButton();
        gestionarEsperasButton = new javax.swing.JButton();
        verReservacionesButton = new javax.swing.JButton();
        verMesas = new javax.swing.JButton();
        ClienteReservacion = new javax.swing.JButton();
        SistemaAdmin_txt = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Bienvenido_txt = new javax.swing.JLabel();
        explicacion_txt = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 51, 255));
        jPanel1.setForeground(new java.awt.Color(0, 102, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        eliminarReserva.setText("Eliminar reserva");
        eliminarReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarReservaActionPerformed(evt);
            }
        });
        jPanel1.add(eliminarReserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 240, 50));

        reservasPorTelefonoButton.setText("Reservas por teléfono");
        reservasPorTelefonoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reservasPorTelefonoButtonActionPerformed(evt);
            }
        });
        jPanel1.add(reservasPorTelefonoButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 240, 50));

        gestionarEsperasButton.setText("Gestionar esperas");
        gestionarEsperasButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gestionarEsperasButtonActionPerformed(evt);
            }
        });
        jPanel1.add(gestionarEsperasButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 240, 50));

        verReservacionesButton.setText("Ver reservaciones");
        verReservacionesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verReservacionesButtonActionPerformed(evt);
            }
        });
        jPanel1.add(verReservacionesButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 240, 50));

        verMesas.setText("Ver mesas");
        verMesas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verMesasActionPerformed(evt);
            }
        });
        jPanel1.add(verMesas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 240, 50));

        ClienteReservacion.setText("Clientes sin reservación");
        ClienteReservacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClienteReservacionActionPerformed(evt);
            }
        });
        jPanel1.add(ClienteReservacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 240, 50));

        SistemaAdmin_txt.setText("Sistema de administración");
        jPanel1.add(SistemaAdmin_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 160, 30));

        bg.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 480));

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setForeground(new java.awt.Color(204, 204, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Bienvenido_txt.setText("¡Bienvenido!");
        jPanel2.add(Bienvenido_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 290, 60));

        bg.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 50, 590, 80));

        explicacion_txt.setText("Este es el sistema para administrar las reservas de nuestro restaurante, pulsa una de las opciones a la izquierda");
        bg.add(explicacion_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 210, 480, 180));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 822, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void reservasPorTelefonoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reservasPorTelefonoButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_reservasPorTelefonoButtonActionPerformed

    private void ClienteReservacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClienteReservacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ClienteReservacionActionPerformed

    private void eliminarReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarReservaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eliminarReservaActionPerformed

    private void gestionarEsperasButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gestionarEsperasButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gestionarEsperasButtonActionPerformed

    private void verReservacionesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verReservacionesButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_verReservacionesButtonActionPerformed

    private void verMesasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verMesasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_verMesasActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InterfazPrueba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazPrueba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazPrueba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazPrueba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazPrueba().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Bienvenido_txt;
    private javax.swing.JButton ClienteReservacion;
    private javax.swing.JLabel SistemaAdmin_txt;
    private javax.swing.JPanel bg;
    private javax.swing.JButton eliminarReserva;
    private javax.swing.JLabel explicacion_txt;
    private javax.swing.JButton gestionarEsperasButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton reservasPorTelefonoButton;
    private javax.swing.JButton verMesas;
    private javax.swing.JButton verReservacionesButton;
    // End of variables declaration//GEN-END:variables
}
