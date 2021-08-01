package clase1;

import clase2_AbstractFactory_FactoryMethod.Maquinista;
import clase3.Motor;
import clase3.PrototipoClonable;
import clase7.Iterable;

public abstract class Locomotora implements Enganchable, PrototipoClonable, Iterable{
	
	private int numero;
	private Enganchable primerEnganchable;
	private Maquinista maquinista;
	private Motor motor;
	
	public Locomotora() {}
	
	public void enganchar(Enganchable e) {
		primerEnganchable = e;
		System.out.println("Enganchando vagon");
	}
	
	public abstract void encenderMotor();
	public abstract void enMarcha();
	public abstract Locomotora clonar();
	
	////////////////////////////STATE/////////////////////////////////
	public void encender() {
		getMotor().encender();
	}
	public void apagar() {
		getMotor().apagar();
	}
	public void acelerar() {
		getMotor().acelerar();
	}
	public void desacelerar() {
		getMotor().desacelerar();
	}
	public void frenar() {
		getMotor().frenar();
	}
	public void arreglar() {
		getMotor().arreglar();
	}
	/////////////////////////////////////////////////////////////////
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getNumero() {
		return numero;
	}
	public void setPrimerEnganchable(Enganchable e) {
		this.primerEnganchable = e;
	}
	public Enganchable getPrimerEnganchable() {
		return primerEnganchable;
	}
	
	public void setMaquinista(Maquinista maquinista) {
		this.maquinista = maquinista;
	}
	
	public Maquinista getMaquinista() {
		return maquinista;
	}
	
	public void setMotor(Motor motor) {
		this.motor = motor;
	}
	
	public Motor getMotor() {
		return motor;
	}
	
	public void recargarCombustible() {
		System.out.println("Recargando combustible");
	}
	
	///////////////////////////TEMPLATE METHOD////////////////////////////
	
	public void reportarEstado() {
		System.out.println("Reporte de estado - Template Method\n"
						 + "---------------------------------------------------------------------------------\n"
						 + "Reporte de fallas: " + this.reportarFallas() + "\n"
						 + "Reporte del estado del chasis: " + this.reportarEstadoDelChasis() + "\n"
						 + "Reporte del sistema de frenos: " + this.reportarSistemaDeFrenos() + "\n"
						 + "Reporte del motor: " + this.reportarMotor() + "\n"
						 + "Reporte de comandos: " + this.reportarComandos() + "\n"
						 + "---------------------------------------------------------------------------------");
	}
	
	public abstract String reportarCombustible();
	public abstract String reportarFallas();
	public abstract String reportarEstadoDelChasis();
	public abstract String reportarSistemaDeFrenos();
	public abstract String reportarMotor();
	public abstract String reportarComandos();
	
	
	
	
	
	
	public void ToString() {
		System.out.println("Locomotora N°: " + getNumero());
		System.out.println("");
		getPrimerEnganchable().ToString();
	}
}