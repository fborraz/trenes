package clase8;

import clase3.Motor;

public class MotorApagado extends EstadoDelMotor {

	public MotorApagado(Motor m) {
		super(m);
	}

	@Override
	public void acelerar() {
		System.out.println("Sin efecto");
	}

	@Override
	public void desacelerar() {
		
	}
}
