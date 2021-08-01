package clase8;

import clase3.Motor;

public class MarchaLenta extends EstadoDelMotor{

	public MarchaLenta(Motor m) {
		super(m);
	}

	@Override
	public void acelerar() {
		System.out.println("A marcha lenta");
		motor.cambiarEstado(new AMediaMarcha(motor));
		
	}

	@Override
	public void desacelerar() {
		System.out.println("A marcha lenta");
		motor.cambiarEstado(new PuntoMuerto(motor));
		
	}

}
