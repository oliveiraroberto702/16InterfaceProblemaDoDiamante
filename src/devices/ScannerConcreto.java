package devices;

public class ScannerConcreto extends Dispositivo implements Scanner {
	
	
	
	public ScannerConcreto(String numeroSerial) {
		super(numeroSerial);
	}
	
	@Override
	public void processaDoc(String doc) {
		System.out.println("Scanner processando: " + doc);
	}
	@Override
	public String scan() {
		return "conteúdo escaneado";
	}
}
