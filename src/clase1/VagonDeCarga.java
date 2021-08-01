package clase1;



public class VagonDeCarga extends Vagon{ 
	private String tipoCarga;
	
	public VagonDeCarga() {
	
	}
	
	public VagonDeCarga(String color, String tipo) {
		setColor(color);
		setTipoCarga(tipo);
	}
	
	
	public void enganchar(Enganchable e) {
		super.enganchar(e);
		System.out.println("Enganchando un vagon de carga de tipo: " + getTipoCarga());
		System.out.println("");
		
	}
	
	public void setTipoCarga(String tipoCarga) {
		this.tipoCarga = tipoCarga;
	}
	public String getTipoCarga() {
		return tipoCarga;
	}
	
	public void ToString() {
		if(getSiguienteEnganchable() != null) {
			System.out.println("Vagón de carga que transporta (" + getTipoCarga() + ")");
			System.out.println("");
			getSiguienteEnganchable().ToString();
		}
		else if (getSiguienteEnganchable() == null) {
			System.out.println("Vagón de carga que transporta (" + getTipoCarga() + ")");
			System.out.println("");
		}
	}

//	@Override
//	public void desenganchar() {
//		if(getSiguienteEnganchable() != null) {
//			getSiguienteEnganchable().desenganchar();
//		}
//		else if (getSiguienteEnganchable() == null) {
//			setSiguienteEnganchable(null);
//		}
//	}

	@Override
	public Vagon clonar() {
		return new VagonDeCarga();
	}

	@Override
	public void subo() {
		// TODO Auto-generated method stub
		
	}
}
