package clase2_AbstractFactory_FactoryMethod;

import clase1.Tren;

public class AndenDePasajeros extends Anden{
	
	
	public AndenDePasajeros(int numero) {
		super(numero);
		// TODO Auto-generated constructor stub
	}

	public void llegaUnTren(Tren tren) {
		System.out.println("Los pasajeros suben y bajan en anden " + getNumero());
		super.llegaUnTren(tren);
	}	
	
	@Override
	public void saleElTren() {
		super.saleElTren();
		System.out.println("");
		System.out.println("El tren está dejando el anden de pasajeros N° " + getNumero());
		System.out.println("");
	}
}
