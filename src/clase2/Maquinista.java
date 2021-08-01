package clase2_AbstractFactory_FactoryMethod;

import clase1.Locomotora;
import java.util.Scanner;

public class Maquinista {
	
	static Scanner teclado = new Scanner(System.in);
	private String nombre;
	
	public Maquinista() {}
	
	public Maquinista(String nombre) {
		setNombre(nombre);
	}
	
	public void estoyListo() {
		System.out.println("El maquinista " + getNombre() + " preparado para llevar el tren a destino");
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void todoEnOrden() {
		System.out.println("Todo en orden");
	}
	
	public void existenFallas() {
		System.out.println("Existen fallas");
	}
	
	public void manejar(Locomotora locomotora) {		
		System.out.println("Interfaz de manejo de locomotora\n"
						 + "1- Encender\n"
						 + "2- Apagar\n"
						 + "3- Acelerar\n"
						 + "4- Desacelerar\n"
						 + "5- Frenar\n"
						 + "6- Arreglar motor\n"
						 + "7- Terminar");
		System.out.println("");
		System.out.println("Ingrese opcion");
		
		boolean fin = false;
		
		
		
		while(fin == false) {
			int opcion = teclado.nextInt();
			System.out.println("\nEl estado del Motor es: "+locomotora.getMotor().getEstadoDelMotor()+"\n");
			switch (opcion) {
				case 1:
					System.out.println("Encendiendo locomotora");
					locomotora.encender();
					break;
				case 2:
					System.out.println("Apagando locomotora");
					locomotora.apagar();
					break;
				case 3:
					System.out.println("Acelerando locomotora");
					locomotora.acelerar();
					break;
				case 4:
					System.out.println("Desacelerando locomotora");
					locomotora.desacelerar();
					break;
				case 5:
					System.out.println("Frenando locomotora");
					locomotora.frenar();
					break;
				case 6:
					System.out.println("Arreglando locomotora");
					locomotora.arreglar();
					break;
				case 7:
					System.out.println("Terminar simulacion de manejo");
					fin = true;
					break;
				default:
					break;
			}
		}
		
	}
}



