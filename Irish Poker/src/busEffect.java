
public abstract class busEffect {

	protected final Player player;
	protected final State state;
	
	protected busEffect(Player player, State state) {
		this.player = player;
		this.state = state;
	}
	
	public Player getPlayer() {
		return player;
	}
	
	//public ActionType getActionType() {
		//return actionType;
	//}
	public State getState() {
		return state;
	}
	
	public abstract ActionType getActionType();
}
