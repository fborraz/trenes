package clase7;

import clase1.Enganchable;
import clase1.Locomotora;
import clase1.Tren;
import clase1.Vagon;

public class IteradorDeVagones implements Iterador {

	Enganchable primero;
	Enganchable vagonActual;
	Enganchable aux;

	public IteradorDeVagones (Tren t) {
		primero = t.getLocomotora().getPrimerEnganchable();
		vagonActual = primero;
	}

	@Override													//
	public void primero() {										//
		 aux = primero;								//
																//
//		if(aux.getSiguienteEnganchable() instanceof Vagon) {	//
//			vagonActual = primero;								//Busca el primer vagon de la formacion y lo setea como actual
//		}														//
		while(aux.getClass() != Vagon.class) {					//
			aux = aux.getSiguienteEnganchable();				//
		}														//				
		primero = aux;											//	
		vagonActual = primero;									//
	}

	@Override
	public void siguiente() {
		if (vagonActual.getSiguienteEnganchable() instanceof Vagon) {
			vagonActual = vagonActual.getSiguienteEnganchable();
		}
		else if(vagonActual.getSiguienteEnganchable() instanceof Locomotora) {
			vagonActual = vagonActual.getSiguienteEnganchable();
			siguiente();
		}
		else if (vagonActual instanceof Locomotora) {
			vagonActual = ((Locomotora) vagonActual).getPrimerEnganchable();
		}
		else if(vagonActual.getSiguienteEnganchable() == null) {
			vagonActual = null;
		}
		
		//Cuando el algoritmo detecta una locomotora, el valor de vagonActual no cambia
		//Entonces llama de forma permanente al siguiente enganchable del vagon actual
		
		
//		Enganchable aux2 = vagonActual;
//		
//		//while(aux2.getClass() != Vagon.class) {
//		while(aux2.getClass().equals(Vagon.class)) {
//			aux2 = vagonActual.getSiguienteEnganchable();
//		}
//		
//		vagonActual = aux2;
		
		
		
	}

	@Override
	public boolean fin() {
		return vagonActual == null;
	}
	

	@Override
	public Iterable actual() {
		return vagonActual;
	}
}
