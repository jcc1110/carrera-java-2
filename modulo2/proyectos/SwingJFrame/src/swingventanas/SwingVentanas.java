package swingventanas;
import javax.swing.JFrame;

public class SwingVentanas {
    public static void main(String[] args) {
        // Creando mi primera ventana
        JFrame f = new JFrame("Mi Primera Ventana");
        f.setSize(400, 300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        
        // Creando mi segunda ventana
        MisVentanas mv = new MisVentanas();
    }
}
