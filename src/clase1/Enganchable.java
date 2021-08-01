package clase1;

import clase7.Iterable;

public interface Enganchable extends Iterable{
	void enganchar(Enganchable e);
	void ToString();
	Enganchable clonar();
	Enganchable getSiguienteEnganchable();
}
