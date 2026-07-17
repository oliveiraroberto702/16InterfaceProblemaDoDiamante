package aplicacao;


import devices.ComboioDispositivo;
import devices.ImpressoraConcreta;
import devices.ScannerConcreto;



public class Programa {
	public static void main(String[] args) {
		ImpressoraConcreta p = new ImpressoraConcreta("1080");
		p.processaDoc("My letter");
		p.imprime("My letter");
		System.out.println();
		
		ScannerConcreto s = new ScannerConcreto("2003");
		s.processaDoc("My Email");	
		System.out.println("resultado do Scan: " + s.scan());
		System.out.println();
		
		ComboioDispositivo c = new ComboioDispositivo();
		c.processaDoc("My dissertation");
		c.imprime("My dissertaion");
		System.out.println("resultado do Scan: " + c.scan());
		
	}

}
