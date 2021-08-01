package clase3;

import clase2_AbstractFactory_FactoryMethod.Station;
import clase5.IEstacion;

public class ConstructorDeEscenarioSencillo extends ConstructorDeEscenarioAbstracto{

	@Override
	public IEstacion construirEstacion(String nombre) {
		Station estacion = new Station(nombre);
		rFerroviaria.agregarEstacion(estacion);
		return estacion;
	}

	@Override
	public Conection construirConexion(double l, IEstacion/*Station*/ e) {
		return new Via(l, e);
		
	}

	@Override
	public Station construirEstacion() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
