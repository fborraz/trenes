package clase9;

public class Medico extends Manejador implements ManejadorDeProblemas{

	public Medico(Manejador s) {
		super(s);
	}
	
	
	@Override
	public void pasajeroMareado() {
		System.out.println("Atendiendo a pasajero mareado");
	}
	
	@Override
	public void pasajeroDesmayado() {
		System.out.println("Atentiendo a pasajero desmayado");
	}
	

	

		
}
