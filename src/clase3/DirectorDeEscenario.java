package clase3;
//import clase2_AbstractFactory_FactoryMethod.*;
import clase4.ConexionCompuesta;
//import clase4.ConexionCompuesta;
import clase5.IEstacion;


public class DirectorDeEscenario {
	public static RailroadNetwork construirRedSimple(ConstructorDeEscenarioAbstracto constructor) {
		constructor.construirRedFerroviaria();
		
		IEstacion e1 = constructor.construirEstacion("Brendam");
		IEstacion e2 = constructor.construirEstacion("Wellsworth");
		
		Conection conexion = constructor.construirConexion(29.8, e2);
		e1.agregarConexion(conexion);
		
		return constructor.obtenerRedFerroviaria();
		
	}
	
	public static RailroadNetwork construirRedCuadrada(ConstructorDeEscenarioAbstracto constructor) {
		
		constructor.construirRedFerroviaria();

		IEstacion e1 = constructor.construirEstacion();
		IEstacion e2 = constructor.construirEstacion();
		IEstacion e3 = constructor.construirEstacion();
		IEstacion e4 = constructor.construirEstacion();

		Conection conexion = constructor.construirConexion(29.8, e2);

		e1.agregarConexion(conexion);
		Conection conexion2 = constructor.construirConexion(29.8, e3);
		e2.agregarConexion(conexion2);
		Conection conexion3 = constructor.construirConexion(29.8, e4);
		e3.agregarConexion(conexion3);
		Conection conexion4 = constructor.construirConexion(29.8, e1);
		e4.agregarConexion(conexion4);
		
		return constructor.obtenerRedFerroviaria();	
	}
	
	public static RailroadNetwork construirRedComposite(ConstructorDeEscenarioAbstracto constructor) {
		constructor.construirRedFerroviaria();
		
		IEstacion e1 = constructor.construirEstacion();
		IEstacion e2 = constructor.construirEstacion();
		
		Via v1 = new Via(20);
		Puente p1 = new Puente(30);
		Tunel t1 = new Tunel(12);
		
		ConexionCompuesta tv1 = new ConexionCompuesta();
		tv1.agregarHijo(v1); 
		tv1.agregarHijo(p1);
		tv1.agregarHijo(t1);
		
		Via v2 = new Via(48);
		Via v31 = new Via(20);
		Via v32 = new Via(12);
		Puente p3 = new Puente(30);
		Tunel t3 = new Tunel(12,e2);
		
		ConexionCompuesta tv3 = new ConexionCompuesta();
		tv3.agregarHijo(v31); 
		tv3.agregarHijo(v32);
		tv3.agregarHijo(p3); 
		tv3.agregarHijo(t3);
		
		ConexionCompuesta tv = new ConexionCompuesta();
		tv.agregarHijo(tv1); 
		tv.agregarHijo(v2);
		tv.agregarHijo(tv3);
		
		e1.agregarConexion(tv);
		
		return constructor.obtenerRedFerroviaria();
			
	}
}
