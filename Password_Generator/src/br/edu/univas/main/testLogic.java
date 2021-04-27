package br.edu.univas.main;

//import java.util.ArrayList;
//import java.util.Collections;
import java.util.Random;

//import com.sun.tools.javac.util.List;

public class testLogic {
	public static void main(String[] args) {
		
	Random r = new Random ();
	
//	String senha = "adcABC123!@#";
//	System.out.println(shuffleString(senha));
	
	
	int min = 50;
	int max = 51;
	int i = 0;
	
	
	do {
		
	int random = r.nextInt((max - min) + 1 ) + min;
	
//	if(random < min) {
//		random =  random + min;
//		
//	}
//	
//	if(random > max) {
//		random = max;
//	}
	
	System.out.println(random);
	i++;
//	
//	random = 10;
//	
//	int l = random*40/100;
//	int u = random*25/100;
//	int n = random*25/100;
//	int s = random*10/100;
//	
//	if (s == 0) {
//		s++;
//	}
//	
//	System.out.printf("%d %d %d %d i:%d ",l,u,n,s,i);
	}while(i!=100);
//
//	}public static String shuffleString(String s) {
//	    ArrayList <String> letters = new ArrayList <>();
//	    String temp = "";
//
//	    for (int i = 0; i < s.length(); i++) {
//	        letters.add(String.valueOf(s.charAt(i)));
//	    }
//	    System.out.println("");
//
//	    Collections.shuffle(letters);
//
//	    for (int i = 0; i < s.length(); i++) {
//	        temp += letters.get(i);
//	    }
//	    return temp;
	}
}
