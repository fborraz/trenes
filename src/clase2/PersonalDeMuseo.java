package clase2_AbstractFactory_FactoryMethod;

import clase5.TrenFacade;

public class PersonalDeMuseo extends Personal{

	public PersonalDeMuseo(String nombre, String apellido) {
		setNombre(nombre);
	}

	@Override
	public void firmarEntrada() {
		System.out.println("Personal de museo (" + getNombre() + ") llegando a trabajar.");
		
	}

	@Override
	public void llegaUnTren(TrenFacade trenFacade) {
		// TODO Auto-generated method stub
		
	}

}
