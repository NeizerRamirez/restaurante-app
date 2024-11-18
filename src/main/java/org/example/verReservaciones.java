package org.example;

import com.GestorBd.GestorBd;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.List;

public class verReservaciones extends JFrame {
    private JTable tablaReservas;
    private JPanel PanelPrincipal;

    public verReservaciones() {
        // Configuración del modo oscuro y estilo minimalista
        UIManager.put("Panel.background", 333333);
        UIManager.put("Table.background", Color.GRAY);
        UIManager.put("Table.foreground", Color.WHITE);
        UIManager.put("ScrollPane.background", 333333);
        UIManager.put("TableHeader.background", Color.GRAY);
        UIManager.put("TableHeader.foreground", Color.WHITE);

        setTitle("Reservas del Restaurante");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        PanelPrincipal = new JPanel(new BorderLayout());
        PanelPrincipal.setBackground(Color.DARK_GRAY);

        tablaReservas = new JTable();
        tablaReservas.getTableHeader().setReorderingAllowed(false);
        tablaReservas.setBackground(Color.decode("#333333"));
        tablaReservas.setForeground(Color.WHITE);
        tablaReservas.setFillsViewportHeight(true);
        tablaReservas.setGridColor(Color.WHITE);
        PanelPrincipal.add(new JScrollPane(tablaReservas), BorderLayout.CENTER);
        add(PanelPrincipal);

        cargarReservas();
    }


    private void cargarReservas() {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID");
        modelo.addColumn("Nombre Cliente");
        modelo.addColumn("Hora Reserva");
        modelo.addColumn("Hora fin Reserva");
        modelo.addColumn("Número de Personas");
        modelo.addColumn("Número mesa");
        modelo.addColumn("Fecha Reserva");

        GestorBd gestorBd = new GestorBd();
        List<Reservas> reservas = gestorBd.obtenerReservas();

        for (Reservas reserva : reservas) {
            modelo.addRow(new Object[]{reserva.getId(), reserva.getNombreCliente(), reserva.getHoraReserva(), reserva.getHoraFin(), reserva.getNumeroPersonas(), reserva.getNumeroMesa(), reserva.getFechaReserva()});
        }

        tablaReservas.setModel(modelo);
        gestorBd.cerrarConexion();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new verReservaciones().setVisible(true);
            }
        });
    }
}
