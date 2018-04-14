package com.structures;
import com.models.User;

public interface I_Process {
    boolean validarUsuario(String tarjeta, String clave);
    double saldo(String tarjeta);
    double depositar(String dep_sitar);
}
