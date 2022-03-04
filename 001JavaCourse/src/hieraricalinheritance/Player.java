package hieraricalinheritance;

import inheritance.Person;

public class Player extends Person {
	
	private String game;

	public Player() {
		super();
	}

	public Player(String game) {
		super();
		this.game = game;
	}

	public Player(String firstName, String lastName, long contactNumber, String game) {
		super(firstName, lastName, contactNumber);
		this.game = game;
	}

	public String getGame() {
		return game;
	}

	public void setGame(String game) {
		this.game = game;
	}

	@Override
	public String toString() {
		return super.toString() + "Player [game=" + game + "]";
	}

	
	
	
}
