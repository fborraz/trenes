package clase3;

import clase1.Tren;
//import clase2_AbstractFactory_FactoryMethod.Station;
import clase5.IEstacion;

public class Tunel implements Conection{

	double longitud;
	Conection conexionDestino;
	
	public Tunel(double l, IEstacion e) {
		longitud = l;
		conexionDestino = e;
	}
	
	public Tunel(double l) {
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
	public void enViaje(Tren t) {
		if(getConexionDestino() == null) {
			System.out.println("Pasando por el túnel. Longitud: " + getLongitud());
		}
		else {
			System.out.println("Pasando por el túnel. Longitud: " + getLongitud());
			getConexionDestino().llegaUnTren(t);
		}
	}
	@Override
	public void llegaUnTren(Tren t) {
		getConexionDestino().llegaUnTren(t);
		
	}
	
}
