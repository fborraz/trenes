package clase1;
import java.util.Scanner;


import clase2_AbstractFactory_FactoryMethod.*;
/*import clase2_AbstractFactory_FactoryMethod.LocomotoraAVapor;
import clase2_AbstractFactory_FactoryMethod.LocomotoraDiesel;
import clase2_AbstractFactory_FactoryMethod.LocomotoraElectrica;
import clase2_AbstractFactory_FactoryMethod.Maquinista;
import clase2_AbstractFactory_FactoryMethod.TrenAbstractFactory;
import clase2_AbstractFactory_FactoryMethod.TrenDeCarga;
import clase2_AbstractFactory_FactoryMethod.TrenDePasajeros;
import clase2_AbstractFactory_FactoryMethod.TrenHistorico;*/
import clase3.*;
import clase4.Builder;
import clase4.BuilderAdapter;
import clase4.RailroadNetworkDirector;
import clase5.IEstacion;
import clase8.PrimeroCarga;
import clase8.PrimeroHistoricos;
import clase8.PrimeroPasajeros;
import clase8.UnoDeCada;

public class Programa {

	static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args) {
				
		viajesDelTren();
	}
	
	public void menu() {
		System.out.println("Sistema de administración de trenes");
		System.out.println();
	}
	
	static Tren crearTren() {
		TrenAbstractFactory fabrica = null;
		System.out.println("---------------------------------------------");
		System.out.println("¿Que tipo de tren desea crear?");
		System.out.println("");
		System.out.println("1--> Tren de pasajeros");
		System.out.println("2--> Tren de carga");
		System.out.println("3--> Tren histórico");
		System.out.println("4--> Tren a medida");
		System.out.println("---------------------------------------------");
		System.out.println("");
		int opcion = teclado.nextInt();
		
		switch(opcion) {
			case 1:
				fabrica = new TrenDePasajeros();
				break;
			case 2: 
				fabrica = new TrenDeCarga();
				break;
			case 3:
				fabrica = new TrenHistorico();
				break;
			case 4:				
				return crearTrenAMedida();
		}
		
		Tren tren = new Tren();
		
		Maquinista maquinista = fabrica.crearMaquinista();
		System.out.println("--------------------------------------------------------------");
		System.out.println("Selecciones uno de los siguientes maquinistas registrados");
		System.out.println("1- Federico Borraz\n"
						 + "2- Niki Lauda\n"
						 + "3- Juan Manuel Fangio");
		System.out.println("--------------------------------------------------------------");
		
		int opcionMaquinista = teclado.nextInt();
		String nomMaquinista = null;
		
		switch (opcionMaquinista) {
		case 1:
			nomMaquinista = "Federico Borraz";
			break;
		case 2:
			nomMaquinista = "Niki Lauda";
			break;
		case 3:
			nomMaquinista = "Juan Manuel Fangio";
			break;
		default:
			break;
		}
		
		maquinista.setNombre(nomMaquinista);
		
		Locomotora locomotora = fabrica.crearLocomotora();
		System.out.println("---------------------------------------------");
		System.out.println("Ingrese numero de locomotora: ");
		System.out.println("---------------------------------------------");
		int numeroLocomotora = teclado.nextInt();
		Motor m = new Motor(); 
		locomotora.setNumero(numeroLocomotora);
		locomotora.setMaquinista(maquinista);
		locomotora.setMotor(m);
		
		tren.agregarEnganchable(locomotora);
		
		//Vagon vagon;
		for (int i = 0; i < 5; i++) {
			tren.agregarEnganchable(fabrica.crearVagon());
		}
		return tren;		
	}
	
	static Tren crearTrenAMedida() {
		Tren tren = new Tren();
		Locomotora locomotora = null;
		System.out.println("---------------------------------------------");
		System.out.println("¿Qué tipo de locomotora desea crear?");
		System.out.println("");
		System.out.println("1--> Locomotora electrica");
		System.out.println("2--> Locomotora diesel");
		System.out.println("3--> Locomotora a vapor");
		System.out.println("---------------------------------------------");
		
		int opcionLocomotora = teclado.nextInt();
		
		switch (opcionLocomotora) {
		case 1:
			locomotora = new LocomotoraElectrica();
			break;
		case 2:
			locomotora = new LocomotoraDiesel();
			break;
		case 3:
			locomotora = new LocomotoraAVapor();
			break;
		}
		System.out.println("---------------------------------------------");
		System.out.println("Ingrese numero de locomotora");
		System.out.println("---------------------------------------------");
		int numLocomotora = teclado.nextInt();
		locomotora.setNumero(numLocomotora);
		
		System.out.println("---------------------------------------------");
		System.out.println("Selecciones uno de los siguientes maquinistas registrados");
		System.out.println("1- Federico Borraz\n"
						 + "2- Niki Lauda\n"
						 + "3- Juan Manuel Fangio");
		System.out.println("---------------------------------------------");
		int opcionMaquinista = teclado.nextInt();
		String nomMaquinista = null;
		switch (opcionMaquinista) {
		case 1:
			nomMaquinista = "Federico Borraz";
			break;
		case 2:
			nomMaquinista = "Niki Lauda";
			break;
		case 3:
			nomMaquinista = "Juan Manuel Fangio";
			break;
		default:
			break;
		}
		Maquinista maquinista = new Maquinista(nomMaquinista);
		Motor m = new Motor();
		
		locomotora.setMaquinista(maquinista);
		locomotora.setMotor(m);
		
		tren.agregarEnganchable(locomotora);
		System.out.println("---------------------------------------------");
		System.out.println("¿Que desea hacer?");
		System.out.println("1- Crear vagon de pasajeros");
		System.out.println("2- Crear vagon de carga");
		System.out.println("3- Crear locomotora");
		System.out.println("4- Finalizar armado del tren");
		System.out.println("---------------------------------------------");
		int opcion = teclado.nextInt();
		
		while(opcion != 4) {
			if(opcion == 1) {
				VagonDePasajero vagonDePasajeros = new VagonDePasajero();
				System.out.println("---------------------------------------------");
				System.out.println("Ingrese color del vagon");
				System.out.println("");
				System.out.println("1- Azul\n"
								 + "2- Amarillo\n"
								 + "3- Gris\n"
								 + "4- Verde\n"
								 + "5- Negro\n"
								 + "6- Blanco");
				System.out.println("---------------------------------------------");
				System.out.println("");
				int opcionColor = teclado.nextInt();
				String colorVagon = null;
				switch (opcionColor) {
				case 1:
					colorVagon = "azul";
					break;
				case 2:
					colorVagon = "amarillo";    
					break;
				case 3:
					colorVagon = "gris";
					break;
				case 4:
					colorVagon = "verde";
					break;
				case 5:
					colorVagon = "negro";
					break;
				case 6:
					colorVagon = "blanco";
					break;
				default:
					break;
				}
				System.out.println("---------------------------------------------");
				System.out.println("Ingrese capacidad del vagon");
				System.out.println("1- Capacidad para 5 personas\n"
								 + "2- Capacidad para 10 personas\n"
								 + "3- Capacidad para 20 personas\n"
								 + "4- Capacidad para 40 personas\n"
								 + "5- Capacidad para 80 personas");
				System.out.println("---------------------------------------------");
				int opcionCapacidad = teclado.nextInt();
				int capacidadVagon = 0;
				
				switch (opcionCapacidad) {
				case 1:
					capacidadVagon = 5;
					break;
				case 2:
					capacidadVagon = 10;
					break;
				case 3:
					capacidadVagon = 20;
					break;
				case 4:
					capacidadVagon = 40;
					break;
				case 5:
					capacidadVagon = 80;
					break;
				default:
					break;
				}
				
				vagonDePasajeros.setColor(colorVagon);
				vagonDePasajeros.setCantidadAsientos(capacidadVagon);
				tren.agregarEnganchable(vagonDePasajeros);
				
				System.out.println("¿Que desea hacer?");
				System.out.println("1- Crear vagon de pasajeros");
				System.out.println("2- Crear vagon de carga");
				System.out.println("3- Crear locomotora");
				System.out.println("4- Finalizar armado del tren");
				System.out.println("5- Desenganchar");
				opcion = teclado.nextInt();
			}
			if (opcion == 2) {
				VagonDeCarga vagonDeCarga = new VagonDeCarga();
				System.out.println("---------------------------------------------");
				System.out.println("Ingrese color del vagon");
				System.out.println("---------------------------------------------");
				String colorVagon = teclado.next();
				System.out.println("---------------------------------------------");
				System.out.println("Ingrese el tipo de carga");
				System.out.println("1- Trigo\n2- Soja\n3- Piedra");
				System.out.println("---------------------------------------------");
				int opcionCarga = teclado.nextInt();
				String tipoCarga = null;
				
				switch (opcionCarga) {
				case 1:
					tipoCarga = "Trigo";
					break;
				case 2:
					tipoCarga = "Soja";
					break;
				case 3:
					tipoCarga = "Piedra";
					break;
				}
				
				vagonDeCarga.setColor(colorVagon);
				vagonDeCarga.setTipoCarga(tipoCarga);
				
				tren.agregarEnganchable(vagonDeCarga);
				System.out.println("---------------------------------------------");
				System.out.println("¿Que desea hacer?");
				System.out.println("1- Crear vagon de pasajeros");
				System.out.println("2- Crear vagon de carga");
				System.out.println("3- Crear locomotora");
				System.out.println("4- Finalizar armado del tren");
				System.out.println("---------------------------------------------");
				opcion = teclado.nextInt();
			}
			if (opcion == 3) {
				System.out.println("---------------------------------------------");
				System.out.println("¿Qué tipo de locomotora desea crear?");
				System.out.println("");
				System.out.println("1--> Locomotora electrica");
				System.out.println("2--> Locomotora diesel");
				System.out.println("3--> Locomotora a vapor");
				System.out.println("---------------------------------------------");
				opcionLocomotora = teclado.nextInt();
				
				switch (opcionLocomotora) {
				case 1:
					locomotora = new LocomotoraElectrica();
					break;
				case 2:
					locomotora = new LocomotoraDiesel();
					break;
				case 3:
					locomotora = new LocomotoraAVapor();
					break;
				}
				
				System.out.println("Ingrese numero de locomotora");
				numLocomotora = teclado.nextInt();
				locomotora.setNumero(numLocomotora);
	
				tren.agregarEnganchable(locomotora);
				System.out.println("---------------------------------------------");
				System.out.println("¿Que desea hacer?");
				System.out.println("1- Crear vagon de pasajeros");
				System.out.println("2- Crear vagon de carga");
				System.out.println("3- Crear locomotora");
				System.out.println("4- Finalizar armado del tren");
				System.out.println("---------------------------------------------");
				opcion = teclado.nextInt();
			}	
		}
		return tren;
	}
	
	static void TrenesEnMovimiento() {
		System.out.println("---------------------------------------------");
		System.out.println("Creación de estaciones");
		System.out.println("");
		System.out.println("1--> Crear estacion de pasajeros");
		System.out.println("2--> Crear estacion de carga");
		System.out.println("3--> Crear estacion historica");
		System.out.println("---------------------------------------------");
		int opcion = teclado.nextInt();
	
		IEstacion estacion = FabricaDeEstacion.crearEstacion(opcion);
		
		System.out.println("Simulación");
		System.out.println("");
		System.out.println("1- Llegada de un tren");
		System.out.println("2- Partida de un tren");
		System.out.println("3- Finalizar con la simulación");
		
		opcion = teclado.nextInt();
		
		while(opcion != 3) {
			if(opcion == 1) {
				Tren tren = crearTren();
				tren.realizarRecorrido();
				tren.ToString();
				estacion.llegaUnTren(tren);
				
				System.out.println("Simulación");
				System.out.println("");
				System.out.println("1- Llegada de un tren");
				System.out.println("2- Partida de un tren");
				System.out.println("3- Finalizar con la simulación");
				
				opcion = teclado.nextInt();
			}
			else if (opcion == 2) {
				System.out.println("¿De que anden desea que salga el tren?");
				int op = teclado.nextInt();
				estacion.saleUnTren(op);
				
				System.out.println("Simulación");
				System.out.println("");
				System.out.println("1- Llegada de un tren");
				System.out.println("2- Partida de un tren");
				System.out.println("3- Finalizar con la simulación");
				
				opcion = teclado.nextInt();
			}
		}
		System.out.println("Simulación finalizada");
		System.out.println("");
	}
	
	@SuppressWarnings("static-access")
	static void viajesDelTren() {
		ConstructorDeEscenarioAbstracto constructor = null;
		RailroadNetwork rFerroviaria = null;
		
		System.out.println("---------------------------------------------");
		System.out.println("Seleccione tipo de escenario\n"
						 + "1- Escenario de carga\n"
				         + "2- Escenario de pasajeros\n"
				         + "3- Escenario sencillo\n"
				         + "4- Viajes del tren con adapter");
		System.out.println("---------------------------------------------");
		
		int opcionEscenario = teclado.nextInt();
		switch (opcionEscenario) {
		case 1:
			constructor = new ConstructorDeEscenarioCuadradoDeCarga();
			break;
		case 2:
			constructor = new ConstructorDeEscenarioCuadradoDePasajeros();
			break;
		case 3: 
			constructor = new ConstructorDeEscenarioSencillo();
			break;
			
		default:
			break;
		}
		
		System.out.println("---------------------------------------------");
		System.out.println("Seleccione el tipo de red ferroviaria\n"
				         + "1- Red ferroviaria simple\n"
				         + "2- Red ferroviaria cuadrada\n"
				         + "3- Red ferroviaria compuesta ");
		System.out.println("---------------------------------------------");
		
		int opcionRed = teclado.nextInt();
		switch (opcionRed) {
		case 1:
			rFerroviaria = new DirectorDeEscenario().construirRedSimple(constructor);
			break;
		case 2:
			rFerroviaria = new DirectorDeEscenario().construirRedCuadrada(constructor);
			break;
		case 3:
			rFerroviaria = new DirectorDeEscenario().construirRedComposite(constructor);
			break;
		default:
			break;
		}
		System.out.println("---------------------------------------------");
		System.out.println("¿Cuantos trenes desea crear?");
		System.out.println("1- Un tren\n"
						 + "2- Dos trenes\n"
						 + "3- Tres trenes\n"
						 + "4- Cuatro trenes");
		System.out.println("---------------------------------------------");
		
		int opcionCantTrenes = teclado.nextInt();
		
		switch (opcionCantTrenes) {
		case 1:
			for (int i = 0; i < 1; i++) {
				Tren tren = crearTren();
				rFerroviaria.asignarTrenAEstaciones(tren);
			}
			break;
		case 2:
			for (int i = 0; i < 2; i++) {
				Tren tren = crearTren();
				rFerroviaria.asignarTrenAEstaciones(tren);
			}
			break;
		case 3:
			for (int i = 0; i < 3; i++) {
				Tren tren = crearTren();
				rFerroviaria.asignarTrenAEstaciones(tren);
			}
			break;
		case 4:
			for (int i = 0; i < 4; i++) {
				Tren tren = crearTren();
				rFerroviaria.asignarTrenAEstaciones(tren);
			}
			break;

		default:
			break;
		}
		
		System.out.println("---------------------------------------------");
		System.out.println("Simulación de viajes");
		System.out.println("1- Comenzar con la simulacion de viajes");
		System.out.println("2-Terminar con la simulacion de viajes");
		System.out.println("---------------------------------------------");
		
		int opSimulacion = teclado.nextInt();
		
		while(opSimulacion != 2) {
		
			System.out.println("¿De que estacion desea hacer salir el tren?");
			String opcion = teclado.next();
			IEstacion estacion = rFerroviaria.getEstacion(opcion);
			System.out.println("---------------------------------------------");
			System.out.println("¿Que politica de partida desea usar?\n"
							 + "1- Un tren de cada anden\n"
							 + "2- Primero los trenes de carga\n"
							 + "3- Primero los trenes de pasajeros\n"
							 + "4- Primero los trenes historicos");
			System.out.println("---------------------------------------------");
			
			int opcionPolitica = teclado.nextInt();
			switch (opcionPolitica) {
			case 1:
				estacion.getSupervisorDeEstacion().cambiarPolitica(new UnoDeCada());
				break;
			case 2:
				estacion.getSupervisorDeEstacion().cambiarPolitica(new PrimeroCarga());
				break;
			case 3:
				estacion.getSupervisorDeEstacion().cambiarPolitica(new PrimeroPasajeros());
				break;
			case 4:
				estacion.getSupervisorDeEstacion().cambiarPolitica(new PrimeroHistoricos());
			default:
				break;
			}
			
			estacion.partidaDelTren();
			System.out.println("---------------------------------------------");
			System.out.println("1- Seguir con la simulación");
			System.out.println("2- Terminar con la simulación");
			System.out.println("---------------------------------------------");
			opSimulacion = teclado.nextInt();
		}
		System.out.println("Simulacion terminada");
	}
	
	static RailroadNetwork crearEscenarioCuadrado() {
		
		RailroadNetwork redFerroviaria;
		
		System.out.println("---------------------------------------------");
		System.out.println("¿Que tipo de escenario cuadrado desea crear? ");
		System.out.println("1- Escenario cuadrado de carga");
		System.out.println("2- Escenario cuadrado de pasajeros");
		System.out.println("---------------------------------------------");
		
		int opcion = teclado.nextInt();
		switch (opcion) {
		case 1:
			ConstructorDeEscenarioAbstracto constructor = new ConstructorDeEscenarioCuadradoDeCarga();
			redFerroviaria = DirectorDeEscenario.construirRedCuadrada(constructor);
			return redFerroviaria;
		case 2:
			ConstructorDeEscenarioAbstracto constructor2 = new ConstructorDeEscenarioCuadradoDePasajeros();
			redFerroviaria = DirectorDeEscenario.construirRedCuadrada(constructor2);
			return redFerroviaria;
		case 3: 
			ConstructorDeEscenarioAbstracto constructor3 = new ConstructorDeEscenarioSencillo();
			redFerroviaria = DirectorDeEscenario.construirRedComposite(constructor3);
			return redFerroviaria;
		default:
			return null;
		}		
	}	
	
	static void recorridoCompuesto() {
		ConstructorDeEscenarioAbstracto constructor = new ConstructorDeEscenarioSencillo();
		RailroadNetwork rFerroviaria = DirectorDeEscenario.construirRedComposite(constructor);
		Tren tren = crearTren();
		rFerroviaria.asignarTrenAEstaciones(tren);
		System.out.println("-----------------------------------------");
		System.out.println("Simulación de viajes");
		System.out.println("1- Comenzar con la simulacion de viajes");
		System.out.println("2-Terminar con la simulacion de viajes");
		System.out.println("-----------------------------------------");
		
		int opSimulacion = teclado.nextInt();
		
		while(opSimulacion != 2) {
		
			System.out.println("¿De que estacion desea hacer salir el tren?");
			String opcion = teclado.next();
			
			IEstacion estacion = rFerroviaria.getEstacion(opcion);
			
			estacion.partidaDelTren();
			
			System.out.println("1- Seguir con la simulación");
			System.out.println("2- Terminar con la simulación");
			
			opSimulacion = teclado.nextInt();
		}
		
		System.out.println("Simulacion terminada");
	}
	
	static void viajesDelTrenConAdapter() {
		//Builder builder = new BuilderAdapter(new ConstructorDeEscenarioCuadradoDeCarga());
		Builder builder = new BuilderAdapter(new ConstructorDeEscenarioSencillo());
		String[] stations = {"La Plata", "Tolosa", "Ringuelet","Gonnet"};
		String[] connections = {  "0,1,30" , "1,2,45" , "2,3,21" , "3,0,18"  };
		
		RailroadNetwork rFerroviaria = RailroadNetworkDirector.buildRailRoadNetworkFromGraph(builder, stations, connections);
		
		Tren tren = crearTren();
		rFerroviaria.asignarTrenAEstaciones(tren);
		
		System.out.println("-----------------------------------------");
		System.out.println("Simulación de viajes");
		System.out.println("1- Comenzar con la simulacion de viajes");
		System.out.println("2-Terminar con la simulacion de viajes");
		System.out.println("-----------------------------------------");
		int opSimulacion = teclado.nextInt();
		
		while(opSimulacion != 2) {
		
			System.out.println("¿De que estacion desea hacer salir el tren?");
			String opcion = teclado.next();
			
			IEstacion estacion = rFerroviaria.getEstacion(opcion);
			
			estacion.partidaDelTren();
			
			System.out.println("1- Seguir con la simulación");
			System.out.println("2- Terminar con la simulación");
			
			opSimulacion = teclado.nextInt();
		}
		System.out.println("Simulacion terminada");
	}
}



















