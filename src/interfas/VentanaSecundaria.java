package interfas;

import javax.swing.*;
import java.awt.*;

public class VentanaSecundaria extends JDialog {

    public VentanaSecundaria(JFrame padre) {
        super(padre, "Ventana Secundaria", true);
        setSize(600, 600);
        setLocationRelativeTo(padre);

        // Mostrar mensaje al crear la ventana
        JOptionPane.showMessageDialog(
                this,
                "Este es un mensaje informativo de la ventana secundaria",
                "Información",
                JOptionPane.INFORMATION_MESSAGE
                );

        // Crear un JLabel con la imagen
        ImageIcon imagen = new ImageIcon(getClass().getResource("/interfas/PERRAZO.jpg"));
        JLabel labelImagen = new JLabel(imagen);

        // Agregar la imagen al JFrame
        add(labelImagen);
}
}