package clase9;

public abstract class Manejador {
	Manejador sucesor = null;
	
	public Manejador(Manejador s) {
		sucesor = s;
	}
	
	public void incendioEnCesto() {
		if (sucesor != null) {
			sucesor.incendioEnCesto();
		}
	}
	
	public void incendioEnFrenos() {
		if (sucesor != null) {
			sucesor.incendioEnFrenos();
		}
	}
	
	public void puertasAtascadas() {
		if (sucesor != null) {
			sucesor.puertasAtascadas();
		}
	}
	
	public void controlarDisturbios() {
		if (sucesor != null) {
			sucesor.controlarDisturbios();
		}
	}
	
	public void ubicarPasajeros() {
		if (sucesor != null) {
			sucesor.ubicarPasajeros();
		}
	}
	
	public void pasajeroDesmayado() {
		if (sucesor != null) {
			sucesor.pasajeroDesmayado();
		}
	}
	
	public void pasajeroMareado() {
		 if(sucesor != null) {
			 sucesor.pasajeroMareado();
		 }	
	}
	
	public void locomotoraConPerdida() {
		if (sucesor != null) {
			sucesor.locomotoraConPerdida();
		}
	}
}
