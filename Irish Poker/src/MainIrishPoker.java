
public class MainIrishPoker {
	
	public static void main( String args[] ) {
		Deck irish = new Deck(); 
		irish.printAllCards();
		irish.shuffle();
		Card player = irish.drawCard();
		
		System.out.println("the second count is " + irish.currentCount());
		System.out.println("Your card is: " + player);
		
	}
	
	
	
	
}
