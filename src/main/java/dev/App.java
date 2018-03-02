package dev;

import java.util.ResourceBundle;

import com.github.lalyos.jfiglet.*;

public class App {
	public static void main(String[] args) {
		
		String titre = ResourceBundle.getBundle("application").getString("titre");

		String ascciiArt = FigletFont.convertOneLine(titre);

		System.out.println(ascciiArt);
		
		// Affichage de l'environnment
		String environnement = ResourceBundle.getBundle("application").getString("environnement");
		
		System.out.println("Environnement : " + environnement);
		
	}
}
