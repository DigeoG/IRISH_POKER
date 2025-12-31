	public enum Suit {
	HEARTS(Color.RED),
	SPADES(Color.BLACK),
	CLUBS(Color.BLACK),
	DIAMONDS(Color.RED);
	
	private final Color color;
	private Suit (Color color){
		this.color = color; 
	}
	public Color getColor() {
		return color;
	
	}
	
}

