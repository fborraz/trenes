package clase2_AbstractFactory_FactoryMethod;

import clase1.Enganchable;
import clase1.Locomotora;

public class LocomotoraAVapor extends Locomotora{

	@Override
	public void encenderMotor() {
		System.out.println("Locomotora a vapor encendida");
		System.out.println("");
	}

	@Override
	public void enMarcha() {
		getMaquinista().estoyListo();
		System.out.println("Quemando leña");
		System.out.println("");
	}

	@Override
	public Locomotora clonar() {
		Locomotora locomotoraAVapor = new LocomotoraAVapor();
		locomotoraAVapor.setMaquinista(getMaquinista());
		locomotoraAVapor.setMotor(getMotor());
		locomotoraAVapor.setNumero(getNumero());
		locomotoraAVapor.setPrimerEnganchable(getPrimerEnganchable());
		
		return locomotoraAVapor;
	}

	@Override
	public String reportarCombustible() {
		return "Reportando combustible";
	}

	@Override
	public String reportarFallas() {
		return "Reportando fallas";
	}

	@Override
	public String reportarEstadoDelChasis() {
		return "Reportando estado del chasis";
	}

	@Override
	public String reportarSistemaDeFrenos() {
		return "Reportando estado del sistema de frenos";
	}

	@Override
	public String reportarMotor() {
		return "Reportando estado del motor";
	}

	@Override
	public String reportarComandos() {
		return "Reportando comandos";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@Override
	public Enganchable getSiguienteEnganchable() {
		// TODO Auto-generated method stub
		return null;
	}	
}
