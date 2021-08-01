package clase8;

import clase3.Motor;

public class ATodaMaquina extends EstadoDelMotor{

	public ATodaMaquina(Motor m) {
		super(m);
	}

	@Override
	public void acelerar() {
		System.out.println("A toda maquina");
		motor.cambiarEstado(new MotorRoto(motor));
	}

	@Override
	public void desacelerar() {
		System.err.println("A toda máquina");
		motor.cambiarEstado(new AMediaMarcha(motor));
	}
}
