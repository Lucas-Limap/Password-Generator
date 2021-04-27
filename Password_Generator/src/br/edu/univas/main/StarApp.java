package br.edu.univas.main;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import br.edu.univas.view.*;
import br.edu.univas.vo.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class StarApp {
	
	static Random random = new Random ();
	static Scanner input =  new Scanner (System.in);
	static PreviewInterface view = new PreviewInterface ();
	static FeaturePassword password = new FeaturePassword ();
	
	public static void main(String[] args) throws IOException {
		view.printInitialMenu();
		
		//PASSWORD LEGTH
		view.printMinLength();
		password.setMinLength(readInterger());
		
		view.printMaxLength();
		password.setMaxLength(readInterger());
		
		randomLength(password.getMinLength(), password.getMaxLength());
		
		//PASSWORD LENGTH CASES
		charLength();
		
		//PASSWORD CARACTERS
		view.printLowerCase();
		password.setChoise(input.nextLine());
			if (password.getChoise().equalsIgnoreCase("S")) {
				choiseLowerCase(password.lowerLength);
				password.setPassword(choiseLowerCase(password.lowerLength));
			}
			
			if (password.getChoise().equalsIgnoreCase("N")) {
				choiseLowerCase(password.lowerLength);
				password.setPassword(choiseLowerCase(0));
				password.upperLength += password.lowerLength;
				
			}
			
		view.printUpperCase();
		password.setChoise(input.nextLine());
			 if (password.getChoise().equalsIgnoreCase("S")) {
				choiseUpperCase(password.upperLength);	
				password.setPassword(choiseUpperCase(password.upperLength).concat(password.getPassword()));
		}
			 if (password.getChoise().equalsIgnoreCase("N")) {
					choiseUpperCase(password.upperLength);	
					password.setPassword(choiseUpperCase(0).concat(password.getPassword()));
					password.numberLength += password.upperLength;
			}
		
		view.printNumberCase();
		password.setChoise(input.nextLine());
			if (password.getChoise().equalsIgnoreCase("S")) {
				choiseNumberCase(password.numberLength);	
				password.setPassword(choiseNumberCase(password.numberLength).concat(password.getPassword()));
		}
			if (password.getChoise().equalsIgnoreCase("N")) {
				choiseUpperCase(password.upperLength);	
				password.setPassword(choiseUpperCase(0).concat(password.getPassword()));
				password.symbolLength += password.numberLength;
		}
		
		view.printSymbolCase();
		password.setChoise(input.nextLine());
			if (password.getChoise().equalsIgnoreCase("S")) {
				choiseSymbolCase(password.symbolLength);	
				password.setPassword(choiseSymbolCase(password.symbolLength).concat(password.getPassword()));
		}
			if (password.getChoise().equalsIgnoreCase("N")) {
				choiseUpperCase(password.upperLength);	
				password.setPassword(choiseUpperCase(0).concat(password.getPassword()));
				
		}

		shuffleString(password.getPassword());
			
		view.printSaveMesseger();
		password.setSaveLocal(input.nextLine());
		savePassword();		
		
		//METODOS
	}public static String choiseLowerCase (int lowerSize) {
		String password = "";
		for( int i = 0; i < lowerSize; i++) {
			password = password + randomChar ("abcdefghijklmnopqrstuvwxyz");
		}
		return password;
		
	}public static String choiseUpperCase(int upperSize) {
		String password = "";
		for( int i = 0; i < upperSize; i++) {
			password = password + randomChar ("ABCDEFJHIJKLMNOPQRSTUVWXYZ");
		}
		return password;
	
	}public static String choiseNumberCase (int numberSize) {
		String password = "";
		for( int i = 0; i < numberSize; i++) {
			password = password + randomChar ("1234567890");
		}
		return password;
		
	}public static String choiseSymbolCase (int symbolSize) {
		String password = "";

		for( int i = 0; i < symbolSize; i++) {
			password = password + randomChar ("!@#$%&*");

		}
		
		return password; 
		
	}public static void savePassword () throws IOException {
			FileWriter file = new FileWriter(password.getSaveLocal().concat("\\Password.txt"));
			PrintWriter saveFile = new PrintWriter (file);
			
			//Text within file
			saveFile.printf("Senha: %s", password.getPassword());
			file.close();
			
			//Text in console
			System.out.println("\nArquivo foi salvo com sucesso\n");

	}public static String randomChar (String character) {
		int x = character.length(); // retorna double
		int z = (int) (x * Math.random()); //(int) tranforma o x em int.
		return character.substring(z, z + 1); // .substring só aceita int.
			
	}public static int readInterger () {
		int value = input.nextInt ();
		input.nextLine();
		return value;
	
	}public static int randomLength (int min, int max) {
		password.randomLength = random.nextInt((max - min) + 1) + min ;
		return password.randomLength;
	
	}public static void shuffleString(String s) {
	    ArrayList <String> letters = new ArrayList <>();
	    String temp = "";

	    for (int i = 0; i < s.length(); i++) {
	        letters.add(String.valueOf(s.charAt(i)));
	    }
	    System.out.println("");

	    Collections.shuffle(letters);

	    for (int i = 0; i < s.length(); i++) {
	        temp += letters.get(i);
	    }
	    password.setPassword(temp);
	
	}public static void charLength () {
		password.lowerLength = password.randomLength*50/100;
		password.upperLength = password.randomLength*20/100;
		password.numberLength = password.randomLength*20/100;
		password.symbolLength = password.randomLength*10/100;
				
		if (password.symbolLength == 0) {
				password.symbolLength++;
		}
		
	}
}