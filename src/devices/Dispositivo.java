package devices;

public abstract class Dispositivo {
	private String numeroSerial;
	
	public Dispositivo() {
		
	}
	public Dispositivo(String numeroSerial) {
		this.numeroSerial = numeroSerial;
	}
	public String getNumeroSerial() {
		return numeroSerial;
	}
	public void getNumeroSerial(String numeroSerial) {
		this.numeroSerial = numeroSerial;
	}
	public abstract void processaDoc(String doc);
}
