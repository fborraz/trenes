package clase2_AbstractFactory_FactoryMethod;
import java.util.Random;
import java.util.Scanner;

import clase5.ActivarPlataformasDeAscensoYDescenso;
import clase5.Caracteristica;
import clase5.CaracteristicaEnComun;
import clase5.EncenderCarteles;
import clase5.EncenderLuces;
import clase5.EstacionProxy;
//import clase5.EstacionProxy;
import clase5.IEstacion;
import clase5.SupervisorDeEstacion;
import clase7.Pasajero;

public class FabricaDeEstacionDePasajeros extends FabricaDeEstacion{

	static Scanner teclado = new Scanner(System.in);
	@Override
	public IEstacion crearEstacion() {
		String nomEstacion = null;
		
		System.out.println("Elija estacion\n"
				+ "1- Berazategui\n"
				+ "2- Quilmes\n"
				+ "3- Plátanos\n"
				+ "4- Ezpeleta");
		int opEstacion = teclado.nextInt();
		
		switch (opEstacion) {
		case 1:
			nomEstacion = "berazategui";
			break;
		case 2:
			nomEstacion = "quilmes";
			break;
		case 3:
			nomEstacion = "platanos";
			break;
		case 4:
			nomEstacion = "ezpeleta";
			break;
		}
		
		
		IEstacion estacion = new EstacionProxy();
		estacion.setNombreEstacion(nomEstacion);
		
		Pasajero pasajero;
		for (int i = 0; i < 30; i++) {
			pasajero = new Pasajero();
			estacion.agregarObservador(pasajero);
		}
		
		System.out.println("");
		System.out.println("Seleccione supervisor de estacion");
		System.out.println("----------------------------------------");
		System.out.println("1- Jose de San Martin\n"
						 + "2- Juan Manuel de Rosas\n"
						 + "3- Juan Domingo Perón\n"
						 + "4- Arturo Jauretche");
		System.out.println("----------------------------------------");
		System.out.println("");
		
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
		
		SupervisorDeEstacion supervisorDeEstacion = new SupervisorDeEstacion(nombreSupervisor, estacion);

		estacion.agregarPersonal(supervisorDeEstacion);
		estacion.agregarObservador(supervisorDeEstacion);
		
		Anden anden;
		for (int i = 0; i < 10; i++) {
			Random random = new Random();
			int c = random.nextInt(3);
			Caracteristica accion = new CaracteristicaEnComun();
			
				if(c == 0) {
					accion = new EncenderLuces(accion);
				}
				
				if (c == 1) {
					accion = new EncenderCarteles(accion);
				}
				
				if (c == 2) {
					accion = new ActivarPlataformasDeAscensoYDescenso(accion);
				}
			
			anden = new AndenDeCarga(i+1, accion);
			
			estacion.agregarAnden(anden);
		}
		return estacion;
	}
	
}




























//////////////////////////////////////////////////////////////////
//package clase2_AbstractFactory_FactoryMethod;
//import java.util.Scanner;
//
//import clase5.IEstacion;
//public class FabricaDeEstacionDePasajeros extends FabricaDeEstacion{
//
//	static Scanner teclado = new Scanner(System.in);
//	@Override
//	public IEstacion crearEstacion() {
//		System.out.println("Ingrese nombre de la estacion");
//		String nombreEstacion = teclado.next();
//		
//		Station estacion = new Station(nombreEstacion);
//		System.out.println("Ingrese nombre del personal de boleteria");
//		String nombrePersonal = teclado.next();  
//		System.out.println("Ingrese apellido del personal de boleteria");
//		String apellidoPersonal = teclado.next();
//		estacion.agregarPersonal(new PersonalDeBoleteria(nombrePersonal,apellidoPersonal));
//		Anden anden;
//		for (int i = 0; i < 10; i++) {
//			anden = new AndenDePasajeros(i+1);
//			estacion.agregarAnden(anden);
//		}
//		return estacion;
//	}
//	
//}























/*27/11   package clase2_AbstractFactory_FactoryMethod;
import java.util.Random;
import java.util.Scanner;

import clase5.ActivarPlataformasDeAscensoYDescenso;
import clase5.Caracteristica;
import clase5.CaracteristicaEnComun;
import clase5.EncenderCarteles;
import clase5.EncenderLuces;
import clase5.EstacionProxy;
//import clase5.EstacionProxy;
import clase5.IEstacion;

public class FabricaDeEstacionDePasajeros extends FabricaDeEstacion{

	static Scanner teclado = new Scanner(System.in);
	@Override
	public IEstacion crearEstacion() {
		String nomEstacion = null;
		
		System.out.println("Elija estacion\n1- Berazategui\n2- Quilmes\n3- Plátanos\n4- Ezpeleta");
		int opEstacion = teclado.nextInt();
		
		switch (opEstacion) {
		case 1:
			nomEstacion = "berazategui";
			break;
		case 2:
			nomEstacion = "quilmes";
			break;
		case 3:
			nomEstacion = "platanos";
			break;
		case 4:
			nomEstacion = "ezpeleta";
			break;
		}
		
		//IEstacion estacion = new EstacionProxy();
		IEstacion estacion = new Station();
		estacion.setNombreEstacion(nomEstacion);
		
		System.out.println("Seleccione personal de boleteria");
		System.out.println("1- Roger Murtaugh\n"
				         + "2- Martin Riggs\n"
				         + "3- Leo Getz\n"
				         + "4- Lorna Cole");
		
		int opcionPersonalBoleteria = teclado.nextInt();
		String nombrePersonal = null;
		
		switch (opcionPersonalBoleteria) {
		case 1:
			nombrePersonal = "Roger Murtaugh";
			break;
		case 2:
			nombrePersonal = "Martin Riggs";
			break;
		case 3:
			nombrePersonal = "Leo Getz";
			break;
		case 4:
			nombrePersonal = "Lorna Cole";
			break;
		default:
			break;
		}
		  
		estacion.agregarPersonal(new PersonalDeBoleteria(nombrePersonal));
		
		Anden anden;
		for (int i = 0; i < 10; i++) {
			Random random = new Random();
			int c = random.nextInt(3);
			Caracteristica accion = new CaracteristicaEnComun();
			
				if(c == 0) {
					accion = new EncenderLuces(accion);
				}
				
				if (c == 1) {
					accion = new EncenderCarteles(accion);
				}
				
				if (c == 2) {
					accion = new ActivarPlataformasDeAscensoYDescenso(accion);
				}
			
			anden = new AndenDeCarga(i+1, accion);
			
			estacion.agregarAnden(anden);
		}
		return estacion;
	}
	
}
*/