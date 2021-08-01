package clase2_AbstractFactory_FactoryMethod;

import clase5.TrenFacade;

public abstract class Personal{
	
	private String nombre;
	
	public Personal(String nombre) {
		this.nombre = nombre;
	}
	
	public Personal() {
	}
	
	public abstract void firmarEntrada();
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public abstract void llegaUnTren(TrenFacade trenFacade);
}
