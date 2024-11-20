/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package org.example;

import com.GestorBd.GestorBd;
import javax.swing.JOptionPane;

/**
 *
 * @author ACER
 */
public class ClientesReservacionZz extends javax.swing.JPanel {

    /**
     * Creates new form ClientesReservacionZz
     */
    public ClientesReservacionZz() {
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
        jLabel7 = new javax.swing.JLabel();
        nombreCliente = new javax.swing.JTextField();
        esperaAprox = new javax.swing.JTextField();
        enviarALaEsperaButton = new javax.swing.JButton();

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel6.setText("Nombre del cliente:");
        bg.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, -1, -1));

        jLabel7.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel7.setText("Tiempo de espera:");
        bg.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, -1, -1));

        nombreCliente.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 102), 2, true));
        nombreCliente.setCaretColor(new java.awt.Color(0, 102, 255));
        nombreCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nombreCliente.setDisabledTextColor(new java.awt.Color(51, 153, 255));
        bg.add(nombreCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 110, 200, 30));

        esperaAprox.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 102), 2, true));
        esperaAprox.setCaretColor(new java.awt.Color(0, 102, 255));
        esperaAprox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        esperaAprox.setDisabledTextColor(new java.awt.Color(51, 153, 255));
        bg.add(esperaAprox, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 180, 200, 30));

        enviarALaEsperaButton.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        enviarALaEsperaButton.setText("Enviar a la espera");
        enviarALaEsperaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviarALaEsperaButtonActionPerformed(evt);
            }
        });
        bg.add(enviarALaEsperaButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 260, 230, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, 770, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void enviarALaEsperaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviarALaEsperaButtonActionPerformed
        try {
            // Obtener los datos ingresados por el usuario
            String nombre = nombreCliente.getText();
            int esperaAproximada = Integer.parseInt(esperaAprox.getText());

            // Verificar que el nombre no esté vacío y la espera sea válida
            if (nombre.isEmpty()) {
                JOptionPane.showMessageDialog(null, "El nombre del cliente no puede estar vacío.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            if (esperaAproximada <= 0) {
                JOptionPane.showMessageDialog(null, "El tiempo de espera debe ser un número positivo.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Crear el objeto ClientePila
            ClientePila esperas = new ClientePila(nombre, esperaAproximada);

            // Instanciar el GestorBd y agregar a la espera
            GestorBd gestorBd = new GestorBd();
            gestorBd.agregarAEspera(esperas);

            // Mostrar mensaje de éxito
            JOptionPane.showMessageDialog(null, "Cliente añadido con éxito");

        } catch (NumberFormatException ex) {
            // Captura errores al convertir el tiempo de espera a número
            JOptionPane.showMessageDialog(null, "Error: El tiempo de espera debe ser un valor numérico.", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (Exception ex) {
            // Captura otros errores generales
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_enviarALaEsperaButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JButton enviarALaEsperaButton;
    private javax.swing.JTextField esperaAprox;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField nombreCliente;
    // End of variables declaration//GEN-END:variables
}
