/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package org.example;

import com.GestorBd.GestorBd;
import java.awt.Color;
import java.awt.Font;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.DefaultTableCellRenderer;


/**
 *
 * @author ACER
 */
public class ReservasZz extends javax.swing.JFrame {

    /**
     * Creates new form ReservasZz
     */
    public ReservasZz() {
        initComponents();
    setTitle("Reservaciones programadas");
    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        //Diseño de la tabla
    tablaReservaciones.getTableHeader().setBackground(Color.BLACK); // Fondo oscuro
    tablaReservaciones.setBackground(Color.WHITE); // Color de ondo de la tabla
    tablaReservaciones.getTableHeader().setFont(new Font("Roboto", Font.BOLD, 18)); //Aqui modifica la fuente de las columnas
    tablaReservaciones.setRowHeight(30); //Espaciado entre las celdas
    tablaReservaciones.setFont(new Font("Roboto", Font.PLAIN, 16)); //Modifica la fuente de los registros (es en general, pero a esos afecta)
    
    // Crear un modelo de tabla con nombres personalizados para las columnas
    String[] nombresColumnas = {"Id","Nombre cliente", "Hora reserva", "Fin reserva", "Personas", "Mesa", "Fecha reserva"};
    DefaultTableModel modelo = new DefaultTableModel(null, nombresColumnas);
    
   
        GestorBd gestorBd = new GestorBd();
        List<Reservas> reservas = gestorBd.obtenerReservas();

        for (Reservas reserva : reservas) {
            modelo.addRow(new Object[]{reserva.getId(), reserva.getNombreCliente(), reserva.getHoraReserva(), reserva.getHoraFin(), reserva.getNumeroPersonas(), reserva.getNumeroMesa(), reserva.getFechaReserva()});
        }

        tablaReservaciones.setModel(modelo);
        gestorBd.cerrarConexion();
        
     // Ajustar el ancho de las columnas
        tablaReservaciones.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF); // Desactivar ajuste automático
        tablaReservaciones.getColumnModel().getColumn(0).setPreferredWidth(50);  // Id
        tablaReservaciones.getColumnModel().getColumn(1).setPreferredWidth(150); // Nombre cliente
        tablaReservaciones.getColumnModel().getColumn(2).setPreferredWidth(150); // Hora reserva
        tablaReservaciones.getColumnModel().getColumn(3).setPreferredWidth(150); // Fin reserva
        tablaReservaciones.getColumnModel().getColumn(4).setPreferredWidth(100); // Cantidad de personas
        tablaReservaciones.getColumnModel().getColumn(5).setPreferredWidth(100); // Mesa
        tablaReservaciones.getColumnModel().getColumn(6).setPreferredWidth(150); // Fecha reserva
        
        // Configurar renderizador centrado general
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(DefaultTableCellRenderer.CENTER);

        // Aplicar el renderizador centrado a las celdas
        tablaReservaciones.setDefaultRenderer(Object.class, centerRenderer);

        // Centrar encabezados
        DefaultTableCellRenderer headerRenderer = (DefaultTableCellRenderer) tablaReservaciones.getTableHeader().getDefaultRenderer();
        headerRenderer.setHorizontalAlignment(DefaultTableCellRenderer.CENTER);
        tablaReservaciones.getTableHeader().setDefaultRenderer(headerRenderer);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaReservaciones = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaReservaciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7"
            }
        ));
        jScrollPane2.setViewportView(tablaReservaciones);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 860, 350));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 914, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(ReservasZz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReservasZz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReservasZz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReservasZz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ReservasZz frame = new ReservasZz();
                frame.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
                frame.setLocationRelativeTo(null);
                frame.setResizable(true);
                frame.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tablaReservaciones;
    // End of variables declaration//GEN-END:variables
}
