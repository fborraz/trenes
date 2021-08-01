package clase8;

import clase3.Motor;

public class PuntoMuerto extends EstadoDelMotor{

	public PuntoMuerto(Motor m) {
		super(m);
	}

	@Override
	public void acelerar() {
		System.out.println("Nos ponemos en marcha...");
		motor.cambiarEstado(new MarchaLenta(motor));
	}

	@Override
	public void desacelerar() {
		System.out.println("Punto muerto");
	}

}
