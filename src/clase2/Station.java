package clase2_AbstractFactory_FactoryMethod;

import java.util.ArrayList;
import java.util.Scanner;
import clase1.Tren;
import clase3.Conection;
import clase3.TrenClonable;
import clase5.IEstacion;
import clase5.Mecanico;
import clase5.PersonalDeSeguridad;
import clase5.SupervisorDeEstacion;
import clase5.TrenFacade;
import clase7.Observado;
import clase7.Observador;

public class Station implements Conection, IEstacion, Observado{
	
	static Scanner teclado = new Scanner(System.in);
	
	private ArrayList<Personal> personal = new ArrayList<Personal>();
	private ArrayList<Anden> andenes = new ArrayList<Anden>();
	private ArrayList<Observador> observadores = new ArrayList<Observador>();
	
	TrenFacade trenRecientementeLlegado;
	private String nombreEstacion;
	private Conection conexionDestino;
	
	
///////////////////////////////////////////CONSTRUCTORES////////////////////////////////////////	
	
	public Station() {
		
		
		System.out.println("------------------------------------------------------");
		System.out.println("¿Qué tipo de personal desea ingresar a la estación?\n"
						 + "1- Supervisor de estación\n"
						 + "2- Mecánico\n"
						 + "3- Personal de seguridad");
		System.out.println("------------------------------------------------------");
		
		int opcion = teclado.nextInt();
		
		while(opcion != 4) {
			if (opcion == 1) {
				
				
				System.out.println("Seleccione supervisor de estacion");
				System.out.println("----------------------------------------");
				System.out.println("1- Jose de San Martin\n"
								 + "2- Juan Manuel de Rosas\n"
								 + "3- Juan Domingo Perón\n"
								 + "4- Arturo Jauretche");
				
				int opcionSupervisor  = teclado.nextInt();
				
				String  nombreSupervisor = null;
				
				switch (opcionSupervisor) {
				case 1:
					nombreSupervisor = "Jose de San Martin";
					break;
				case 2:
					nombreSupervisor = "Juan Manuel de Rosas";
					break;
				case 3:
					nombreSupervisor = "Juan Domingo Perón";
					break;
				case 4:
					nombreSupervisor = "Arturo Jauretche";
					break;
				default:
					break;
				}
				
				SupervisorDeEstacion supervisorDeEstacion = new SupervisorDeEstacion(nombreSupervisor, this);
				
				personal.add(supervisorDeEstacion);
				observadores.add(supervisorDeEstacion);
				
				System.out.println("¿Qué tipo de personal desea ingresar a la estación?\n"
								 + "1- Supervisor de estación\n"
								 + "2- Mecánico\n"
								 + "3- Personal de seguridad\n"
								 + "4- Terminar con la carga de personal");
				
				opcion = teclado.nextInt();
			}
			else if (opcion == 2) {
				System.out.println("Seleccione mecánico");
				System.out.println("1- Silvio Marzolini\n"
								 + "2- Antonio Rattin\n"
								 + "3- Angel Clemente Rojas\n"
								 + "4- Natalio Pescia");
				
				int opcionMecanico = teclado.nextInt();
				String nombreMecanico = null;
				
				switch (opcionMecanico) {
				case 1:
					nombreMecanico = "Silvio Marzolini";
					break;
				case 2:
					nombreMecanico = "Antonio Rattin";
					break;
				case 3:
					nombreMecanico = "Angel Clemente Rojas";
					break;
				case 4:
					nombreMecanico = "Natalio Pescia";
					break;
				default:
					break;
				}
				
			
				Mecanico mecanico = new Mecanico(nombreMecanico);
				personal.add(mecanico);
				observadores.add(mecanico);
				System.out.println("------------------------------------------------------");
				System.out.println("¿Qué tipo de personal desea ingresar a la estación?\n"
								 + "1- Supervisor de estación\n"
								 + "2- Mecánico\n"
								 + "3- Personal de seguridad\n"
								 + "4- Terminar con la carga de personal");
				System.out.println("------------------------------------------------------");
				opcion = teclado.nextInt();
			}
			else if (opcion == 3) {
				System.out.println("------------------------------------------------------");
				System.out.println("Seleccione personal de seguridad");
				System.out.println("1- Arnold Schwarzenegger\n"
								 + "2- Jean Claude Van Damme\n"
								 + "3- Sylvester Stalone\n"
								 + "4- Chuck Norris");
				System.out.println("------------------------------------------------------");
				
				int opcionPersonalSeguridad= teclado.nextInt();
				String nombreSeguridad= null;
				
				switch (opcionPersonalSeguridad) {
				case 1:
					nombreSeguridad= "Arnold Schwarzenegger";
					break;
				case 2:
					nombreSeguridad = "Jean Claude Van Damme";
					break;
				case 3:	
					nombreSeguridad = "Sylvester Stalone";
					break;
				case 4:	
					nombreSeguridad = "Chuck Norris";
					break;
				default:
					break;
				}
				 
				PersonalDeSeguridad personalDeSeguridad = new PersonalDeSeguridad(nombreSeguridad);
				
				personal.add(personalDeSeguridad);
				observadores.add(personalDeSeguridad);
				System.out.println("------------------------------------------------------");
				System.out.println("¿Qué tipo de personal desea ingresar a la estación?\n"
								 + "1- Supervisor de estación\n"
								 + "2- Mecánico\n"
								 + "3- Personal de seguridad\n"
								 + "4- Terminar con la carga de personal");
				System.out.println("------------------------------------------------------");
				opcion = teclado.nextInt();
			}	
		}
	}
	
