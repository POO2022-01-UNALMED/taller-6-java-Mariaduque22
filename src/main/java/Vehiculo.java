package vehiculos;

public class Vehiculo {
	private String placa;
	private int puertas;
	private int peso;
	private String traccion;
	private Fabricante fabricante;
	private int velocidadMaxima;
	private String nombre;
	private int precio;
	
	//los voy a meter aquí
	static int cantidadVehiculos;
	static int cantidadCamionetas;
	static int cantidadAutomoviles;
	static int cantidadCamiones;
	
	
	public Vehiculo(String placa, int puertas, int velocidadMaxima, String nombre, int precio, int peso, String traccion, Fabricante fabricante) {

		this.placa = placa;
		this.precio = precio;
		this.peso = peso;
		this.velocidadMaxima = velocidadMaxima;
		this.nombre = nombre;
		this.traccion = traccion;
		this.puertas = puertas;
		this.fabricante = fabricante;
		
		if (Fabricante.vehiculosXFabricante.containsKey(fabricante)) {
			int n = Fabricante.vehiculosXFabricante.get(fabricante);
			Fabricante.vehiculosXFabricante.replace(fabricante, n+1);
		} else {
			Fabricante.vehiculosXFabricante.put(fabricante, 1);
		}
		
		
		Vehiculo.cantidadVehiculos++;
	}
	
	public static String vehiculosPorTipo() {
		return "Automoviles: " + Vehiculo.cantidadAutomoviles +
				"\nCamionetas: " + Vehiculo.cantidadCamionetas +
				"\nCamiones: " + Vehiculo.cantidadCamiones;
	}
	public String getPlaca() {
		return this.placa;
	}
	
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getPrecio() {
		return this.precio;
	}
	
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	public int getPeso() {
		return this.peso;
	}
	
	public void setPeso(int peso) {
		this.peso = peso;
	}
	
	public String getTraccion() {
		return this.traccion;
	}
	
	public void setTraccion(String traccion) {
		this.traccion = traccion;
	}
	public int getPuertas() {
		return this.puertas;
	}
	
	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}
	
	public Fabricante getFabricante() {
		return this.fabricante;
	}
	
	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}
	
	public static int getCantidadVehiculos() {
		return Vehiculo.cantidadVehiculos;
	}
	
	public static int setCantidadVehiculos(int cantidadVehiculos) {
		return Vehiculo.cantidadVehiculos = cantidadVehiculos;
	}
	public int getVelocidadMaxima() {
		return this.velocidadMaxima;
	}
	
	public void setVelocidadMaxima(int velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}
	
}
