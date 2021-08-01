package clase5;

import java.util.Calendar;





//import clase1.Locomotora;
import clase1.Vagon;
import clase2_AbstractFactory_FactoryMethod.Anden;
import clase2_AbstractFactory_FactoryMethod.Personal;
import clase2_AbstractFactory_FactoryMethod.Station;
//import clase7.IteradorDeLocomotoras;
import clase7.IteradorDeVagones;
import clase7.Observado;
import clase7.Observador;
import clase8.PoliticaDePartida;

import clase8.UnoDeCada;
import clase9.Manejador;
import clase9.ManejadorDeProblemas;

import java.util.Scanner;

public class SupervisorDeEstacion extends Personal implements Observador{
	
	static Scanner teclado = new Scanner(System.in);
	
	Calendar calendario = Calendar.getInstance();
	int hora = calendario.get(Calendar.HOUR_OF_DAY);
	int minutos = calendario.get(Calendar.MINUTE);
	int segundos = calendario.get(Calendar.SECOND);
	
	Manejador manejadorDeProblemas;
	
	
	PoliticaDePartida politicaDePartida;//<-------Strategy
	IEstacion estacion;
	
	public SupervisorDeEstacion(String nombre) {
		setNombre(nombre);
	}
	
	public SupervisorDeEstacion(Station e) {      //
		estacion = e;							 //----->  Strategy
		politicaDePartida = new UnoDeCada();	//
	}
	
	public SupervisorDeEstacion(String nombre, IEstacion e) {
		setNombre(nombre);
		estacion = e;
		politicaDePartida = new UnoDeCada();
		//politicaDePartida = new PrimeroPasajeros();
	}
	
	public Anden siguienteTrenEnSalir() {
		return politicaDePartida.siguienteTrenEnSalir(estacion.getAndenes());
	}
	
	public void cambiarPolitica(PoliticaDePartida p) {
		politicaDePartida = p;
	}
	
	public void llegaUnTren(TrenFacade trenFacade) {
			
		//Mensaje al tren
		trenFacade.horaDeArribo(hora,minutos,segundos);
				
		//Mensaje al maquinista
		trenFacade.todoEnOrden();
				
		//Mensaje a la locomotora
		trenFacade.reportarEstado();
				
		
		/*IteradorDeLocomotoras iteradorDeLocomotoras = (IteradorDeLocomotoras) trenFacade.crearIteradorDeLocomotoras();
		do {
			Locomotora locomotora = (Locomotora)(iteradorDeLocomotoras.actual());
			locomotora.reportarEstado();
			iteradorDeLocomotoras.siguiente();
		} while (!iteradorDeLocomotoras.fin());*/
		
		IteradorDeVagones iterador = (IteradorDeVagones) trenFacade.crearIteradorDeVagones();
		do {
			Vagon vagon = (Vagon)(iterador.actual());
			vagon.reportarEstado();
			iterador.siguiente();
			}while(!iterador.fin());
	}
	
	@Override
	public void firmarEntrada() {
		System.out.println("Supervisor de estación (" + getNombre() +") llegando a trabajar.");
	}

	@Override
	public void actualizar(Observado o) {
		this.llegaUnTren(o.getTrenRecientementeLlegado());
	}
	
//	public void simularTrabajo(ManejadorDeProblemas manejadorDeProblemas) {
//		
//		System.out.println("Simular trabajo\n"
//				+ "1- Incendio en cesto\n"
//				+ "2- Incendio en frenos\n"
//				+ "3- Puertas atascadas\n"
//				+ "4- Disturbios\n"
//				+ "5- Pasajeros asomados\n"
//				+ "6- Pasajero desmayado\n"
//				+ "7- Pasajero mareado\n"
//				+ "8- Locomotora con pérdida\n"
//				+ "9- Finalizar");
//		
//		int opcionSimulacion = teclado.nextInt();
//		switch (opcionSimulacion) {
//		case 1:
//			
//			break;
//		case 2:
//					
//			break;
//		case 3:
//			
//			break;
//		case 4:
//			
//			break;
//		case 5:
//			
//			break;
//		case 6:
//			
//			break;
//		case 7:
//			
//			break;
//		case 8:
//			
//			break;
//		case 9:
//			
//	break;
//		default:
//			break;
//		}
//	}
	
	public void veoDisturbios() {
		
	}
}
