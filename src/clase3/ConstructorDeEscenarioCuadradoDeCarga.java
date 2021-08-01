package clase3;
import clase2_AbstractFactory_FactoryMethod.*;


import clase2_AbstractFactory_FactoryMethod.Station;
import clase5.IEstacion;
public class ConstructorDeEscenarioCuadradoDeCarga extends ConstructorDeEscenarioAbstracto {

	@Override
	public IEstacion construirEstacion() {
		FabricaDeEstacionDeCarga fec = new FabricaDeEstacionDeCarga();
		IEstacion estacionDeCarga = fec.crearEstacion();
		rFerroviaria.agregarEstacion(estacionDeCarga);
		return estacionDeCarga;
	}

	
	@Override
	public Via construirConexion(double l, IEstacion e) {
		return new Via(l, e);
	}

	@Override
	public Station construirEstacion(String nombre) {
		// TODO Auto-generated method stub
		return null;
	}
}
