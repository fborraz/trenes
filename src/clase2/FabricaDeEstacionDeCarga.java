package clase2_AbstractFactory_FactoryMethod;

import clase5.*;


import java.util.Scanner;
import java.util.Random;

public class FabricaDeEstacionDeCarga extends FabricaDeEstacion{
	
	static Scanner teclado = new Scanner(System.in);
	
	public IEstacion crearEstacion() {
		
		String nomEstacion = null;
		System.out.println("");
		System.out.println("---------------------------------");
		System.out.println("Elija estacion\n"
					     + "1- Berazategui\n"
					     + "2- Quilmes\n"
					     + "3- Plátanos\n"
					     + "4- Ezpeleta");
		System.out.println("---------------------------------");
		System.out.println("");
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
					accion = new PrepararGruas(accion);
				}
				
				if (c == 2) {
					accion = new PrepararTolvas(accion);
				}
			
			anden = new AndenDeCarga(i+1, accion);
			
			estacion.agregarAnden(anden);
		}
		return estacion;
	}	
}






























/*package clase2_AbstractFactory_FactoryMethod;

import clase5.*;

import java.util.Scanner;
import java.util.Random;

public class FabricaDeEstacionDeCarga extends FabricaDeEstacion{
	
	static Scanner teclado = new Scanner(System.in);
	
	public IEstacion crearEstacion() {
		
		String nomEstacion = null;
		System.out.println("");
		System.out.println("---------------------------------");
		System.out.println("Elija estacion\n"
					     + "1- Berazategui\n"
					     + "2- Quilmes\n"
					     + "3- Plátanos\n"
					     + "4- Ezpeleta");
		System.out.println("---------------------------------");
		System.out.println("");
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
		System.out.println("");
		System.out.println("---------------------------------");
		System.out.println("Seleccione personal de carga");
		System.out.println("1- Daenerys Targaryen\n"
						 + "2- Jon Snow\n"
				         + "3- Eddard Stark\n"
				         + "4- Catelyn Stark");
		System.out.println("---------------------------------");
		System.out.println("");
		
		int opcionPersonalCarga = teclado.nextInt();
		String nombrePersonal = null;
		
		switch (opcionPersonalCarga) {
		case 1:
			nombrePersonal = "Daenerys Targaryen";
			break;
		case 2:
			nombrePersonal = "Jon Snow";
			break;
		case 3:
			nombrePersonal = "Eddard Stark";
			break;
		case 4:
			nombrePersonal = "Catelyn Stark";
			break;
		default:
			break;
		}
		
		estacion.agregarPersonal(new PersonalDeCarga(nombrePersonal));
		
		Anden anden;
		for (int i = 0; i < 10; i++) {
			
			Random random = new Random();
			int c = random.nextInt(3);
			Caracteristica accion = new CaracteristicaEnComun();
			
				if(c == 0) {
					accion = new EncenderLuces(accion);
				}
				
				if (c == 1) {
					accion = new PrepararGruas(accion);
				}
				
				if (c == 2) {
					accion = new PrepararTolvas(accion);
				}
			
			anden = new AndenDeCarga(i+1, accion);
			
			estacion.agregarAnden(anden);
		}
		return estacion;
	}	
}*/