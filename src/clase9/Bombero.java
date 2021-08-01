package clase9;

public class Bombero extends Manejador implements ManejadorDeProblemas{

	public Bombero(Manejador s) {
		super(s);
	}
	
	@Override
	public void incendioEnCesto() {
		System.out.println("Controlando incendio");
	}
	
	@Override
	public void incendioEnFrenos() {
		System.out.println("Controlando incendio y redirigiendo petición");
		super.incendioEnFrenos();
	} 
	
	@Override
	public void puertasAtascadas() {
		System.out.println("Arreglando puertas atascadas y redirigiendo petición");
		super.puertasAtascadas();
	}
	
	@Override
	public void pasajeroDesmayado() {
		System.out.println("Atentiendo a pasajero desmayado");
	}
	
	
	
}
