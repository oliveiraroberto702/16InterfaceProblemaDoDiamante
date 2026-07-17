package devices;

public class ImpressoraConcreta extends Dispositivo implements Impressora{
	
	
	
	public ImpressoraConcreta(String numeroSerial) {
		super(numeroSerial);
	}
	
	@Override
	public void processaDoc(String doc) {
		System.out.println("Impressora processando: " + doc);
	}
	@Override
	public void imprime(String doc) {
		System.out.println("Imprimindo: " + doc);
	}
}
