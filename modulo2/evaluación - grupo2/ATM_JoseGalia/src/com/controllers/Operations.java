package com.controllers;

import com.models.DataAccessUser;
import com.models.Users;
import com.structures.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;



public class Operations extends A_Process implements I_Process {
    private String nombre;
    //Utilizo el objeto PrintWriter y FileWriter            
    PrintWriter salida;

    //Se utiliza el objeto BufferedRead y FileReader
    BufferedReader entrada;

    // Instancia de las clases necesarias
    DataAccessUser bd = new DataAccessUser();
    Users usuario = new Users();
    
    @Override
    public void RegisterLog(Users u) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean ValidateUser(String user, String pass) {
        
        // Estableciendo los valores
        usuario.setTarjeta(user);
        usuario.setClave(pass);
        
        
        // Se valida al Usuario
        return bd.ValidateUser(usuario);         
    }
    

    public double consultar(String tarjeta) {
        

        DataAccessUser bd = new DataAccessUser(); 
        Users usuario  = new Users(); 
        usuario.setTarjeta(tarjeta); 
        return bd.consultar(usuario); 

        
        //JOptionPane.showMessageDialog(null, "El saldo del Cliente es: "+bd.GetBalanceUser(usuario));
       
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public boolean validar(String tarjeta, String clave) {
        DataAccessUser ba  = new DataAccessUser(); 
        Users usuario = new Users(); 
        usuario.setTarjeta(tarjeta); 
        usuario.setClave(clave);
        
        return ba.ValidateUser(usuario); 
    }
    
    public boolean depositar( double saldo) {
     
        DataAccessUser bd = new DataAccessUser(); 
        Users usuario  = new Users(); 
        //usuario.setTarjeta(tarjeta); 
        usuario.setSaldo(saldo);
        return bd.depositar(usuario);
}
   // public boolean retiro ( double saldo){ 
     //   DataAccessUser bd = new DataAccessUser(); 
      //  Users usuario = new Users(); 
        //usuario.setTarjeta(tarjeta); 
      //  usuario.setSaldo(saldo);
       // return bd.(usuario); 
   // }
    
    @Override
    public boolean Deposit(Double amount) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean Retirement(Double amount) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean KeyChange(Users u, String newpass) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public void ReadFile(String path) {
        // Instancio mi clase
        File archivo = new File(path);
        try {
            
            entrada = new BufferedReader(new FileReader(archivo));
            
            // Leo la información del archivo
            String lectura;
            lectura = entrada.readLine();
            while (lectura != null) {
                System.out.println("Lectura: " + lectura);
                lectura = entrada.readLine();
            }
            
            // Cierro la conexión
            entrada.close();
        } catch (IOException ex) {
            // Capturando la excepción
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public double GetConsultar(String tarjeta) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}