package clase5;

import clase2_AbstractFactory_FactoryMethod.Personal;
import clase7.Observado;
import clase7.Observador;
import clase9.ManejadorDeProblemas;

public class Mecanico extends Personal implements Observador, ManejadorDeProblemas{
	public Mecanico(String nombre) {
		setNombre(nombre);
	}

	public void llegaUnTren(TrenFacade trenFacade) {
		
		//Mensaje al maquinista
		trenFacade.existenFallas();
		
		//Mensaje al vagon
		trenFacade.revisarFrenos();
		
		//Mensaje a la locomotora
		trenFacade.recargarCombustible();
		
		//Mensaje al motor de la locomotora
		trenFacade.hacerRevision();
	}

	@Override
	public void firmarEntrada() {
		System.out.println("Mecánico (" + getNombre() + ") llegando a trabajar.");
	}

	@Override
	public void actualizar(Observado o) {
		llegaUnTren(o.getTrenRecientementeLlegado());
	}

	

	@Override
	public void incendioEnFrenos() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void puertasAtascadas() {
		System.out.println("Arreglando puertas atascadas");
		
	}


	@Override
	public void locomotoraConPerdida() {
		super.locomotoraConPerdida();
	}

	@Override
	public void incendioEnCesto() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void controlarDisturbios() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ubicarPasajeros() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pasajeroDesmayado() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pasajeroMareado() {
		// TODO Auto-generated method stub
		
	}
}
