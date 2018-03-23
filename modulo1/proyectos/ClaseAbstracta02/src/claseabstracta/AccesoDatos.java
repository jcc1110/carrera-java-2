package claseabstracta;

public class AccesoDatos extends BaseDeDatos {

    @Override
    public boolean conectar() {
        return true;
    }

    @Override
    public String consultar(String sql) {
        return super.usuario +" "+ super.clave;
    }

    @Override
    public boolean desconectar() {
        return false;
    }
}
