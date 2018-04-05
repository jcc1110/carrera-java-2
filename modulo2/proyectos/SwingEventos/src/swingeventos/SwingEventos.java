package swingeventos;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class SwingEventos {
    public static void main(String[] args) {
        // Llamando a mi ventana
        JFrame f = new JFrame("Manejo de Eventos");
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
        
        // Implementación tradicional
        // boton.addActionListener(new ManejoEvento());
        
        // Implementación de la interfaz requerida
        ActionListener al = e -> {
            String mensaje;
            String valor = texto.getText();
            mensaje = (!valor.isEmpty()) ? "Hola " + valor : "Hola mundo";        
            JOptionPane.showMessageDialog(boton, mensaje);
        };
        boton.addActionListener(al);
        
        // Añado mis componentes a la ventana
        cp.add(etiqueta1, BorderLayout.NORTH);
        cp.add(texto, BorderLayout.SOUTH);
        cp.add(boton, BorderLayout.EAST);
        cp.add(etiqueta2, BorderLayout.WEST);
    }
}
