package game;

public class GiveCardEffect extends busEffect {
	
	private final Card card; 
	
	public GiveCardEffect(Player player, State state,Card card ) {
		super(player, state);
		this.card = card; 
	}
	public Card getCard() {
		return card;
	}
	@Override
	public ActionType getActionType() {
		return ActionType.GIVE_CARD;
	}
	@Override
	public String toString() {
		return player + "Gives card" + card;
	}
}
