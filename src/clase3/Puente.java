package clase3;

import clase1.Tren;
//import clase2_AbstractFactory_FactoryMethod.Station;
import clase5.IEstacion;

public class Puente implements Conection {
	double longitud;
	Conection conexionDestino;
	
	public Puente(double l, IEstacion e) {
		longitud = l;
		conexionDestino = e;
	}
	
	public Puente(double l) {
		longitud = l;
	}
	
	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}
	
	public double getLongitud() {
		return longitud;
	}
	
	public void setConexionDestino(Conection conexionDestino) {
		this.conexionDestino = conexionDestino;
	}
	
	public Conection getConexionDestino() {
		return conexionDestino;
	}

	@Override
	public void enViaje(Tren t) {
		if(getConexionDestino() == null) {
			System.out.println("Pasando por el puente. Longitud: " + getLongitud());
		
		}
		else {
			System.out.println("Pasando por el puente. Longitud: " + getLongitud());
			getConexionDestino().llegaUnTren(t);
		}
		
		
		//System.out.println("Pasando por el puente. Longitud: " + getLongitud());
		//getConexionDestino().llegaUnTren(t);
	}

	@Override
	public void llegaUnTren(Tren t) {
		getConexionDestino().llegaUnTren(t);
		
	}
}
