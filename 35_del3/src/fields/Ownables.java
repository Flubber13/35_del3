package fields;

import game.Player;

public abstract class Ownables extends Field{
	
	int price;
	Player owner;
	
	public abstract int getRent();

}
