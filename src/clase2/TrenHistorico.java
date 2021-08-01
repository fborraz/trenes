package clase2_AbstractFactory_FactoryMethod;

import clase1.Locomotora;
import clase1.Vagon;

public class TrenHistorico implements TrenAbstractFactory{

	@Override
	public Locomotora crearLocomotora() {
		return new LocomotoraAVapor();
	}

	@Override
	public Vagon crearVagon() {
		return new VagonDePasajerosAntiguo();
	}

	@Override
	public Maquinista crearMaquinista() {
		return new MaquinistaJubilado();
	}
	
}
