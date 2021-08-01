package clase8;

import clase3.Motor;

public abstract class EstadoDelMotor {
	
	Motor motor;
	
	public EstadoDelMotor(Motor m) {
		motor = m;
	}
	
	public abstract void acelerar();
	public abstract void desacelerar();
}
