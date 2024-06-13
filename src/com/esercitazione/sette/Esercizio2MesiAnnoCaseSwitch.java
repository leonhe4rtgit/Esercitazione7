package com.esercitazione.sette;

import javax.swing.JOptionPane;

public class Esercizio2MesiAnnoCaseSwitch {

	public static void main(String[] args) {

		// INPUT DA TASTIERA
		String input = JOptionPane.showInputDialog("Inserire il Nome di un Mese");

		// CONVERSIONE IN CARATTERI MAIUSCOLI
		String inputMaiuscolo = input.toUpperCase();
		
		switch (inputMaiuscolo) {
		
		case "NOVEMBRE" :
			System.out.println("30 Giorni");
			break;
		
		case "APRILE" :
			System.out.println("30 Giorni");
			break;
			
		case "GIUGNO" :
			System.out.println("30 Giorni");
			break;
			
		case "SETTEMBRE" :
			System.out.println("30 Giorni");
			break;
			
		case "FEBBRAIO" :
			System.out.println("28 Giorni");
			break;
			
		case "GENNAIO" :
			System.out.println("31 Giorni");
			break;
			
		case "MARZO" :
			System.out.println("31 Giorni");
			break;
			
		case "MAGGIO" :
			System.out.println("31 Giorni");
			break;
			
		case "LUGLIO" :
			System.out.println("31 Giorni");
			break;
			
		case "AGOSTO" :
			System.out.println("31 Giorni");
			break;
			
		case "OTTOBRE" :
			System.out.println("31 Giorni");
			break;
			
		case "DICEMBRE" :
			System.out.println("31 Giorni");
			break;
		
		}
		
		

	}

}
