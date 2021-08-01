package clase8;

import java.util.ArrayList;

import clase2_AbstractFactory_FactoryMethod.Anden;

public class PrimeroCarga implements PoliticaDePartida {

	int siguiente = 0;
	Anden anden ;
	
	@Override
	public Anden siguienteTrenEnSalir(ArrayList<Anden> andenes) {
		
		siguiente++;
		if(siguiente == andenes.size()) {
			siguiente = 0;
		}

		else if(andenes.get(siguiente-1).estaOcupado()){
			if (andenes.get(siguiente - 1).getTren().getTipoTren().equals("carga")) {
				anden = andenes.get(siguiente - 1);
			}
			else
				siguienteTrenEnSalir(andenes);
		}
		return anden;
	}
}









//Tren tren = andenes.get(siguiente-1).getTren();
//while(andenes.get(siguiente-1).getTren().getClass().equals(TrenDeCarga.class)){

//while(tren.getTipoTren().equals("carga")){
////return andenes.get(siguiente);
//anden = andenes.get(siguiente-1);
//}