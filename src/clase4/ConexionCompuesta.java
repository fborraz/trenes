package clase4;
import clase1.*;
import clase2_AbstractFactory_FactoryMethod.Station;
import clase3.*;
import java.util.ArrayList;

public class ConexionCompuesta implements Conection{

	
	ArrayList<Conection> hijos = new ArrayList<>();
	Conection conexionDestino;
	
	
	public void agregarHijo(Conection c) {
		hijos.add(c);
	}
	
	public ConexionCompuesta() {}
	
	public ConexionCompuesta(Station estacion) {
		setConexionDestino(estacion);
	}
	
	@Override
	public void enViaje(Tren t) {
		for(int i = 0; i < hijos.size(); i++) {
			hijos.get(i).enViaje(t);
		}
	}

	@Override
	public double getLongitud() {
		double longitudDeLaConexion = 0;
		for (Conection conexion : hijos) {
			longitudDeLaConexion += conexion.getLongitud();
		}
		return longitudDeLaConexion;
	}

	@Override
	public void llegaUnTren(Tren t) {
		// TODO Auto-generated method stub
		
	}
	
	public void setConexionDestino(Conection conexionDestino) {
		this.conexionDestino = conexionDestino;
	}
	
	public Conection getConexionDestino() {
		return conexionDestino;
	}
	
	
	
}
