package clase3;

import clase2_AbstractFactory_FactoryMethod.*;
import clase5.IEstacion;

public class ConstructorDeEscenarioCuadradoDePasajeros extends ConstructorDeEscenarioAbstracto{

	@Override
	public IEstacion construirEstacion() {
		FabricaDeEstacionDePasajeros fep = new FabricaDeEstacionDePasajeros();
		IEstacion estacionDePasajeros = fep.crearEstacion();
		rFerroviaria.agregarEstacion(estacionDePasajeros);
		return estacionDePasajeros;
	}

	@Override
	public Puente construirConexion(double l, /*Station*/IEstacion e) {
		return new Puente(l, e);
	}

	@Override
	public Station construirEstacion(String nombre) {
		// TODO Auto-generated method stub
		return null;
	}
}
