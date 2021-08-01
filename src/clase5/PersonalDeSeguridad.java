package clase5;

import clase2_AbstractFactory_FactoryMethod.Personal;
import clase7.Observado;
import clase7.Observador;

public class PersonalDeSeguridad extends Personal implements Observador{

	public PersonalDeSeguridad(String nombre) {
		setNombre(nombre);
	}

	public void llegaUnTren(TrenFacade trenFacade) {
		
		trenFacade.todoEnOrden();
		
		trenFacade.reportarProblemas();
	}

	@Override
	public void firmarEntrada() {
		System.out.println("Personal de seguridad (" + getNombre() +") llegando a trabajar.");
	}

	@Override
	public void actualizar(Observado o) {
		this.llegaUnTren(o.getTrenRecientementeLlegado());
		
	}
}
