package week5Lab;

public class Card {
	
	private String name;
	private String suit;
	private int value;
	
	
	
	public Card() {}
	
	//constructor:
	public Card(String name, String suit, int value) {
		this.name = name;
		this.suit = suit;
		this.value = value;
		
	}
	

	
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setSuit(String suit) {
		this.suit = suit;
		
	}
	
	public String getSuit() {
		return suit;
	}
	
	public void setValue(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}
	
	
	public void describe(String name, String suit, int value) {
		
		//System.out.println("Card information: " + name + ", " + suit + ", " + "value: " + value);
		System.out.println(this.name + " of " + this.suit + " -- " + this.value);
		
	
	}

	public void describe() {
		System.out.println(this.name + " of " + this.suit + " -- " + this.value);
		// TODO Auto-generated method stub
		
	}
	
	// to instantiate:
	// Card card = new Card("Two", "Clubs", 2);
	// to call:
	// card.describe();
	 
	
	
	
	
	

}
