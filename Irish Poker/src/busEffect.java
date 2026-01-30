
public class busEffect {

	private final Player player; 
	private final ActionType actionType;
	private final State state; 
	
	public busEffect(Player player, ActionType actionType, State state) {
		this.player = player;
		this.actionType = actionType; 
		this.state = state;
	}
	
	public Player getPlayer() {
		return player;
	}
	
	public ActionType getActionType() {
		return actionType;
	}
	public State getState() {
		return state;
	}
	
	@Override 
	
	public String toString() {
		return "busEffect{" +
					"player = " + player +
					"actionType = " + actionType +
					"state = " + state +
					"}";
	}
		
}
