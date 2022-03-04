package com.training.hierarchicalinheritance;
import com.training.singleinheritance.Person;
public class Player extends Person{
	private String game;

	public String getGame() {
		return game;
	}

	public void setGame(String game) {
		this.game = game;
	}

	public Player() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Player(String firstName, String lastName, String contactNumber,String game) {
		super(firstName, lastName, contactNumber);
		this.setGame(game);
		
	}

	@Override
	public String toString() {
		return super.toString()+"\tgame=" + game;
	}

	

	

	
	

}
