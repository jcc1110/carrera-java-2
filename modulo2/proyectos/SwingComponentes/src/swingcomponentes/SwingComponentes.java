package swingcomponentes;
import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class SwingComponentes {
    public static void main(String[] args) {
        // Creando mi primera ventana
        JFrame f = new JFrame("Mi Primera Ventana");
        f.setSize(500, 300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        
        // Creando mi Container
        Container cp = f.getContentPane();
        
        // Estableciendo el diseño
        cp.setLayout(new FlowLayout());
        
        // Creando los componentes
        JLabel etiqueta = new JLabel("Nombre: ");
        JTextField texto = new JTextField(20);
        JButton boton = new JButton("Saludar");
        
        // Añadiendo los componentes a la interfaz
        cp.add(etiqueta);
        cp.add(texto);
        cp.add(boton);
    }
}
