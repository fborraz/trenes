package clase5;

public class PrepararTolvas extends CaracteristicaDecorator{

	
	public PrepararTolvas(Caracteristica c) {
		super(c);
	}

	public void llegaUnTren() {
		System.out.println("Preparando tolvas");
		super.llegaUnTren();
	}
}
