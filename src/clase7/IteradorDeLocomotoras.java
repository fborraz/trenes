package clase7;

import clase1.Enganchable;
import clase1.Locomotora;
import clase1.Tren;
import clase1.Vagon;

public class IteradorDeLocomotoras implements Iterador{

	Enganchable primero, locomotoraActual, aux;
	
	
	public IteradorDeLocomotoras(Tren t) {
		primero = t.getLocomotora();
		locomotoraActual = primero;
	}
	
	@Override
	public void primero() {
		aux = primero;
		while(aux.getClass() != Locomotora.class) {
			aux = aux.getSiguienteEnganchable();
		}
		primero = aux;
		locomotoraActual = primero;
	}

	@Override
	public void siguiente() {
		if(locomotoraActual.getSiguienteEnganchable() instanceof Locomotora) {
			locomotoraActual = locomotoraActual.getSiguienteEnganchable();
		}
		else if(locomotoraActual.getSiguienteEnganchable() instanceof Vagon) {
			locomotoraActual = locomotoraActual.getSiguienteEnganchable();
			siguiente();
		}
		else if(locomotoraActual.getSiguienteEnganchable() == null) {
			locomotoraActual = null;
		}
	}

	@Override
	public boolean fin() {
		return locomotoraActual == null;
	}

	@Override
	public Iterable actual() {
		return locomotoraActual;
	}
}