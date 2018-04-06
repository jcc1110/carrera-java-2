package structures;
import models.User;

public interface I_ATM {
    boolean validarUsuario(String tarjeta, String clave);
}
