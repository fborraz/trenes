package clase7;

import clase5.TrenFacade;

public interface Observado {
	TrenFacade getTrenRecientementeLlegado();
	void agregarObservador(Observador o);
	void quitarObservador(Observador o);
	void notificar();
}
