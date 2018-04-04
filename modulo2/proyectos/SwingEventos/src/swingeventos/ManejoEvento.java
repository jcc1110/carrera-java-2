package swingeventos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ManejoEvento implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("¡Hola mundo!");
    }
}
