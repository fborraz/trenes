package clase8;

import clase3.Motor;

public class MotorRoto extends EstadoDelMotor{

	public MotorRoto(Motor m) {
		super(m);
	}

	@Override
	public void acelerar() {
		System.out.println("Motor roto");
		motor.cambiarEstado(new MotorApagado(motor));
		
	}

	@Override
	public void desacelerar() {
		
	}

}
