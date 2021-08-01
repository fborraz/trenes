package clase3;

//Patrones implementados: Builder, Prototype y Singleton



import clase1.Tren;

public interface Conection {
	void enViaje(Tren t);
	double getLongitud();
	void llegaUnTren(Tren t);
}	
