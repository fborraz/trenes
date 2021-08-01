package clase3;

import clase8.AMediaMarcha;
import clase8.ATodaMaquina;
import clase8.EstadoDelMotor;
import clase8.MarchaLenta;
import clase8.MotorApagado;
import clase8.MotorRoto;
import clase8.PuntoMuerto;


public class Motor implements MotorClonable {

	EstadoDelMotor estadoDelMotor;
	
	public Motor() {
		estadoDelMotor = new MotorApagado(this);
	}
	
	public void hacerRevision() {
		System.out.println("Haciendo revision");
	}

	@Override
	public PrototipoClonable clonar() {
		return new Motor();
	}
	
	///////////////////////////STATE//////////////////////////////////////
	
	
	public void encender() {
		if(estadoDelMotor instanceof MotorApagado) {
			cambiarEstado(new PuntoMuerto(this));
		}
	}
	
	public void apagar() {
		if(estadoDelMotor instanceof PuntoMuerto) {
			cambiarEstado(new MotorApagado(this));
		}
	}
	
	public void acelerar() {
		estadoDelMotor.acelerar();
	}
	
	public void desacelerar() {
		estadoDelMotor.desacelerar();
	}
	
	public void frenar() {
		if(estadoDelMotor instanceof MarchaLenta || estadoDelMotor instanceof AMediaMarcha || estadoDelMotor instanceof ATodaMaquina) {
			cambiarEstado(new PuntoMuerto(this));
		}
	}
	
	public void arreglar() {
		if(estadoDelMotor instanceof MotorRoto) {
			cambiarEstado(new MotorApagado(this));
		}
	}
		
	public void cambiarEstado(EstadoDelMotor em) {
		estadoDelMotor = em;
	}
	
	public EstadoDelMotor getEstadoDelMotor() {
		return estadoDelMotor;
	}
	
//////////////////////////////////////////////////////////////////////	
}
