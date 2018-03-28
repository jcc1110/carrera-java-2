package claseabstracta;

public class AccesoDatosOracle extends BaseDeDatos {
    @Override
    public boolean conectar() {
        return true;
    }

    @Override
    public String consultar(String sql) {
        super.usuario = "guest";
        super.clave = "guest";
        return "Consulta de Oracle: " + sql + " " + super.usuario + " " + super.clave;
    }

    @Override
    public boolean desconectar() {
        return true;
    }
}
