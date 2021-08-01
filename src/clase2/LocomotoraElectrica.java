package clase2_AbstractFactory_FactoryMethod;
import clase1.*;

public class LocomotoraElectrica extends Locomotora{

//	@Override
//	public void encenderMotor() {
//		System.out.println("Locomotora electrica encendida");
//		getMotor().cambiarEstado(new PuntoMuerto(getMotor()));
//	}

	@Override
	public void enMarcha() {
		getMaquinista().estoyListo();
		System.out.println("Consumiendo electricidad");
		System.out.println("");
	}

	@Override
	public Locomotora clonar() {
		
		Locomotora locomotoraElectrica = new LocomotoraElectrica();
		locomotoraElectrica.setMaquinista(getMaquinista());
		locomotoraElectrica.setMotor(getMotor());
		locomotoraElectrica.setNumero(getNumero());
		locomotoraElectrica.setPrimerEnganchable(getPrimerEnganchable());
		
		
		return locomotoraElectrica;
	}
	
///////////////////////////TEMPLATE METHOD////////////////////////////
	public String reportarCombustible() {
		return "Estoy enchufada al tendido eléctrico";
	}
	
	public String reportarFallas() {
		return "Hay un cable pelado.";
	}

	public String reportarEstadoDelChasis() {
		return "En perfectas condiciones";
	}
	
	@Override
	public String reportarSistemaDeFrenos() {
		return "Sistema de frenos en perfecto estado";
	}

	@Override
	public String reportarMotor() {
		return "Motor funcionando";
	}
	
	@Override
	public String reportarComandos() {
		return "Reportando comandos";
		
	}
////////////////////////////////////////////////////////////////////
	
	@Override
	public Enganchable getSiguienteEnganchable() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void encenderMotor() {
		getMotor().encender();
	}	
}
