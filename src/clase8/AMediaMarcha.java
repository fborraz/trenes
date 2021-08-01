package clase8;

import clase3.Motor;

public class AMediaMarcha extends EstadoDelMotor{

	public AMediaMarcha(Motor m) {
		super(m);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void acelerar() {
		System.out.println("A media marcha");
		motor.cambiarEstado(new ATodaMaquina(motor));		
		
	}

	@Override
	public void desacelerar() {
		System.out.println("A media marcha");
		motor.cambiarEstado(new MarchaLenta(motor));
		
	}

}
