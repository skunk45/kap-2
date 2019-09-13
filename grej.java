/*
 Ett enkelt Hello World i java
 Skapat 2019-09-13
 Programmerare Magnus Silverdal
*/
import javax.swing.*;
import java.util.Scanner;

public class grej { 
	public static void main(String[] args) {
		// varibeldeklaration
		String msg;
		// tilldelning
		msg = "Nu har variabeln ett värde";
		// initiering
		int tal = 17;
		
		// dialogruta
		msg = JOptionPane.showInputDialog(null,"Skriv ett meddelande");
		JOptionPane.showMessageDialog(null, msg);
		
		// I terminalen
		System.out.println("Skriv ett meddelande");
		Scanner tgb = new Scanner(System.in);
		msg = tgb.nextLine();
		System.out.println(msg);	
	}
}