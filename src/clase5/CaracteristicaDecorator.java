package clase5;

public abstract class CaracteristicaDecorator implements Caracteristica{

	protected Caracteristica caracteristica;
	
	public CaracteristicaDecorator(Caracteristica c) {
		caracteristica = c;
	}
	
	public void llegaUnTren() {
		caracteristica.llegaUnTren();	
	}


	
}
