package week5Lab;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck  {
	//why not need "extends Card"??? A: would use if not in same package. 
	
	List<Card> cards = new ArrayList<Card>();
	
	Deck() {
		String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
		String[] numbers = {"One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"};
		
		
		for (String suit : suits) {
			int count = 2;
			// 2 because we want range of cards to be from 2 to ace
			for (String number : numbers) {
				Card card = new Card(number, suit, count);
				this.cards.add(card);
				count ++;
			}
		}
			
	}

	public List<Card> getCards() {
		return cards;
	}

	public void setCards(List<Card> cards) {
		this.cards = cards;
	}
	
	public void describe() {
		for (Card card : this.cards) {
			card.describe();
		}
	}
	
	
	
	// to instantiate:
	// Deck deck = new Deck();
	
	// to call:
	// deck.describe();
	
	
	//public void shuffleW05() {
	//	Collections.shuffle(this.cards);
	//}
	
	
	// public Card drawW05() {
	// 	Card card = this.cards.remove(0);
	//	return card;
	//}
	
	
	
	
	 public static void main(String[] args) {
	     
		 Deck deck = new Deck();  
		 deck.describe();
		 
		 System.out.println("_____________ Shuffled:");
		 
		// deck.shuffle();
		 deck.describe();
		 
		 System.out.println("_______________ Draw card:");
		 
		// Card drawnCard = deck.draw();
		// drawnCard.describe();
	 }
	 
	 
	 
	 
	
	 
	 
	 
	 
	
	
	

}
