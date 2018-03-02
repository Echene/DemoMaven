package dev;

import com.github.lalyos.jfiglet.*;

public class App {
	public static void main(String[] args) {
		
		System.out.println("Hello World!");

		String ascciiArt = FigletFont.convertOneLine("HELLO WORLD");

		System.out.println(ascciiArt);
	}
}
