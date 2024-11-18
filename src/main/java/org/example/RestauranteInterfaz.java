package org.example;

import com.GestorBd.GestorBd;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RestauranteInterfaz {
    private JPanel mainPanel;
    private JButton gestionarEsperasButton;
    private JButton reservasPorTelefonoButton;
    private JButton verReservacionesButton;
    private JButton ClienteReservacion;
    private JButton verMesas;
    private JButton eliminarReserva;

    public RestauranteInterfaz() {
        // Configuración del modo oscuro y estilo minimalista
        UIManager.put("Panel.background", Color.DARK_GRAY);
        UIManager.put("Button.background", Color.GRAY);
        UIManager.put("Button.foreground", Color.WHITE);
        UIManager.put("OptionPane.background", Color.DARK_GRAY);
        UIManager.put("OptionPane.foreground", Color.WHITE);
        UIManager.put("Button.font", new Font("Arial", Font.PLAIN, 14));


        mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(6, 1, 15, 15));
        mainPanel.setBackground(Color.DARK_GRAY);

        gestionarEsperasButton = crearBoton("Gestionar Esperas");
        reservasPorTelefonoButton = crearBoton("Reservas por Teléfono");
        ClienteReservacion = crearBoton("Cliente sin Reservación");
        eliminarReserva = crearBoton("Eliminar Reserva");
        verReservacionesButton = crearBoton("Ver Reservaciones");
        verMesas = crearBoton("Ver Mesas");

        mainPanel.add(reservasPorTelefonoButton);
        mainPanel.add(ClienteReservacion);
        mainPanel.add(gestionarEsperasButton);
        mainPanel.add(eliminarReserva);
        mainPanel.add(verReservacionesButton);
        mainPanel.add(verMesas);

        // Acción al presionar el botón de reservas por teléfono
        reservasPorTelefonoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ventanaReservas newFrame = new ventanaReservas();
                newFrame.setVisible(true);
            }
        });

        // Acción al presionar el botón de ver reservaciones
        verReservacionesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                verReservaciones verReservas = new verReservaciones();
                verReservas.setVisible(true);
            }
        });

        // Acción al presionar clientes sin reserva
        ClienteReservacion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ClientesReservacion clientesReservacion = new ClientesReservacion();
                clientesReservacion.setVisible(true);
            }
        });

        // Acción al presionar gestionar esperas
        gestionarEsperasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GestionarCola gestionarCola = new GestionarCola();
                gestionarCola.setVisible(true);
            }
        });

        // Ver las mesas disponibles
        verMesas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                verMesas cargarMesas = new verMesas();
                cargarMesas.setVisible(true);
            }
        });

        // Acción al presionar eliminar reserva
        eliminarReserva.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GestorBd gestorBd = new GestorBd();
                gestorBd.atenderReserva();
                JLabel etiquetaMensaje = new JLabel("Cliente eliminado con exito");
                etiquetaMensaje.setForeground(Color.WHITE);
                JOptionPane.showMessageDialog(null, etiquetaMensaje);
            }
        });
    }

    private JButton crearBoton(String texto) {
        JButton button = new JButton(texto);
        button.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
        button.setFocusPainted(false);
        button.setFont(new Font("Arial", Font.BOLD, 12));
        button.setBackground(Color.GRAY);
        button.setForeground(Color.WHITE);
        button.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        button.setOpaque(true);
        return button;
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("RestauranteInterfaz");
        frame.setContentPane(new RestauranteInterfaz().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(350, 300);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setVisible(true);
    }
}
