package Blackjack;
import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		System.out.println("Welkom bij Black Jack, druk op k om een kaart te vragen");
		
		Scanner scanner = new Scanner(System. in);
		String input = scanner.nextLine();

		Kaart kaart1;
		kaart1 = new Kaart();
		String kaartnaam = "h5";
		int waarde = 5;

		if(input.equals("k"))
				System.out.println("Je ontvangt de volgende kaart:" + kaart1);
			
		else
			System.out.println("Druk k"); 
					// de aanvang van het spel

		}
	}


		
