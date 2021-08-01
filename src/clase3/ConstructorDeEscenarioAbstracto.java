package clase3;

//import clase2_AbstractFactory_FactoryMethod.Station;
import clase5.IEstacion;

public abstract class ConstructorDeEscenarioAbstracto {
	protected RailroadNetwork rFerroviaria;
	public void construirRedFerroviaria() {
		rFerroviaria = RailroadNetwork.getInstance();
	}
	
	public RailroadNetwork obtenerRedFerroviaria() {
		return rFerroviaria;
	}
	
	public abstract IEstacion construirEstacion(String nombre);
	public abstract IEstacion construirEstacion();
	public abstract Conection construirConexion(double l, IEstacion e);
	
}
