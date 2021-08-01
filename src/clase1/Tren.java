package clase1;

import clase2_AbstractFactory_FactoryMethod.LocomotoraDiesel;

import clase2_AbstractFactory_FactoryMethod.LocomotoraElectrica;
import clase3.TrenClonable;
import clase7.Iterador;
import clase7.IteradorDeLocomotoras;
import clase7.IteradorDeVagones;

public class Tren implements Enganchable, TrenClonable, ITren{
	
	private Locomotora locomotora;
	private Enganchable ultimoEnganchable;
	
	public Tren() {}
	
	public void agregarEnganchable(Enganchable e) {
		if (getUltimoEnganchable() == null) {
			ultimoEnganchable = e;
			locomotora = (Locomotora)e;
		}else {
			getUltimoEnganchable().enganchar(e);
			ultimoEnganchable = e;
		}	
	}
	
	public void realizarRecorrido() {
		getLocomotora().encenderMotor();
		getLocomotora().enMarcha();
	}
	
	public void setLocomotora(Locomotora locomotora) {
		this.locomotora = locomotora;
	}
	
	public Locomotora getLocomotora() {
		return locomotora;
	}
	
	public void setUltimoEnganchable(Enganchable e) {
		this.ultimoEnganchable = e;
	}
	
	public Enganchable getUltimoEnganchable() {
		return ultimoEnganchable;
	}
	
	public void ToString() {
		getLocomotora().ToString();
	}

	@Override
	public void enganchar(Enganchable e) {
		// TODO Auto-generated method stub
		
	}

	public Tren clonar() {
		Tren tren = new Tren();
		Enganchable enganchable = locomotora;
		tren.agregarEnganchable(enganchable.clonar());
		return tren;
	}
	
	public void horaDeArribo(int hora, int minutos, int segundos){
		System.out.println("Hora de arribo: " + hora + ":" + minutos + ":" + segundos);
	}
	
	public Iterador crearIteradorDeVagones() {
		return new IteradorDeVagones(this);
	}
	
	public Iterador crearIteradorDeLocomotoras() {
		return new IteradorDeLocomotoras(this);
	}
	
	@Override
	public Enganchable getSiguienteEnganchable() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public String getTipoTren() {
		if(getLocomotora() instanceof LocomotoraDiesel) {
			return "carga";
		}
		if(getLocomotora() instanceof LocomotoraElectrica) {
			return "pasajeros";
		}
		else {
			return "historico";
		}
	}
}
