package interfas;

import javax.swing.*;
import java.awt.*;

public class VentanaSecundaria extends JDialog {

    public VentanaSecundaria(JFrame padre) {
        super(padre, "Ventana Secundaria", true);
        setSize(350, 150);
        setLocationRelativeTo(padre);

        // Mostrar mensaje al crear la ventana
        JOptionPane.showMessageDialog(
                this,
                "Este es un mensaje informativo de la ventana secundaria",
                "Información",
                JOptionPane.INFORMATION_MESSAGE
                );
}
}