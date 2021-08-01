package clase5;

public class ActivarPlataformasDeAscensoYDescenso extends CaracteristicaDecorator{

	public ActivarPlataformasDeAscensoYDescenso(Caracteristica c) {
		super(c); 
	}
	
	public void llegaUnTren() {
		System.out.println("Activando plataformas de ascenso y descenso");
		super.llegaUnTren();
	}
	

}
