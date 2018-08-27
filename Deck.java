package Blackjack;

import java.util.ArrayList;
import java.util.Scanner;

public class Deck {
	
	Scanner scanner1 = new Scanner(System.in);
	public ArrayList kaarten = new ArrayList<Kaart>();

	
	public void createDeck() {
	
	String [] kaartnaam = {"h2","h3","h4","h5","h6","h7","h8","h9","h10","hBoer","hDame","hHeer","hAas","r2","r3","r4","r5","r6","r7","r8","r9","r10","rBoer","rDame","rHeer","rAas","s2","s3","s4","s5","s6","s7","s8","s9","s10","sBoer","sDame","sHeer","sAas","k2","k3","k4","k5","k6","k7","k8","k9","k10","kBoer","kDame","kHeer","kAas"};
	int [] waarde = {2,3,4,5,6,7,8,9,10,10,10,10,11,2,3,4,5,6,7,8,9,10,10,10,10,11,2,3,4,5,6,7,8,9,10,10,10,10,11,2,3,4,5,6,7,8,9,10,10,10,10,11};
	
	for(String i:kaartnaam) {	
		for(int x:waarde) {
			
			if(scannerinput.equals("k"));
			System.out.println();
	
		}
	}
			
		}
		
	
	public Deck() {
		this.createDeck();
	}

}