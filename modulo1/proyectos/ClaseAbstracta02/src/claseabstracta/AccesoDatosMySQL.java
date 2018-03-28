package claseabstracta;

public class AccesoDatosMySQL extends BaseDeDatos {

    @Override
    public boolean conectar() {
        return super.usuario == "admin" && super.clave == "12345";
    }

    @Override
    public String consultar(String sql) {
        return super.usuario +" "+ super.clave + " " + sql;
    }

    @Override
    public boolean desconectar() {
        return false;
    }
}
