package clase2_AbstractFactory_FactoryMethod;

import clase1.Tren;
import clase5.Caracteristica;

public abstract class Anden {
	private int numero;
	private Tren tren;
	
	private Caracteristica caracteristica;
	
	public Anden(int numero) {
		this.numero = numero;
	}
	
	public Anden(Caracteristica c) {
		caracteristica = c;
	}
	
	public Anden(int numero, Caracteristica caracteristica) {
		this.numero = numero;
		this.caracteristica = caracteristica;
	}
	
	public void llegaUnTren(Tren tren) {
		setTren(tren);
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getNumero() {
		return numero;
	}
	
	public void setTren(Tren tren) {
		this.tren = tren;
	}
	
	public Tren getTren() {
		return tren;
	}
	
	public boolean estaOcupado() {
		if(getTren() != null) {
			return true;
		}
		else {
			return false;
		}	
	}
	
	public void saleElTren() {
		tren = null;
	}
	
	public void setCaracteristica(Caracteristica caracteristica) {
		this.caracteristica = caracteristica;
	}
	public Caracteristica getCaracteristica() {
		return caracteristica;
	}
	
}



