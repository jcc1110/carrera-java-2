package structures;
import models.User;

public interface I_ATM {
    boolean validarUsuario(String tarjeta, String clave);
    int consultarSaldo(String tarjeta);
    void retirarMonto(String tarjeta, String monto);
    void depositarMonto(String tarjeta, String monto);
    void cambioClave (String tarjeta, String clave);
}
