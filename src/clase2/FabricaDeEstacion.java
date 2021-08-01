package clase2_AbstractFactory_FactoryMethod;

import clase5.IEstacion;

public abstract class FabricaDeEstacion {
	
	public static IEstacion crearEstacion(int cualEstacion) {	
		FabricaDeEstacion fabricaDeEstaciones = null;
		
		switch (cualEstacion) {
		case 1:
			fabricaDeEstaciones = new FabricaDeEstacionDePasajeros();
			break;
		case 2: 
			fabricaDeEstaciones = new FabricaDeEstacionDeCarga();	
			break;
		case 3:
			fabricaDeEstaciones = new FabricaDeEstacionHistorica();
			break;
		default:
			break;
		}
		return fabricaDeEstaciones.crearEstacion();	
	}
	public abstract IEstacion crearEstacion();
}
