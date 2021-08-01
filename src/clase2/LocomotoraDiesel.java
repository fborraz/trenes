package clase2_AbstractFactory_FactoryMethod;
import clase1.Enganchable;
import clase1.Locomotora;

public class LocomotoraDiesel extends Locomotora{

	@Override
	public void encenderMotor() {
		getMotor().encender();
		System.out.println("Locomotora diesel encendida");
		System.out.println("");
	}

	@Override
	public void enMarcha() {
		getMaquinista().estoyListo();
		System.out.println("Quemando gasoil");
		System.out.println("");
	}

	@Override
	public Locomotora clonar() {
		Locomotora locomotoraDiesel = new LocomotoraDiesel();
		locomotoraDiesel.setMaquinista(getMaquinista());
		locomotoraDiesel.setMotor(getMotor());
		locomotoraDiesel.setNumero(getNumero());
		locomotoraDiesel.setPrimerEnganchable(getPrimerEnganchable());
		
		return locomotoraDiesel;
	}

	@Override
	public String reportarCombustible() {
		return "Reportando combustible de la locomotora diesel";
	}

	@Override
	public String reportarFallas() {
		return "Reportando fallas de la locomotora diesel";
	}

	@Override
	public String reportarEstadoDelChasis() {
		return "Reportando estado del chasis de la locomotora diesel";
	}

	@Override
	public String reportarSistemaDeFrenos() {
		return "Reportando sistema de frenos de la locomotora diesel";
	}

	@Override
	public String reportarMotor() {
		return "Motor de la locomotora diesel funcionando";
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
