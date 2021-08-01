package clase9;

public class PersonalDeLimpieza extends Manejador implements ManejadorDeProblemas{


	public PersonalDeLimpieza(Manejador s) {
		super(s);
	}

	@Override
	public void controlarDisturbios() {
		System.out.println("Controlando disturbios");
		super.controlarDisturbios();
	}

	@Override
	public void pasajeroMareado() {
		System.out.println("Atento al pasajero mareado");
		super.pasajeroMareado();
		
	}

	@Override
	public void locomotoraConPerdida() {
		System.out.println("Limpiando locomotora con perdida");
		super.locomotoraConPerdida();
		
	}
	
}