	public Station(String nombre) {
		nombreEstacion = nombre;
		
		System.out.println("¿Qué tipo de personal desea ingresar a la estación?\n"
					     + "1- Supervisor de estación\n"
					     + "2- Mecánico\n"
					     + "3- Personal de seguridad\n"
					     + "4- Terminar con la carga de personal");
		
		int opcion = teclado.nextInt();
		
		while(opcion != 4) {
			if (opcion == 1) {
			System.out.println("Opcion deshabilitada");
			System.out.println("¿Qué tipo de personal desea ingresar a la estación?\n"
					 + "1- Supervisor de estación\n"
					 + "2- Mecánico\n"
					 + "3- Personal de seguridad\n"
					 + "4- Terminar con la carga de personal");
	
			opcion = teclado.nextInt();
			

			}
			
			else if (opcion == 2) {
				System.out.println("Seleccione mecánico");
				
				int opcionMecanico = teclado.nextInt();
				String nombreMecanico = null;
				
				switch (opcionMecanico) {
				case 1:
					nombreMecanico = "Silvio Marzolini";
					break;
				case 2:
					nombreMecanico = "Antonio Rattin";
					break;
				case 3:
					nombreMecanico = "Angel Clemente Rojas";
					break;
				case 4:
					nombreMecanico = "Natalio Pescia";
					break;
				default:
					break;
				}
			
				Mecanico mecanico = new Mecanico(nombreMecanico);
				
				observadores.add(mecanico);
				personal.add(mecanico);
				
				System.out.println("¿Qué tipo de personal desea ingresar a la estación?\n"
								 + "1- Supervisor de estación\n"
								 + "2- Mecánico\n"
								 + "3- Personal de seguridad\n"
								 + "4- Terminar con la carga de personal");
				opcion = teclado.nextInt();
			}
			
			else if (opcion == 3) {
				System.out.println("Seleccione personal de seguridad");
				System.out.println("1- Arnold Schwarzenegger\n"
								 + "2- Jean Claude Van Damme\n"
								 + "3- Sylvester Stalone\n"
								 + "4- Chuck Norris");
				
				int opcionPersonalSeguridad= teclado.nextInt();
				String nombreSeguridad= null;
				
				switch (opcionPersonalSeguridad) {
				case 1:
					nombreSeguridad= "Arnold Schwarzenegger";
					break;
				case 2:
					nombreSeguridad = "Jean Claude Van Damme";
					break;
				case 3:	
					nombreSeguridad = "Sylvester Stalone";
					break;
				case 4:	
					nombreSeguridad = "Chuck Norris";
					break;
				default:
					break;
				}
				
				PersonalDeSeguridad personalDeSeguridad = new PersonalDeSeguridad(nombreSeguridad);
				
				observadores.add(personalDeSeguridad);
				personal.add(personalDeSeguridad);
				
				System.out.println("¿Qué tipo de personal desea ingresar a la estación)?\n"
								 + "1- Supervisor de estación\n"
								 + "2- Mecánico\n"
								 + "3- Personal de seguridad\n"
								 + "4- Terminar con la carga de personal");
				
				opcion = teclado.nextInt();
			}	
		}
	}
	
