package devices;

public class Impressora extends Dispositivo {
	
	
	
	public Impressora(String numeroSerial) {
		super(numeroSerial);
	}
	
	@Override
	public void processaDoc(String doc) {
		System.out.println("Impressora processando: " + doc);
	}
	public void imprime(String doc) {
		System.out.println("Imprimindo: " + doc);
	}
}
