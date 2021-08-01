package clase5;

import clase1.Locomotora;
import clase1.Tren;
import clase1.Vagon;
import clase1.VagonDePasajero;
import clase2_AbstractFactory_FactoryMethod.Maquinista;
import clase3.Motor;
import clase7.Iterador;
import clase7.IteradorDeVagones;

public class TrenFacade{
	Tren tren;
	Locomotora primerLocomotora;
	Motor motor;
	Maquinista maquinista;
	Vagon primerVagon;
	
	public TrenFacade(Tren t) {
		tren = t;
		primerLocomotora = tren.getLocomotora();
		motor = primerLocomotora.getMotor();
		maquinista = primerLocomotora.getMaquinista();
		primerVagon = (Vagon) primerLocomotora.getPrimerEnganchable();
		
	}
	
//	public void horaDeArribo(String hora, ) {
//		tren.horaDeArribo(hora);
//	}
	
	public void todoEnOrden() {
		maquinista.todoEnOrden();
	}
	
	public void reportarProblemas() {
		//primerVagon.reportarProblemas();
		IteradorDeVagones iterador = new IteradorDeVagones(tren);
		do {
			Vagon vagon = (Vagon)(iterador.actual());
			vagon.reportarProblemas();
			iterador.siguiente();
			}while(!iterador.fin());
	}
	
	//Facade
	public void reportarEstado() {
		primerLocomotora.reportarEstado();
	}
	
	//Facade
	public void existenFallas() {
		maquinista.existenFallas();
	}

	//Facade
	public void revisarFrenos() {
		IteradorDeVagones iterador = new IteradorDeVagones(tren);
		do {
			Vagon vagon = (Vagon)(iterador.actual());
			vagon.revisarFrenos();
			iterador.siguiente();
			}while(!iterador.fin());
	}

	public void hacerRevision() {
		motor.hacerRevision();
	}

	public void recargarCombustible() {
		primerLocomotora.recargarCombustible();
	}

	public Iterador crearIteradorDeVagones() {
		return tren.crearIteradorDeVagones();	
	}
	
	public Iterador crearIteradorDeLocomotoras() {
		return tren.crearIteradorDeLocomotoras();
	}
	
	public void realizarRecorrido() {
		tren.realizarRecorrido();
	}
	public void ToString() {
		tren.ToString();
	}

	public void horaDeArribo(int hora, int minutos, int segundos) {
		tren.horaDeArribo(hora,minutos,segundos);
	}
	
	public void subo() {
		VagonDePasajero vagonMasVacio = (VagonDePasajero)primerVagon;
		IteradorDeVagones iterador = (IteradorDeVagones) tren.crearIteradorDeVagones();
		do {
			Vagon vagon = (Vagon)(iterador.actual());
			if (((VagonDePasajero) vagon).getCantidadDePasajeros() < vagonMasVacio.getCantidadDePasajeros()) {
				vagonMasVacio = ((VagonDePasajero) vagon);
			}
			iterador.siguiente();
			}while(!iterador.fin());
		vagonMasVacio.subo();
		
	}	
}