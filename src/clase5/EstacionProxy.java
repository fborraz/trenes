package clase5;
import java.util.Scanner;
import java.util.ArrayList;

import clase1.Tren;
import clase2_AbstractFactory_FactoryMethod.Anden;
import clase2_AbstractFactory_FactoryMethod.Personal;
import clase2_AbstractFactory_FactoryMethod.Station;
import clase3.Conection;
import clase3.TrenClonable;
import clase7.Observador;

public class EstacionProxy implements IEstacion{

	static Scanner teclado = new Scanner(System.in);
	
	private Station estacionReal = null;
	private String nombreEstacion;
	private Conection conexionDestino;
	
	private ArrayList<Observador> observadores = new ArrayList<Observador>();
	private ArrayList<Anden> andenes = new ArrayList<Anden>();
	private ArrayList<Personal> personal = new ArrayList<Personal>();
	
	@Override
	public void llegaUnTren(Tren t) {
		if(estacionReal == null) {
			estacionReal = new Station();
			for (Anden anden : andenes) {
				estacionReal.agregarAnden(anden);
			}
			for (Personal personal : personal) {
				//estacionReal.agregarPersonal(personal);
				estacionReal.agregarPersonal(personal);
			}
			for (Observador o : observadores) {
				estacionReal.agregarObservador(o);
			}
			
			estacionReal.agregarConexion(conexionDestino);
			estacionReal.setNombreEstacion(nombreEstacion);
		}
		estacionReal.llegaUnTren(t);
	}
	
	@Override
	public void agregarConexion(Conection c) {
		if(estacionReal == null) {
			conexionDestino = c;
		}
		else
			estacionReal.agregarConexion(c);	
	}
	
	@Override
	public void agregarAnden(Anden a) {
		if(estacionReal == null) {
			andenes.add(a);
		}
		else
			estacionReal.agregarAnden(a);
	}

	@Override
	public void agregarPersonal(Personal p) {
		if(estacionReal == null) {
			personal.add(p);
		}
		else
			estacionReal.agregarPersonal(p);
	}
	
	@Override
	public void agregarObservador(Observador o) {
		if(estacionReal == null) {
			observadores.add(o);
		}
		else
			estacionReal.agregarObservador(o);
	}

	@Override
	public void enViaje(Tren t) {
		
	}

	@Override
	public double getLongitud() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setNombreEstacion(String nomEstacion) {
		nombreEstacion = nomEstacion;
	}

	@Override
	public String getNombreEstacion() {
		return nombreEstacion;  
	}
	
	public void setConexionDestino(Conection conexionDestino) {
		this.conexionDestino = conexionDestino;
	}
	
	public Conection getConexionDestino() {
		return conexionDestino;
	}
	public SupervisorDeEstacion getSupervisorDeEstacion() {
		SupervisorDeEstacion supervisorDeEstacion = null;
		
		for (Personal p : personal) {
			if (p.getClass().equals(SupervisorDeEstacion.class)) {
				supervisorDeEstacion = (SupervisorDeEstacion) p;
			}
		}
		return supervisorDeEstacion;
	}
	
	public void saleUnTren(int numero) {
		for (Anden anden : andenes) {
			if(anden.getNumero() == numero) {
				anden.saleElTren();
			}
		}
	}
	
	public void asignarTren(TrenClonable t) {
		boolean hayTren = false;
		for (Anden a : andenes) {
			if(a.estaOcupado() != true && hayTren == false) {
				a.llegaUnTren((Tren)t.clonar());
				hayTren = true;		
			}
		}
	}
//Funciona	
//	public void partidaDelTren() {
//		System.out.println("¿De que anden saldrá el tren?");
//		int op = teclado.nextInt();
//		for (Anden anden : andenes) {
//			if(anden.getNumero() == op && anden.estaOcupado() == true) {
//				
//				System.out.println("Saliendo de la estacion " + getNombreEstacion() + ".");
//				
//				getConexionDestino().enViaje(anden.getTren());
//				anden.saleElTren();				
//				
//				//anden.setTren(null);
//			}
//			else if (anden.getNumero() == op && anden.estaOcupado() == false) {
//				System.out.println("El anden N° " + anden.getNumero() + " de la estacion " + getNombreEstacion() + " está desocupado.");
//			}
//		}
//	}
	public ArrayList<Anden> getAndenes() {
		return andenes;
	}
	
	public void partidaDelTren() {
//		 System.out.println("¿De que anden saldrá el tren?");
//		int op = teclado.nextInt();
		SupervisorDeEstacion s = null;
		
		for (Personal p : personal) {
			if (p.getClass().equals(SupervisorDeEstacion.class)) {
				s = (SupervisorDeEstacion) p;
			}
		}
		
		Anden anden = s.siguienteTrenEnSalir();
		
		System.out.println("Saliendo de la estacion " + getNombreEstacion() + ".");
		System.out.println("");
		anden.getTren().realizarRecorrido();
		anden.getTren().ToString();
		anden.getTren().getLocomotora().getMaquinista().manejar(anden.getTren().getLocomotora());
		getConexionDestino().enViaje(anden.getTren());
		anden.saleElTren();
		
		/*for (Anden anden : andenes) {
			if(anden.getNumero() == op && anden.estaOcupado() == true) {
				
				System.out.println("Saliendo de la estacion " + getNombreEstacion() + ".");
				
				getConexionDestino().enViaje(anden.getTren());
				anden.saleElTren();				
				
				//anden.setTren(null);
			}
			else if (anden.getNumero() == op && anden.estaOcupado() == false) {
				System.out.println("El anden N° " + anden.getNumero() + " de la estacion " + getNombreEstacion() + " está desocupado.");
			}
		}*/
	}
}