package devices;

public class Scanner extends Dispositivo {
	
	
	
	public Scanner(String numeroSerial) {
		super(numeroSerial);
	}
	
	@Override
	public void processaDoc(String doc) {
		System.out.println("Scanner processando: " + doc);
	}
	public String scan() {
		return "conteúdo escaneado";
	}
}
