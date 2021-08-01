package clase1;

import clase3.PrototipoClonable;
import clase7.Iterable;

public abstract class Vagon implements Enganchable, PrototipoClonable, Iterable{

	private String color;
	private Enganchable siguienteEnganchable;
	
	public Vagon() {}
	
	public void enganchar(Enganchable e) {
		siguienteEnganchable = e;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	public String getColor() {
		return color;
	}
	public void setSiguienteEnganchable(Enganchable e) {
		this.siguienteEnganchable = e;
	}
	public Enganchable getSiguienteEnganchable() {
		return siguienteEnganchable;
	}

	public void ToString() {
		// TODO Auto-generated method stub
		
	}
	
	public abstract Vagon clonar();
	
	public void reportarEstado() {
		System.out.println("Reportando estado usando iterador");
		System.out.println("");
	}
	
	public void reportarProblemas() {
		System.out.println("Reportando problemas en el vagón");
		System.out.println("");
	}
	
	public void revisarFrenos() {
		System.out.println("Revisando frenos");
		System.out.println("");
	}
	
	public abstract void subo();
	
	
}

