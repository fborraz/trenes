package clase1;

import java.util.Random;


public class VagonDePasajero extends Vagon{
	private int cantidadAsientos;
	private int cantidadDePasajeros = 0;
	
	public VagonDePasajero() {
	}
	public VagonDePasajero(String color, int capacidad) {
		Random random = new Random();
		setColor(color);
		setCantidadAsientos(capacidad);
		cantidadDePasajeros = random.nextInt(capacidad);
		
		
	}
	
	public void enganchar(Enganchable e) {
		super.enganchar(e);
		System.out.println("Enganchando un vagon de pasajeros con capacidad para (" + getCantidadAsientos() + ") personas.");
	}
	
	@Override
	public Vagon clonar() {
		return new VagonDePasajero(this.getColor(), this.getCantidadAsientos());
	}
	
	public void subo() {
		cantidadDePasajeros++;
		System.out.println("En el vagón hay ("+ getCantidadDePasajeros() +") pasajeros.");
	}
	
	public void setCantidadAsientos(int cantidadAsientos) {
		this.cantidadAsientos = cantidadAsientos;
	}
	
	public int getCantidadAsientos() {
		return cantidadAsientos;
	}
	
	public void setCantidadDePasajeros(int cantidadDePasajeros) {
		this.cantidadDePasajeros = cantidadDePasajeros;
	}
	
	public int getCantidadDePasajeros() {
		return cantidadDePasajeros;
	}
	
	public void ToString() {
		if(getSiguienteEnganchable() != null) {
			System.out.println("Vagón de pasajeros con capacidad para (" + getCantidadAsientos() + ") personas.");
			System.out.println("");
			getSiguienteEnganchable().ToString();
		}
		else if (getSiguienteEnganchable() == null) {
			System.out.println("Vagón de pasajeros con capacidad para (" + getCantidadAsientos() + ") personas.");
			System.out.println("");
		}
	}
}


















//@Override
//public void desenganchar() {
//	if(getSiguienteEnganchable() != null) {
//		getSiguienteEnganchable().desenganchar();
//		
//	}
//	else if (getSiguienteEnganchable() == null) {
//		desenganchar();
//	}
//}



//en una superclase se almacenan todos los estados que tengan en comun las clases hijas
//una interface es como una clase que no tiene estado n comportamiento