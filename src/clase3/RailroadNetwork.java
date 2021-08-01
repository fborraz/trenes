package clase3;
import clase1.*;
import clase2_AbstractFactory_FactoryMethod.*;
import clase5.IEstacion;

import java.util.ArrayList;

public class RailroadNetwork {
	ArrayList<Tren> trenes = new ArrayList<Tren>();
	ArrayList<IEstacion> estaciones = new ArrayList<IEstacion>();
	
	static RailroadNetwork unicaRed = null;
	
	private RailroadNetwork() {}

	public void agregarTren(Tren t) {
		trenes.add(t);
	}
	
	public void agregarEstacion(Station e) {
		estaciones.add(e);
	}
	
	public void agregarEstacion(IEstacion e) {
		estaciones.add(e);
	}
	
	public static RailroadNetwork getInstance() {
		if(unicaRed == null) {
			unicaRed = new RailroadNetwork();
		}
		return unicaRed;
	}
	
	public void asignarTrenAEstaciones(Tren t) {
		for (IEstacion estacion : estaciones) {
			estacion.asignarTren(t);
		}
	}
	
	public IEstacion getEstacion(String nombre) {
		for (IEstacion estacion : estaciones) {
			if (estacion.getNombreEstacion().equals(nombre)) {
				return estacion;
			}
		}
		return null;
	}
	
}
