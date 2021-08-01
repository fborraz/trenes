package clase2_AbstractFactory_FactoryMethod;

import java.util.Scanner;

public class FabricaDeEstacionHistorica extends FabricaDeEstacion{

	static Scanner teclado = new Scanner(System.in);
	@Override
	public Station crearEstacion() {
		Station estacion = new Station();
		System.out.println("Ingrese nombre del personal de museo");
		String nombrePersonal = teclado.next();  
		System.out.println("Ingrese apellido del personal de museo");
		String apellidoPersonal = teclado.next();
		estacion.agregarPersonal(new PersonalDeMuseo(nombrePersonal,apellidoPersonal));
		Anden anden;
		for (int i = 0; i < 10; i++) {
			anden = new AndenHistorico(i+1);
			estacion.agregarAnden(anden);
		}
		return estacion;
	}
	
}