/*public class Programa {

	static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args) {
		Tren trenCreado = crearTren();
		trenCreado.ToString();
	}
	
	static Tren crearTren() {
		Tren tren = new Tren();
		Enganchable locomotora = new Locomotora();
		
		//System.out.println("Ingrese nombre del maquinista");
		
		//String nomMaquinista = teclado.next();
		
		//Maquinista maquinista = new Maquinista(nomMaquinista);
		
		
		System.out.println("Ingrese numero de locomotora");
		int numLocomotora = teclado.nextInt();
		((Locomotora) locomotora).setNumero(numLocomotora);
		//tren.setLocomotora(locomotora);
		tren.agregarEnganchable(locomotora);
		
		System.out.println("¿Que desea hacer?");
		System.out.println("1- Crear vagon de pasajeros");
		System.out.println("2- Crear vagon de carga");
		System.out.println("3- Crear locomotora");
		System.out.println("4- Finalizar armado del tren");
		System.out.println("5- Desenganchar");
		
		int opcion = teclado.nextInt();
		
		while(opcion != 4) {
			if(opcion == 1) {
				DePasajero vagonDePasajeros = new DePasajero();
				System.out.println("Ingrese color del vagon");
				String colorVagon = teclado.next();
				System.out.println("Ingrese capacidad del vagon");
				int capacidadVagon = teclado.nextInt();
				
				vagonDePasajeros.setColor(colorVagon);
				vagonDePasajeros.setCantidadAsientos(capacidadVagon);
				
				tren.agregarEnganchable(vagonDePasajeros);
				
				System.out.println("¿Que desea hacer?");
				System.out.println("1- Crear vagon de pasajeros");
				System.out.println("2- Crear vagon de carga");
				System.out.println("3- Crear locomotora");
				System.out.println("4- Finalizar armado del tren");
				System.out.println("5- Desenganchar");
				opcion = teclado.nextInt();
			}
			if (opcion == 2) {
				DeCarga vagonDeCarga = new DeCarga();
				System.out.println("Ingrese color del vagon");
				String colorVagon = teclado.next();
				System.out.println("Ingrese el tipo de carga");
				String tipoCarga = teclado.next();
				
				vagonDeCarga.setColor(colorVagon);
				vagonDeCarga.setTipoCarga(tipoCarga);
				
				tren.agregarEnganchable(vagonDeCarga);
				
				System.out.println("¿Que desea hacer?");
				System.out.println("1- Crear vagon de pasajeros");
				System.out.println("2- Crear vagon de carga");
				System.out.println("3- Crear locomotora");
				System.out.println("4- Finalizar armado del tren");
				System.out.println("5- Desenganchar");
				opcion = teclado.nextInt();
			}
			if (opcion == 3) {
				locomotora = new Locomotora();
				System.out.println("Ingrese numero de locomotora");
				numLocomotora = teclado.nextInt();
				((Locomotora) locomotora).setNumero(numLocomotora);
				tren.agregarEnganchable(locomotora);
				
				System.out.println("¿Que desea hacer?");
				System.out.println("1- Crear vagon de pasajeros");
				System.out.println("2- Crear vagon de carga");
				System.out.println("3- Crear locomotora");
				System.out.println("4- Finalizar armado del tren");
				System.out.println("5- Desenganchar");
				opcion = teclado.nextInt();
			}
			if (opcion == 5) {
				tren.desenganchar();
				
				System.out.println("¿Que desea hacer?");
				System.out.println("1- Crear vagon de pasajeros");
				System.out.println("2- Crear vagon de carga");
				System.out.println("3- Crear locomotora");
				System.out.println("4- Finalizar armado del tren");
				System.out.println("5- Desenganchar");
				
				opcion = teclado.nextInt();
			}
			
		}
		
		return tren;
		
	}

}
*/