package devices;

public class ComboioDispositivo extends Dispositivo implements Scanner, Impressora {

	@Override
	public void imprime(String doc) {
		System.out.println("Combo imprimindo: "  + 	doc);
		
	}

	@Override
	public String scan() {
		return "resultado do combo scan";
	}

	@Override
	public void processaDoc(String doc) {
		System.out.println("Combo  processando: " + doc);
		
	}

}
