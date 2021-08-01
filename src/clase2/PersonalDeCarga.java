package clase2_AbstractFactory_FactoryMethod;

import clase5.TrenFacade;

public class PersonalDeCarga extends Personal{

	public PersonalDeCarga(String nombre) {
		setNombre(nombre);	
	}

	@Override
	public void firmarEntrada() {
		System.out.println("Personal de carga (" + getNombre() + ") llegando a trabajar.");
	}

	@Override
	public void llegaUnTren(TrenFacade trenFacade) {
		// TODO Auto-generated method stub
		
	}
	
}
