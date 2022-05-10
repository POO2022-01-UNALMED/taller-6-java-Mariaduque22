package vehiculos;

import java.util.Map.Entry;
import java.util.Hashtable;


public class Fabricante {
	private String nombre;
	private Pais pais;
	static Hashtable<Fabricante, Integer> vehiculosXFabricante = new Hashtable<Fabricante, Integer>();
	
	public Fabricante(String nombre, Pais pais) {
		this.nombre = nombre;
		this.pais = pais;
	}

	
	public static Fabricante fabricaMayorVentas() {
		int mayor = 0;
		Fabricante fabricaMayorVentas = null;
		for (Entry<Fabricante, Integer> entry : vehiculosXFabricante.entrySet()) {
			if (entry.getValue() > mayor) {
				mayor= entry.getValue();
				fabricaMayorVentas = entry.getKey();
			}
		}
		return fabricaMayorVentas;
	}
	
	public Pais getPais() {
		return this.pais;
	}
	
	public void setPais(Pais pais) {
		this.pais = pais;
	}
	public String getNombre() {
		return this.nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
