package clase4;

import clase2_AbstractFactory_FactoryMethod.*;

import clase3.Conection;
import clase3.ConstructorDeEscenarioAbstracto;
import clase3.RailroadNetwork;
import clase5.IEstacion;

public class BuilderAdapter implements Builder{

	ConstructorDeEscenarioAbstracto constructor;
	
	 public BuilderAdapter(ConstructorDeEscenarioAbstracto constructorDeEscenarioAbstracto) {
		constructor = constructorDeEscenarioAbstracto;
	}
	 
	@Override
	public void buildRailroadNetwork() {
		constructor.construirRedFerroviaria();
	}

	@Override
	public Station buildStation(String name) {
		return (Station) constructor.construirEstacion(name);
	}

	@Override
	public Conection buildRailroadTrack(double distance, IEstacion s) {
		return constructor.construirConexion(distance, s);
	}
	
	@Override
	public RailroadNetwork getRailroadNetwork() {
		return constructor.obtenerRedFerroviaria();
	}
}
