package interfas;

import interfas.VentanaSecundaria;

import javax.swing.*;
import java.awt.*;

public class VentanaPrincipal extends JFrame {

    // Componentes globales
    private JTabbedPane pestanas;
    private JPanel panelBienvenida;
    private JPanel panelInfo;

    public VentanaPrincipal() {
        setTitle("Gestion de la clinica veterinaria");
        setSize(800, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Centrar

        initComponents(); // Modularización de la interfaz
    }

    private void initComponents() {
        pestanas = new JTabbedPane();

        //  Pestaña 1: Bienvenida
        panelBienvenida = new JPanel();
        panelBienvenida.setLayout(new BorderLayout());

        JLabel mensaje = new JLabel("Bienvenido al sistema de la Gestión de citas de la veterinaria \n || AMOR A TU MEJOR AMIGO||", SwingConstants.CENTER);
        mensaje.setFont(new Font("Arial", Font.BOLD, 16));
        panelBienvenida.add(mensaje, BorderLayout.CENTER);

        JButton btnCambiarColor = new JButton("Cambiar color de fondo");
        btnCambiarColor.addActionListener(e -> {
            Color color = JColorChooser.showDialog(this, "Selecciona un color", panelBienvenida.getBackground());
            if (color != null) {
                panelBienvenida.setBackground(color);
            }
        });
        panelBienvenida.add(btnCambiarColor, BorderLayout.SOUTH);

        pestanas.addTab("Bienvenida", panelBienvenida);

        //  Pestaña 2: Informativa
        panelInfo = new JPanel(new BorderLayout());

        JTextArea texto = new JTextArea(
                "sistema para gestionar citas \n agragar, buscar ,y editar histaoriales clinicos"
        );
        texto.setLineWrap(true);
        texto.setWrapStyleWord(true);
        JScrollPane scroll = new JScrollPane(texto);
        panelInfo.add(scroll, BorderLayout.CENTER);

        JButton btnVentanaSecundaria = new JButton("Abrir ventana secundaria");
        // Evento (puedes quitar esto si aún no quieres lógica funcional)
        btnVentanaSecundaria.addActionListener(e -> {
            new VentanaSecundaria(this).setVisible(true);
        });
        panelInfo.add(btnVentanaSecundaria, BorderLayout.SOUTH);

        pestanas.addTab("Información", panelInfo);

        add(pestanas);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new VentanaPrincipal().setVisible(true));
}
}