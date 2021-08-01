package clase7;

import clase5.TrenFacade;

public class Pasajero implements Observador{

	public void llegaUnTren(TrenFacade tFacade) {
		tFacade.subo();
	}
	
	@Override
	public void actualizar(Observado o) {
		this.llegaUnTren(o.getTrenRecientementeLlegado());
	}
}