	public Station(Conection c) {
		conexionDestino = c;
	}
	
	public void llegaUnTren(Tren t) {
		boolean hayTren = false;
		for (Anden a : andenes) {
			if(a.estaOcupado() != true && hayTren == false) {
				System.out.println("El tren ha llegado a la estación");
				trenRecientementeLlegado = new TrenFacade(t);
				System.out.println("Llegando a la estacion: " + getNombreEstacion() + ". ");
				trenRecientementeLlegado.realizarRecorrido();
				trenRecientementeLlegado.ToString();
				this.notificar();
				a.llegaUnTren(t);
				hayTren = true;
			}			
		}
		hayTren = false;
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
	
	public void partidaDelTren() {

		SupervisorDeEstacion s = null;
		
		for (Personal p : personal) {
			if (p.getClass().equals(SupervisorDeEstacion.class)) {
				s = (SupervisorDeEstacion) p;
			}
		}
		
		Anden anden = s.siguienteTrenEnSalir();
		
		System.out.println("Saliendo de la estacion " + getNombreEstacion() + ".");
		System.out.println("");
		
		trenRecientementeLlegado.realizarRecorrido();
		trenRecientementeLlegado.ToString();
		
		anden.getTren().getLocomotora().getMaquinista().manejar(anden.getTren().getLocomotora());
		
		getConexionDestino().enViaje(anden.getTren());
		anden.saleElTren();
	}	
	
/////////////////////////////////////////////////////////////////////////////////////////////
	//METODOS PARA ALMACENAR EN ARRAYLIST
	
	public void agregarAnden(Anden a) {
		andenes.add(a);
	}
	
	public ArrayList<Anden> getAndenes() {
		return andenes;
	}
		
	@Override
	public void agregarConexion(Conection c) {
		//conexiones.add(c);
		conexionDestino = c;
	}

	public void agregarPersonal(Personal p) {
		personal.add(p);
		p.firmarEntrada();
	}
	
	
////////////////////////////////////////////////////////////////////////////////////////////	
	//METODOS SETTERS Y GETTERS
	
	public void setNombreEstacion(String nombreEstacion) {
		this.nombreEstacion = nombreEstacion;
	}
	
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
	
	public void setTrenRecientementeLlegado(TrenFacade trenRecientementeLlegado) {
		this.trenRecientementeLlegado = trenRecientementeLlegado;
	}
	
	public TrenFacade getTrenRecientementeLlegado() {
		return trenRecientementeLlegado;
	}
	//////////////////////////////////////////////////////////////////////
	
	
	@Override
	public void enViaje(Tren t) {
		// TODO Auto-generated method stub
	}
	
	@Override
	public double getLongitud() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void agregarObservador(Observador o) {
		observadores.add(o);
	}

	@Override
	public void quitarObservador(Observador o) {
		observadores.remove(o);
	}

	@Override
	public void notificar() {
		for (Observador o : observadores) {
			o.actualizar(this);
		}
	}
}







































//System.out.println("Seleccione supervisor de estacion");
//System.out.println("----------------------------------------");
//System.out.println("1- Jose de San Martin\n"
//				 + "2- Juan Manuel de Rosas\n"
//				 + "3- Juan Domingo Perón\n"
//				 + "4- Arturo Jauretche");
//
//int opcionSupervisor  = teclado.nextInt();
//
//String  nombreSupervisor = null;
//
//switch (opcionSupervisor) {
//case 1:
//	nombreSupervisor = "Jose de San Martin";
//	break;
//case 2:
//	nombreSupervisor = "Juan Manuel de Rosas";
//	break;
//case 3:
//	nombreSupervisor = "Juan Domingo Perón";
//	break;
//case 4:
//	nombreSupervisor = "Arturo Jauretche";
//	break;
//default:
//	break;
//}
//
//SupervisorDeEstacion supervisorDeEstacion = new SupervisorDeEstacion(nombreSupervisor, this);
//
//observadores.add(supervisorDeEstacion);
//personal.add(supervisorDeEstacion);
//
//System.out.println("¿Qué tipo de personal desea ingresar a la estación?\n"
//				 + "1- Supervisor de estación\n"
//				 + "2- Mecánico\n"
//				 + "3- Personal de seguridad\n"
//				 + "4- Terminar con la carga de personal");
//
//opcion = teclado.nextInt();
//
























///////////////////////////////////////////////////////////////////////////
//package clase2_AbstractFactory_FactoryMethod;
//
//import java.util.ArrayList;
//import java.util.Scanner;
//import clase1.Tren;
//import clase3.Conection;
//import clase3.TrenClonable;
//import clase5.IEstacion;
//import clase5.Mecanico;
//import clase5.PersonalDeSeguridad;
//import clase5.SupervisorDeEstacion;
//import clase5.TrenFacade;
//import clase7.Observado;
//import clase7.Observador;
//
//public class Station implements Conection, IEstacion, Observado{
//	
//	static Scanner teclado = new Scanner(System.in);
//	
//	private ArrayList<Personal> personal = new ArrayList<Personal>();
//	private ArrayList<Anden> andenes = new ArrayList<Anden>();
//	private ArrayList<Observador> observadores = new ArrayList<Observador>();
//	//private ArrayList<Conection> conexiones = new ArrayList<Conection>();
//	
//	
//	TrenFacade trenRecientementeLlegado;
//	private String nombreEstacion;
//	private Conection conexionDestino;
//	
//	
/////////////////////////////////////////////CONSTRUCTORES////////////////////////////////////////	
//	
//	public Station() {
//		System.out.println("¿Qué tipo de personal desea ingresar a la estación(" + getNombreEstacion() +")?\n1- Supervisor de estación\n2- Mecánico\n3- Personal de seguridad");
//		int opcion = teclado.nextInt();
//		
//		while(opcion != 4) {
//			if (opcion == 1) {
//				System.out.println("Ingrese nombre del supervisor de estación");
//				String nombreSupervisor = teclado.next();
//				
//				System.out.println("Ingrese apellido del supervisor de estación");
//				String apellidoSupervisor = teclado.next();
//				
//				SupervisorDeEstacion supervisorDeEstacion = new SupervisorDeEstacion(nombreSupervisor, apellidoSupervisor);
//				
//				personal.add(supervisorDeEstacion);
//				
//				System.out.println("¿Qué tipo de personal desea ingresar a la estación(" + getNombreEstacion() +")?\n1- Supervisor de estación\n2- Mecánico\n3- Personal de seguridad\n4- Terminar con la carga de personal");
//				opcion = teclado.nextInt();
//			}
//			else if (opcion == 2) {
//				System.out.println("Ingrese nombre del mecánico");
//				String nombreMecanico = teclado.next();
//				
//				System.out.println("Ingrese apellido del mecánico");
//				String apellidoMecanico = teclado.next();
//				
//				
//				Mecanico mecanico = new Mecanico(nombreMecanico, apellidoMecanico);
//				personal.add(mecanico);
//				
//				System.out.println("¿Qué tipo de personal desea ingresar a la estación(" + getNombreEstacion() +")?\n1- Supervisor de estación\n2- Mecánico\n3- Personal de seguridad\n4- Terminar con la carga de personal");
//				opcion = teclado.nextInt();
//			}
//			else if (opcion == 3) {
//				System.out.println("Ingrese nombre del personal de seguridad");
//				String nombreSeguridad = teclado.next();
//				
//				System.out.println("Ingrese apellido del personal de seguridad");
//				String apellidoSeguridad = teclado.next();
//				 
//				PersonalDeSeguridad personalDeSeguridad = new PersonalDeSeguridad(nombreSeguridad, apellidoSeguridad);
//				
//				personal.add(personalDeSeguridad);
//				
//				System.out.println("¿Qué tipo de personal desea ingresar a la estación(" + getNombreEstacion() +")?\n1- Supervisor de estación\n2- Mecánico\n3- Personal de seguridad\n4- Terminar con la carga de personal");
//				opcion = teclado.nextInt();
//			}	
//		}
//	}
//	
//	public Station(String nombre) {
//		nombreEstacion = nombre;
//		
//		System.out.println("¿Qué tipo de personal desea ingresar a la estación(" + getNombreEstacion() +")?\n1- Supervisor de estación\n2- Mecánico\n3- Personal de seguridad");
//		int opcion = teclado.nextInt();
//		
//		while(opcion != 4) {
//			if (opcion == 1) {
//				System.out.println("Ingrese nombre del supervisor de estación");
//				String nombreSupervisor = teclado.next();
//				
//				System.out.println("Ingrese apellido del supervisor de estación");
//				String apellidoSupervisor = teclado.next();
//				
//				SupervisorDeEstacion supervisorDeEstacion = new SupervisorDeEstacion(nombreSupervisor, apellidoSupervisor);
//				
//				personal.add(supervisorDeEstacion);
//				
//				System.out.println("¿Qué tipo de personal desea ingresar a la estación(" + getNombreEstacion() +")?\n1- Supervisor de estación\n2- Mecánico\n3- Personal de seguridad\n4- Terminar con la carga de personal");
//				opcion = teclado.nextInt();
//	
//			}
//			
//			else if (opcion == 2) {
//				System.out.println("Ingrese nombre del mecánico");
//				String nombreMecanico = teclado.next();
//				
//				System.out.println("Ingrese apellido del mecánico");
//				String apellidoMecanico = teclado.next();
//				
//				
//				Mecanico mecanico = new Mecanico(nombreMecanico, apellidoMecanico);
//				personal.add(mecanico);
//				
//				System.out.println("¿Qué tipo de personal desea ingresar a la estación(" + getNombreEstacion() +")?\n1- Supervisor de estación\n2- Mecánico\n3- Personal de seguridad\n4- Terminar con la carga de personal");
//				opcion = teclado.nextInt();
//			}
//			
//			else if (opcion == 3) {
//				System.out.println("Ingrese nombre del personal de seguridad");
//				String nombreSeguridad = teclado.next();
//				
//				System.out.println("Ingrese apellido del personal de seguridad");
//				String apellidoSeguridad = teclado.next();
//				 
//				PersonalDeSeguridad personalDeSeguridad = new PersonalDeSeguridad(nombreSeguridad, apellidoSeguridad);
//				
//				personal.add(personalDeSeguridad);
//				
//				System.out.println("¿Qué tipo de personal desea ingresar a la estación(" + getNombreEstacion() +")?\n1- Supervisor de estación\n2- Mecánico\n3- Personal de seguridad\n4- Terminar con la carga de personal");
//				opcion = teclado.nextInt();
//			}	
//		}
//	}
//	
//	public Station(Conection c) {
//		conexionDestino = c;
//	}
//	
//	public void llegaUnTren(Tren t) {
//		boolean hayTren = false;
//		for (Anden a : andenes) {
//			if(a.estaOcupado() != true && hayTren == false) {
//				//TrenFacade trenFacade = new TrenFacade(t);
//				System.out.println("El tren ha llegado a la estación");
//				trenRecientementeLlegado = new TrenFacade(t);
//				this.notificar();
//				
//				for (Personal p : personal) {
//					if(p.getClass().equals(SupervisorDeEstacion.class)) {
//						p.llegaUnTren(trenRecientementeLlegado);
//					}
//					else if (p.getClass().equals(Mecanico.class)) {
//						p.llegaUnTren(trenRecientementeLlegado);
//					}
//					else if (p.getClass().equals(PersonalDeSeguridad.class)) {
//						p.llegaUnTren(trenRecientementeLlegado);
//					}
//				}
//				
//				System.out.println("Llegando a la estacion: " + getNombreEstacion() + ". ");
//				a.llegaUnTren(t);
//				hayTren = true;
//			}			
//		}
//		hayTren = false;
//	}
//	
//	public void saleUnTren(int numero) {
//		for (Anden anden : andenes) {
//			if(anden.getNumero() == numero) {
//				anden.saleElTren();
//			}
//		}
//	}
//	
//	public void asignarTren(TrenClonable t) {
//		boolean hayTren = false;
//		for (Anden a : andenes) {
//			if(a.estaOcupado() != true && hayTren == false) {
//				a.llegaUnTren((Tren)t.clonar());
//				hayTren = true;		
//			}
//		}
//	}
//	
////	public void partidaDelTren() {
////		System.out.println("¿De que anden saldrá el tren?");
////		int op = teclado.nextInt();
////		for (Anden anden : andenes) {
////			if(anden.getNumero() == op && anden.estaOcupado() == true) {
////				
////				System.out.println("Saliendo de la estacion " + getNombreEstacion() + ".");
////				
////				getConexionDestino().enViaje(anden.getTren());
////				anden.saleElTren();				
////				
////				//anden.setTren(null);
////			}
////			else if (anden.getNumero() == op && anden.estaOcupado() == false) {
////				System.out.println("El anden N° " + anden.getNumero() + " de la estacion " + getNombreEstacion() + " está desocupado.");
////			}
////		}
////	}
//	
//	public void partidaDelTren() {
//		Anden anden;
//		
//		for (Personal p : personal) {
//			if(p.getClass().equals(SupervisorDeEstacion.class)) {
//				anden = ((SupervisorDeEstacion) p).siguienteTrenEnSalir();
//				System.out.println("Saliendo de la estacion " + getNombreEstacion() + ".");
//				getConexionDestino().enViaje(anden.getTren());
//				anden.saleElTren();
//			}
//		}
//	}
//	
///////////////////////////////////////////////////////////////////////////////////////////////
//	//METODOS PARA ALMACENAR EN ARRAYLIST
//	
//	public void agregarAnden(Anden a) {
//		andenes.add(a);
//	}
//	
//	public ArrayList<Anden> getAndenes() {
//		return andenes;
//	}
//		
//	@Override
//	public void agregarConexion(Conection c) {
//		//conexiones.add(c);
//		conexionDestino = c;
//	}
//
//	public void agregarPersonal(Personal p) {
//		personal.add(p);
//		p.firmarEntrada();
//	}
//	
//	
//////////////////////////////////////////////////////////////////////////////////////////////	
//	//METODOS SETTERS Y GETTERS
//	
//	public void setNombreEstacion(String nombreEstacion) {
//		this.nombreEstacion = nombreEstacion;
//	}
//	
//	public String getNombreEstacion() {
//		return nombreEstacion;
//	}	
//	
//	public void setConexionDestino(Conection conexionDestino) {
//		this.conexionDestino = conexionDestino;
//	}
//	
//	public Conection getConexionDestino() {
//		return conexionDestino;
//	}
//	
//	public void setTrenRecientementeLlegado(TrenFacade trenRecientementeLlegado) {
//		this.trenRecientementeLlegado = trenRecientementeLlegado;
//	}
//	
//	public TrenFacade getTrenRecientementeLlegado() {
//		return trenRecientementeLlegado;
//	}
//	//////////////////////////////////////////////////////////////////////
//		@Override
//	public void enViaje(Tren t) {
//		// TODO Auto-generated method stub
//	}
//	
//	@Override
//	public double getLongitud() {
//		// TODO Auto-generated method stub
//		return 0;
//	}
//
//	@Override
//	public void agregarObservador(Observador o) {
//		observadores.add(o);
//	}
//
//	@Override
//	public void quitarObservador(Observador o) {
//		observadores.remove(o);
//	}
//	
//	
//
//	@Override
//	public void notificar() {
//		for (Observador o : observadores) {
//			o.actualizar(this);
//		}
//	}
//}







//public void partidaDelTren() {
////	System.out.println("¿De que anden saldrá el tren?");
////	int op = teclado.nextInt();
//	SupervisorDeEstacion s = null;
//	
//	for (Personal p : personal) {
//		if (p.getClass().equals(SupervisorDeEstacion.class)) {
//			s = (SupervisorDeEstacion) p;
//		}
//	}
//	
//	Anden anden = s.siguienteTrenEnSalir();
//	
//	System.out.println("Saliendo de la estacion " + getNombreEstacion() + ".");
//	
//	getConexionDestino().enViaje(anden.getTren());
//	anden.saleElTren();
//	
//	/*for (Anden anden : andenes) {
//		if(anden.getNumero() == op && anden.estaOcupado() == true) {
//			
//			System.out.println("Saliendo de la estacion " + getNombreEstacion() + ".");
//			
//			getConexionDestino().enViaje(anden.getTren());
//			anden.saleElTren();				
//			
//			//anden.setTren(null);
//		}
//		else if (anden.getNumero() == op && anden.estaOcupado() == false) {
//			System.out.println("El anden N° " + anden.getNumero() + " de la estacion " + getNombreEstacion() + " está desocupado.");
//		}
//	}*/
//}
//
