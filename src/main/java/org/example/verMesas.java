package org.example;

import com.GestorBd.GestorBd;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.List;

public class verMesas extends JFrame {
    private JTable tablaReservas;
    private JPanel PanelPrincipal;

    public verMesas() {
        // Configuración del modo oscuro y estilo minimalista
        UIManager.put("Panel.background", 33333);
        UIManager.put("Table.background", Color.GRAY);
        UIManager.put("Table.foreground", Color.WHITE);
        UIManager.put("ScrollPane.background", 333333);
        UIManager.put("TableHeader.background", Color.GRAY);
        UIManager.put("TableHeader.foreground", Color.WHITE);

        setTitle("Vista global de las mesas");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        PanelPrincipal = new JPanel(new BorderLayout());
        PanelPrincipal.setBackground(Color.DARK_GRAY);
        PanelPrincipal.setBackground(Color.DARK_GRAY);

        tablaReservas = new JTable();
        tablaReservas.getTableHeader().setReorderingAllowed(false);
        tablaReservas.setBackground(Color.GRAY);
        tablaReservas.setForeground(Color.WHITE);
        tablaReservas.setFillsViewportHeight(true);
        tablaReservas.setBackground(Color.decode("#333333"));

        PanelPrincipal.add(new JScrollPane(tablaReservas), BorderLayout.CENTER);
        add(PanelPrincipal);

        cargarMesas();
    }

    private void cargarMesas() {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Número mesa");
        modelo.addColumn("Hora Reserva");
        modelo.addColumn("Hora fin Reserva");
        modelo.addColumn("Fecha Reserva");

        GestorBd gestorBd = new GestorBd();
        List<Reservas> reservas = gestorBd.obtenerMesas();

        for (Reservas reserva : reservas) {
            modelo.addRow(new Object[]{reserva.getNumeroMesa(), reserva.getHoraReserva(), reserva.getHoraFin(), reserva.getFechaReserva()});
        }

        tablaReservas.setModel(modelo);
        gestorBd.cerrarConexion();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new verMesas().setVisible(true);
            }
        });
    }
}
