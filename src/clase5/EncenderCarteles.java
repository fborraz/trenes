package clase5;

public class EncenderCarteles extends CaracteristicaDecorator{

	public EncenderCarteles(Caracteristica c) {
		super(c);
	}
	public void llegaUnTren() {
		System.out.println("Encendiendo los carteles");
		super.llegaUnTren();
	}
	

}
