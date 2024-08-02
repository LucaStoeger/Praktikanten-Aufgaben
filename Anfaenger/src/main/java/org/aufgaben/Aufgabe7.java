package org.aufgaben;

import java.util.Random;

/**
 * @author Luca Stöger, FOCONIS AG
 *
 * Was soll gemacht werden?
 *
 * Gegeben ist ein zweidimensionaler String Array, wobei eine zufällige stelle auf den Werte "Nadel" gesetzt.
 * Finde die Stelle, an welcher Nadel im Array steht.
 */
public class Aufgabe7 {
	public static void main(String... args) {

		Random random = new Random();
		String[][] zahlen = new String[10][10];
		zahlen[random.nextInt(11)][random.nextInt(11)] = "Nadel";
	}
}
