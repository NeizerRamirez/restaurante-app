/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package org.example;

import com.GestorBd.GestorBd;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


/**
 *
 * @author ACER
 */
public class InterfaZZzzzzZZ extends javax.swing.JFrame {

    /**
     * Creates new form InterfaZZzzzzZZ
     */
    public InterfaZZzzzzZZ() {
        initComponents();
                
        // Acción al presionar eliminar reserva
        eliminarReserva.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GestorBd gestorBd = new GestorBd();
                gestorBd.atenderReserva();
                JLabel etiquetaMensaje = new JLabel("Cliente eliminado con exito");
                etiquetaMensaje.setForeground(Color.BLACK);
                JOptionPane.showMessageDialog(null, etiquetaMensaje);
            }
        });
        
        // Ver las mesas disponibles
        verMesas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                verMesasZz cargarMesas = new verMesasZz();
                cargarMesas.setSize(600,450);
                cargarMesas.setVisible(true);
            }
        });
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
        Selector = new javax.swing.JPanel();
        Inicio = new javax.swing.JButton();
        reservasPorTelefonoButton = new javax.swing.JButton();
        ClienteReservacion = new javax.swing.JButton();
        eliminarReserva = new javax.swing.JButton();
        gestionarEsperasButton = new javax.swing.JButton();
        verReservacionesButton = new javax.swing.JButton();
        verMesas = new javax.swing.JButton();
        SistemaAdmin_txt = new javax.swing.JLabel();
        decoracion = new javax.swing.JPanel();
        Bienvenido_txt = new javax.swing.JLabel();
        content = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Selector.setBackground(new java.awt.Color(0, 0, 255));
        Selector.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Inicio.setBackground(new java.awt.Color(0, 0, 255));
        Inicio.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        Inicio.setForeground(new java.awt.Color(255, 255, 255));
        Inicio.setText("Inicio");
        Inicio.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Inicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InicioActionPerformed(evt);
            }
        });
        Selector.add(Inicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 230, 50));

        reservasPorTelefonoButton.setBackground(new java.awt.Color(0, 0, 255));
        reservasPorTelefonoButton.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        reservasPorTelefonoButton.setForeground(new java.awt.Color(255, 255, 255));
        reservasPorTelefonoButton.setText("Reservas por telefono");
        reservasPorTelefonoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reservasPorTelefonoButtonActionPerformed(evt);
            }
        });
        Selector.add(reservasPorTelefonoButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 230, 50));

        ClienteReservacion.setBackground(new java.awt.Color(0, 0, 255));
        ClienteReservacion.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        ClienteReservacion.setForeground(new java.awt.Color(255, 255, 255));
        ClienteReservacion.setText("Clientes sin reservación");
        ClienteReservacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClienteReservacionActionPerformed(evt);
            }
        });
        Selector.add(ClienteReservacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 230, 50));

        eliminarReserva.setBackground(new java.awt.Color(0, 0, 255));
        eliminarReserva.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        eliminarReserva.setForeground(new java.awt.Color(255, 255, 255));
        eliminarReserva.setText("Eliminar reserva");
        eliminarReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarReservaActionPerformed(evt);
            }
        });
        Selector.add(eliminarReserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 230, 50));

        gestionarEsperasButton.setBackground(new java.awt.Color(0, 0, 255));
        gestionarEsperasButton.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        gestionarEsperasButton.setForeground(new java.awt.Color(255, 255, 255));
        gestionarEsperasButton.setText("Gestionar esperas");
        gestionarEsperasButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gestionarEsperasButtonActionPerformed(evt);
            }
        });
        Selector.add(gestionarEsperasButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 230, 50));

        verReservacionesButton.setBackground(new java.awt.Color(0, 0, 255));
        verReservacionesButton.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        verReservacionesButton.setForeground(new java.awt.Color(255, 255, 255));
        verReservacionesButton.setText("Ver reservaciones");
        verReservacionesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verReservacionesButtonActionPerformed(evt);
            }
        });
        Selector.add(verReservacionesButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 230, 50));

        verMesas.setBackground(new java.awt.Color(0, 0, 255));
        verMesas.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        verMesas.setForeground(new java.awt.Color(255, 255, 255));
        verMesas.setText("Ver Mesas");
        verMesas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verMesasActionPerformed(evt);
            }
        });
        Selector.add(verMesas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 230, 50));

        SistemaAdmin_txt.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        SistemaAdmin_txt.setForeground(new java.awt.Color(255, 255, 255));
        SistemaAdmin_txt.setText("Sistema de administración");
        Selector.add(SistemaAdmin_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 260, 30));

        bg.add(Selector, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 510));

        decoracion.setBackground(new java.awt.Color(204, 204, 204));
        decoracion.setLayout(new java.awt.BorderLayout());

        Bienvenido_txt.setFont(new java.awt.Font("Roboto", 0, 48)); // NOI18N
        Bienvenido_txt.setForeground(new java.awt.Color(102, 102, 102));
        Bienvenido_txt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Bienvenido_txt.setText("¡Bienvenido!");
        decoracion.add(Bienvenido_txt, java.awt.BorderLayout.CENTER);

        bg.add(decoracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, 610, 90));

        content.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("Este es el sistema para administrar las reservas de nuestro restaurante, pulsa una de las opciones a la izquierda");

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentLayout.createSequentialGroup()
                .addGap(162, 162, 162)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(166, Short.MAX_VALUE))
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentLayout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(127, Short.MAX_VALUE))
        );

        bg.add(content, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, 610, 360));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void InicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InicioActionPerformed
        // TODO add your handling code here:
        Inicio inicio = new Inicio();
        inicio.setSize(800,500);
        inicio.setLocation(0,0);
        
        content.removeAll();
        content.add(inicio, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
        Bienvenido_txt.setText("¡Bienvenido!");

    }//GEN-LAST:event_InicioActionPerformed

    private void reservasPorTelefonoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reservasPorTelefonoButtonActionPerformed
        // TODO add your handling code here:
        verReservaZz reservas = new verReservaZz();
        reservas.setSize(800,500);
        reservas.setLocation(0,0);
        
        content.removeAll();
        content.add(reservas, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
        Bienvenido_txt.setText("Programación de la reserva");

    }//GEN-LAST:event_reservasPorTelefonoButtonActionPerformed

    private void ClienteReservacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClienteReservacionActionPerformed
        // TODO add your handling code here:
        ClientesReservacionZz clientesSinReserva = new ClientesReservacionZz();
        clientesSinReserva.setSize(800,500);
        clientesSinReserva.setLocation(0,0);
        
        content.removeAll();
        content.add(clientesSinReserva, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
        Bienvenido_txt.setText("Cliente sin reservación");

    }//GEN-LAST:event_ClienteReservacionActionPerformed

    private void eliminarReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarReservaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eliminarReservaActionPerformed

    
    private void gestionarEsperasButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gestionarEsperasButtonActionPerformed
        // TODO add your handling code here:
        GestionarColaZz colaGes = new GestionarColaZz();
        colaGes.setSize(800,500);
        colaGes.setLocation(0,0);
        
        content.removeAll();
        content.add(colaGes, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
        Bienvenido_txt.setText("Añade la reservación");
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
            java.util.logging.Logger.getLogger(InterfaZZzzzzZZ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfaZZzzzzZZ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfaZZzzzzZZ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfaZZzzzzZZ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfaZZzzzzZZ().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Bienvenido_txt;
    private javax.swing.JButton ClienteReservacion;
    private javax.swing.JButton Inicio;
    private javax.swing.JPanel Selector;
    private javax.swing.JLabel SistemaAdmin_txt;
    private javax.swing.JPanel bg;
    private javax.swing.JPanel content;
    private javax.swing.JPanel decoracion;
    private javax.swing.JButton eliminarReserva;
    private javax.swing.JButton gestionarEsperasButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton reservasPorTelefonoButton;
    private javax.swing.JButton verMesas;
    private javax.swing.JButton verReservacionesButton;
    // End of variables declaration//GEN-END:variables
}
