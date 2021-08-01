package clase2_AbstractFactory_FactoryMethod;
import java.util.Scanner;

import clase1.VagonDeCarga;
import clase1.ITren;
import clase1.Locomotora;
import clase1.Vagon;

public class TrenDeCarga implements TrenAbstractFactory, ITren{
	static Scanner teclado = new Scanner(System.in);
	
	@Override
	public Locomotora crearLocomotora() {
		return new LocomotoraDiesel();
	}

	@Override
	public Vagon crearVagon() {
		System.out.println("");
		System.out.println("---------------------------------");
		System.out.println("Ingrese color del vagón de carga");
		System.out.println("1- Azul\n2- Rojo\n3-Amarillo");
		System.out.println("---------------------------------");
		System.out.println("");
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
		System.out.println("");
		System.out.println("---------------------------------");
		System.out.println("Ingrese el tipo de carga");
		System.out.println("1- Trigo\n"
					     + "2- Soja\n"
					     + "3- Piedra");
		System.out.println("---------------------------------");
		System.out.println("");
		
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
		
		return new VagonDeCarga(color,tipoCarga);
	}

	@Override
	public Maquinista crearMaquinista() {
		return new EspecialistaEnDiesel();
	}
	
	public  TrenDeCarga tipoDeTren() {
		return this;
	}
}
