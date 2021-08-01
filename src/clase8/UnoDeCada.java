package clase8;

import java.util.ArrayList;

import clase2_AbstractFactory_FactoryMethod.Anden;

public class UnoDeCada implements PoliticaDePartida {

	int siguiente = 0;
	Anden anden;
	
	@Override
	public Anden siguienteTrenEnSalir(ArrayList<Anden> andenes) {
		siguiente++;
		if(siguiente == andenes.size()) {
			siguiente = 0;
		}
		else if(andenes.get(siguiente-1).estaOcupado()){
			anden = andenes.get(siguiente - 1);
		}
		return anden;
	}
}