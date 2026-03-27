package game;

public class TakeDrinkEffect extends busEffect {
	private final int drinks; 
	
	public TakeDrinkEffect(Player player, State state, int drinks) {
		super(player, state); 
		this.drinks = drinks; 
	}
		public int getDrinks() {
			return drinks; 
		}
		@Override
		public ActionType getActionType() {
			return ActionType.TAKE_DRINKS;
		}
		@Override 
		
		public String toString() {
			return player + "takes" + drinks + "drinks"; 
		}
}
