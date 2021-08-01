package clase5;

public class PrepararGruas extends CaracteristicaDecorator{

	public PrepararGruas(Caracteristica c) {
		super(c);
	}
	public void llegaUnTren() {
		System.out.println("Preparando gruas");
		super.llegaUnTren();
	}
	

}
