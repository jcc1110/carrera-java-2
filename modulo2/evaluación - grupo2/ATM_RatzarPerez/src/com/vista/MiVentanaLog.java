
package com.vista;

import com.controlador.MiControlador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import javax.swing.JDialog;

/**
 * Esta clase representa la ventana que permite visualizar 
 * las distindas registros que permiten auditar los procesos realizados por los usuarios en el sistema 
 * 
 * @author: Ratzar Zahir Perez Lopez
 * @version: Ver.03 30/03/2018
 * @see <a href =  "http://softrain.com.ve" /> Curso básico programacion Java 8
 * Evaluación - Cajero Automático
 * </a>
 * 
 */

public class MiVentanaLog extends JDialog implements ActionListener {
//public MiVentanaLog(java.awt.Frame parent, boolean modal) {
     // Variables declaration - do not modify                     
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration    
    private MiControlador miControlador;
    
    public MiVentanaLog(java.awt.Frame parent, boolean modal) {
//    public MiVentanaLog() {
//        super("Registro de Eventos del Sistema");
        super(parent, modal);
        setTitle("Registros de Eventos del Sistema");
        jScrollPane1 = new javax.swing.JScrollPane();
//        setSize(400, 330);
        setBounds(0, 0, 800, 400);
        jTextArea1 = new javax.swing.JTextArea();
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new javax.swing.OverlayLayout(getContentPane()));
        jTextArea1.setEditable(false);
        jTextArea1.setColumns(50);
        jTextArea1.setRows(20);
        jScrollPane1.setViewportView(jTextArea1);
        getContentPane().add(jScrollPane1);
          setLocationRelativeTo(null);
        pack();
    }

    
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    

    public void leerArchivoTxt(){
      File archivo = null;
      FileReader fr = null;
      BufferedReader br = null;

      try {
         archivo = new File ("log.txt");
         fr = new FileReader (archivo);
         br = new BufferedReader(fr);

         // Lectura del fichero
         String linea, miTexto ="";
         
         while((linea=br.readLine())!=null){
              miTexto += linea + "\n\n";
         }
            //System.out.println(linea);
       
        jTextArea1.setText(miTexto);
      }
      catch(Exception e){
         e.printStackTrace();
      }finally{
         try{
            if( null != fr ){
               fr.close();
            }
         }catch (Exception e2){
            e2.printStackTrace();
         }
      }
    }

//    public static void main(String args[]) {
//        MiVentanaLog miVentanaLog = new MiVentanaLog();
//        miVentanaLog.leerArchivoTxt();
//        miVentanaLog.setVisible(true);
//    }

    public void setCoordinador(MiControlador miControlador) {
        this.miControlador = miControlador;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

                  
}

    
    
    
    
    
    

