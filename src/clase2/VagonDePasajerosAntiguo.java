package clase2_AbstractFactory_FactoryMethod;

import clase1.Vagon;

public class VagonDePasajerosAntiguo extends Vagon{

//	@Override
//	public void desenganchar() {
//		// TODO Auto-generated method stub
//		
//	}

	@Override
	public Vagon clonar() {
		return new VagonDePasajerosAntiguo();
	}

	@Override
	public void subo() {
		// TODO Auto-generated method stub
		
	}


}
