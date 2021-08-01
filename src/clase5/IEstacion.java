package clase5;

import java.util.ArrayList;

import clase1.Tren;
import clase2_AbstractFactory_FactoryMethod.Anden;
import clase2_AbstractFactory_FactoryMethod.Personal;
import clase3.Conection;
import clase3.TrenClonable;
import clase7.Observador;


public interface IEstacion extends Conection{
	void llegaUnTren(Tren t);
	void agregarConexion(Conection c);
	void agregarAnden(Anden a);
	void agregarPersonal(Personal p);
	void agregarObservador(Observador o);
	void saleUnTren(int numero);
	void asignarTren(TrenClonable t);
	void partidaDelTren();
	void enViaje(Tren t);
	double getLongitud();
	void setNombreEstacion(String nomEstacion);
	String getNombreEstacion();
	public ArrayList<Anden> getAndenes();
	public SupervisorDeEstacion getSupervisorDeEstacion();
		
	
	
}
