package clase2_AbstractFactory_FactoryMethod;

import clase1.Tren;
import clase5.Caracteristica;

public class AndenDeCarga extends Anden{
	
	public AndenDeCarga(int numero) {
		super(numero);
	}
	public AndenDeCarga(int numero, Caracteristica caracteristica) {
		super(numero, caracteristica);
	}
	
//	public void llegaUnTren(Tren tren) {
//		System.out.println("Cargando y descargando mercaderia en anden N° "+ getNumero());
//		getCaracteristica().llegaUnTren();
//		super.llegaUnTren(tren);
//		System.out.println("");
//	}
	
	
	public void llegaUnTren(Tren tren) {
		System.out.println("");
		System.out.println("Cargando y descargando mercaderia en anden N° "+ getNumero());
		System.out.println("");
		getCaracteristica().llegaUnTren();
		super.llegaUnTren(tren);
	}
	
	@Override
	public void saleElTren() {
		super.saleElTren();
		//System.out.println("El tren está dejando el anden de carga N° " + getNumero());
	}
	

	

}
