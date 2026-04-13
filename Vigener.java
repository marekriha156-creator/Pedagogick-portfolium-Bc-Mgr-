/**
 * 
 */
package sifra;

import java.util.*;

/**
 * @author marek
 *
 */
public class Vigener {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("1.) Zašifrovat");
		System.out.println("2.) Rozšifrovat");
		System.out.println("Vyberte 1 nebo 2");
		int a = sc.nextInt();
		sc.nextLine();
		
		
		if (a==1) {
		
		
		
		
		System.out.println("Zadej větu k zašifrování");
		String s = sc.nextLine();
		System.out.println("Zadej šifrovací slovo");
		String s1 = sc.nextLine();
		
		int[][] pole = new int [s.length()] [s.length()];
		for (int i =0; i<s.length();i++) {
			int p = 0;
		pole[p][i]= s.charAt(i);
		
		}
		for (int i =0; i<s.length();i++) {
			
		pole[1][i]= 0;
		}
		
		int [] pruchod = new int [s1.length()];
		for (int i =0; i<s1.length();i++) {
			pruchod [i]= s1.charAt(i);	
		}
		int pocitadlo = 0;
		do { 
			
			for (int i = 0; i<pruchod.length;i++) {
				if(pole[1][s.length()-1]==0) {
			pole [1][pocitadlo]=pruchod [i];
			pocitadlo++;}
		
			}
			
			
		}	while(pole[1][(s.length()-1)]==0);
		
		
		int [] vysledne = new int [s.length()];
		
		for (int i =0; i<pole.length;i++) {
			if (pole[0][i]!=' ') {
			vysledne [i]= pole[0][i] + (pole [1][i]-97) ;
			}
			else {
				vysledne [i]= pole [0][i];
			}
			if(vysledne[i]>'z') {
			vysledne[i]=vysledne [i]-26;
			}
			else {}
			}
			
	
		
		
		
		
		String zprava="";
		for (int i = 0; i < vysledne.length; i++) {
			char c =(char) vysledne [i];
		zprava = zprava + c;
		}
		System.out.println(zprava);
		}
		else {
		
		
		System.out.println("Zadej větu k rozšifrování");
		String s = sc.nextLine();
		System.out.println("Zadej šifrovací slovo");
		String s1 = sc.nextLine();
		
		int[][] pole = new int [s.length()] [s.length()];
		for (int i =0; i<s.length();i++) {
			int p = 0;
		pole[p][i]= s.charAt(i);
		
		}
		for (int i =0; i<s.length();i++) {
			
		pole[1][i]= 0;
		}
		
		int [] pruchod = new int [s1.length()];
		for (int i =0; i<s1.length();i++) {
			pruchod [i]= s1.charAt(i);	
		}
		int pocitadlo = 0;
		do { 
			
			for (int i = 0; i<pruchod.length;i++) {
				if(pole[1][s.length()-1]==0) {
			pole [1][pocitadlo]=pruchod [i];
			pocitadlo++;}
		
			}
			
			
		}	while(pole[1][(s.length()-1)]==0);
		
		
		int [] vysledne = new int [s.length()];
		
		for (int i =0; i<pole.length;i++) {
			vysledne [i]= pole[0][i] - (pole [1][i]-97) ;
			if(vysledne[i]>'z') {
			vysledne[i]=vysledne [i]-26;
			}
		}
		
		
		
		
		String zprava="";
		for (int i = 0; i < vysledne.length; i++) {
		char c =(char) vysledne [i];
		zprava = zprava + c;
		}
		System.out.println(zprava);
		
		}
		
		}

		
		
		
		
		
		/*	String zprava="";
		for (int i = 0; i < vysledne.length; i++) {
		char c =(char) vysledne[i];
		zprava = zprava + c;
		}
		System.out.println(zprava);
		
		String zprava2="";
		for (int i = 0; i < pole.length; i++) {
		char c =(char) pole [1] [i];
		zprava2 = zprava2 + c;
		}
		System.out.println(zprava2);*/
		
		
			}
			
		
		
	


