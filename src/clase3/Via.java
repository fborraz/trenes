package clase3;

import clase1.Tren;
//import clase2_AbstractFactory_FactoryMethod.Station;
import clase5.IEstacion;

public class Via implements Conection {
	double longitud;
	Conection conexionDestino;
	
	public Via(double l, IEstacion e) {
		longitud = l;
		conexionDestino = e;
	}
	
	public Via(double l) {
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
	
	
	//Cambie el tipo de retorno Estacion a Conexion
	public Conection getConexionDestino() {
		return conexionDestino;
	}
	public void enViaje(Tren t) {
		if(getConexionDestino() == null) {
			System.out.println("Pasando por la vía. Longitud: " + getLongitud());
		
		}
		else {
			System.out.println("Pasando por la vía. Longitud: " + getLongitud());
			getConexionDestino().llegaUnTren(t);
		}
	}

	@Override
	public void llegaUnTren(Tren t) {
		getConexionDestino().llegaUnTren(t);
	}
}
