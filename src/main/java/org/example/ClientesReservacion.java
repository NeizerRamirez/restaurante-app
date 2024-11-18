package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import com.GestorBd.GestorBd;

public class ClientesReservacion extends JFrame {

    private JTextField nombreCliente;
    private JTextField esperaAprox;
    private JButton enviarALaEsperaButton;
    private JPanel panelEspera;

    public ClientesReservacion() {
        // Configuración del modo oscuro y estilo minimalista
        UIManager.put("Panel.background", Color.DARK_GRAY);
        UIManager.put("Button.background", Color.GRAY);
        UIManager.put("Button.foreground", Color.WHITE);
        UIManager.put("Button.font", new Font("Arial", Font.PLAIN, 14));
        UIManager.put("TextField.background", Color.GRAY);
        UIManager.put("TextField.foreground", Color.WHITE);
        UIManager.put("Label.foreground", Color.WHITE);

        // Inicialización de componentes
        nombreCliente = new JTextField(20);
        esperaAprox = new JTextField(20);
        enviarALaEsperaButton = new JButton("Enviar a la Espera");
        panelEspera = new JPanel();
        panelEspera.setBackground(Color.DARK_GRAY);

        // Añadir componentes al panel
        panelEspera.add(new JLabel("Nombre del Cliente:"));
        panelEspera.add(nombreCliente);
        panelEspera.add(new JLabel("Espera Aproximada:"));
        panelEspera.add(esperaAprox);
        panelEspera.add(enviarALaEsperaButton);

        // Configuración de la ventana
        setTitle("Reservas");
        setContentPane(panelEspera);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        pack();
        setSize(350, 200);
        setLocationRelativeTo(null);
        setResizable(false);

        // Acción para el botón
        enviarALaEsperaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombre = nombreCliente.getText();
                int esperaAproximada = Integer.parseInt(esperaAprox.getText());
                ClientePila esperas = new ClientePila(nombre, esperaAproximada);
                GestorBd gestorBd = new GestorBd();
                gestorBd.agregarAEspera(esperas);
                JOptionPane.showMessageDialog(null, "Cliente añadido con éxito");
                // Cerrar la ventana
                dispose();
            }
        });
    }

    public static void main(String[] args) {
        ClientesReservacion frame = new ClientesReservacion();
        frame.setContentPane(new ClientesReservacion().panelEspera);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }
}
