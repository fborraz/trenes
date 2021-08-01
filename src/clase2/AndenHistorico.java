package clase2_AbstractFactory_FactoryMethod;

import clase1.Tren;

public class AndenHistorico extends Anden{

	public AndenHistorico(int numero) {
		super(numero);
	}
	
	public void llegaUnTren(Tren tren) {
		System.out.println("Los pasajeros suben y bajan en anden " + getNumero());
		super.llegaUnTren(tren);
	}
	
	@Override
	public void saleElTren() {
		super.saleElTren();
		System.out.println("El tren está dejando el anden histórico N° " + getNumero());
	}
}
