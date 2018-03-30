package TiendaPelicula;

public abstract class Producto {

    public static int getDimesionArray() {
        return dimesionArray;
    }

    public static void setDimesionArray(int aDimesionArray) {
        dimesionArray = aDimesionArray;
    }

	// Attributes
	private String nombre;
	private double precioUnit;
	private int cantStock;
	private boolean disponible = false;
	private static int dimesionArray;

	// Constructors
	public Producto() {
	}

	public Producto(String nombre, double precioUnit, int cantStock,
			boolean disponible) {
		this.nombre = nombre;
		this.precioUnit = precioUnit;
		this.cantStock = cantStock;
		this.disponible = disponible;

		// Se obtiene con esta variable la dimensión del array.
                // Segun numero de instancias del constructor
                dimesionArray++;
	}

	// Methods
	@Override
	public String toString() {
		return "Nombre:"+ this.getNombre() + "\n" + "Precio unidad: "
				+ this.getPrecioUnit() + " a‚\n" + "En Stock: "
				+ this.getCantStock() + "\n";
	}
        // Get<==>Set
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecioUnit() {
        return precioUnit;
    }

    public void setPrecioUnit(double precioUnit) {
        this.precioUnit = precioUnit;
    }

    public int getCantStock() {
        return cantStock;
    }

    public void setCantStock(int cantStock) {
        this.cantStock = cantStock;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

}
	