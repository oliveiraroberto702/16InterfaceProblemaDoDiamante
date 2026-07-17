package aplicacao;

import devices.Impressora;
import devices.Scanner;



public class Programa {
	public static void main(String[] args) {
		Impressora p = new Impressora("1080");
		
		p.processaDoc("My letter");
		p.imprime("My letter");
		//System.out.println();
		Scanner s = new Scanner("2003");
		s.processaDoc("My Email");	
		System.out.println("resultado do Scan: " + s.scan());
		//System.out.println();
		/*
		ComboDispositivos c = new ComboDispositivos("2081");
		c.processaDoc("My dissertation");
		c.imprime("My dissertation");
		System.out.println("resultado do Scan: " + c.scan());
		*/
	}

}
