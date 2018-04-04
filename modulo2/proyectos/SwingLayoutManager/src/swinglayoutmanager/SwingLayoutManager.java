package swinglayoutmanager;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class SwingLayoutManager {
    public static void main(String[] args) {
        // Llamando a mi ventana
        JFrame f = new JFrame("Layout Manager");
        f.setSize(400, 300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        
        // Contenedor de componentes
        Container cp = f.getContentPane();
        
        // Layout a utilizar
        FlowLayout fl = new FlowLayout(FlowLayout.RIGHT);
        GridLayout gl = new GridLayout(2, 3);
        BorderLayout bl = new BorderLayout();
        cp.setLayout(fl);
        
        // Componentes a nueva ventana
        JLabel etiqueta1 = new JLabel("Nombre:");
        JLabel etiqueta2 = new JLabel("---");
        JTextField texto = new JTextField(20);
        JButton boton = new JButton("Saludar");
        
        // Añado mis componentes a la ventana
        cp.add(etiqueta1, BorderLayout.NORTH);
        cp.add(texto, BorderLayout.SOUTH);
        cp.add(boton, BorderLayout.EAST);
        cp.add(etiqueta2, BorderLayout.WEST);
    }
}
