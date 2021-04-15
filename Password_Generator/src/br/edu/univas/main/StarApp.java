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
		String choise = "";
		
		view.printInitialMenu();
		
		//PASSWORD LEGTH
		view.printMinLength();
		password.setMinLength(readInterger());
		
		view.printMaxLength();
		password.setMaxLength(readInterger());
		
		randomLength(password.getMinLength(), password.getMaxLength());
		
		System.out.println(password.randomLength);
		
		//CARACTERISTICAS DA SENHA QTD DE CADA CARACTERER
		
				int lower = password.randomLength*40/100;
				int upper = password.randomLength*25/100;
				int number = password.randomLength*25/100;
				int symbol = password.randomLength*10/100;
				
				if (symbol == 0) {
					symbol++;
				}
		
		//PASSWORD CARACTERS
		view.printLowerCase();
		choise = input.nextLine();
			if (choise.equalsIgnoreCase("Y")) {
				choiseLowerCase(lower);
				password.setPassword(choiseLowerCase(lower));
			}
	
		view.printUpperCase();
			choise = input.nextLine();
			if (choise.equalsIgnoreCase("Y")) {
				choiseUpperCase(upper);	
				password.setPassword(choiseUpperCase(upper).concat(password.getPassword()));
		}
		
		view.printNumberCase();
			choise = input.nextLine();
			if (choise.equalsIgnoreCase("Y")) {
				choiseNumberCase(number);	
				password.setPassword(choiseNumberCase(number).concat(password.getPassword()));
		}
		
		view.printSymbolCase();
			choise = input.nextLine();
			if (choise.equalsIgnoreCase("Y")) {
				choiseSymbolCase(symbol);	
				password.setPassword(choiseSymbolCase(symbol).concat(password.getPassword()));
		}
		
		shuffleString(password.getPassword());
			
		view.printSaveMesseger();
		password.setSaveLocal(input.nextLine());
		savePassword();
		
		System.out.println(password.getPassword());
		
		
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
		int x = character.length();
		int z = (int) (x * Math.random());
		return character.substring(z, z + 1);
			
	}public static int readInterger () {
		int value = input.nextInt ();
		input.nextLine();
		return value;
	
	}public static int randomLength (int min, int max) {
		password.randomLength = random.nextInt(max);
		
		if(password.randomLength < min) {
			password.randomLength =  password.randomLength + min;	
		}	
		if(password.randomLength > max) {
			password.randomLength = max;	
		}
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
	}
}