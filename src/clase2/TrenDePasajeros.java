package clase2_AbstractFactory_FactoryMethod;
import java.util.Scanner;

import clase1.VagonDePasajero;
import clase1.ITren;
import clase1.Locomotora;
import clase1.Vagon;

public class TrenDePasajeros implements TrenAbstractFactory, ITren{

	static Scanner teclado = new Scanner(System.in);
	
	@Override
	public Locomotora crearLocomotora() {
		return new LocomotoraElectrica();
	}

	@Override
	public Vagon crearVagon() {
		System.out.println("Ingrese color del vagón de pasajeros");
		System.out.println("1- Azul\n2- Rojo\n3-Amarillo");
		int opColor = teclado.nextInt();
		String color = null;
		
		switch (opColor) {
		case 1:
			color = "Azul";
			break;
		case 2:
			color = "Rojo";
			break;
		case 3:
			color = "Amarillo";
			break;
		}
		
		System.out.println("Ingrese capacidad del vagón de pasajeros");
		System.out.println("");
		System.out.println("1- Capacidad para 5 personas\n"
						 + "2- Capacidad para 10 personas\n"
						 + "3- Capacidad para 20 personas\n"
						 + "4- Capacidad para 40 personas\n"
						 + "5- Capacidad para 80 personas");
		
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
		return new VagonDePasajero(color,capacidadVagon);
	}

	@Override
	public Maquinista crearMaquinista() {
		return new EspecialistaEnElectrica();
	}

	public TrenDePasajeros tipoDeTren() {
		return this;
	}
}