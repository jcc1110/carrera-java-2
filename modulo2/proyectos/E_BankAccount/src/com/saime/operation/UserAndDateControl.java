package com.saime.operation;
import java.time.LocalDate;
import com.saime.structures.I_UserAndDate;

public class UserAndDateControl implements I_UserAndDate {
    // Atributos
    private String UserName;
    
    @Override
    public String getMessageForUser() {
        // Variables necesarias
        String message;
        LocalDate currentDate;
        
        // Obteniendo la fecha actual
        currentDate = LocalDate.now();
        
        // Formateando el mensaje
        message = "Hola, " + this.getUserName() + ". ";
        message += "Hoy es: " + currentDate;
        
        // Devolviendo el mensaje formateado
        return message.toUpperCase();        
    }

    // Métodos get y set
    public String getUserName() {
        return UserName;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }
}
