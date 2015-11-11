package game;

import desktop_resources.GUI;

public class Controller {

	Player[] player = new Player[6];
	DiceCup dicecup;
	int numOfPlayers;

	public void run() {
		// Determines the number of players in the game
		numOfPlayers = GUI.getUserInteger(Text.howManyPlayers, 2, 6);
		
		// This loop adds the determined number of players to the game
		for (int i = 0; i < numOfPlayers; i++) {
			player[i] = new Player(30000);
			player[i].setName(GUI.getUserString(Text.enterName[i]));
			GUI.addPlayer(player[i].getName(), player[i].getAccount().getBalance());
			GUI.setCar(1, player[i].getName());
		}
		
		// Creates a new dice cup
		dicecup = new DiceCup();
		
		//this loop gives all active players a turn  
		for (int i = 0; i < numOfPlayers; i++) {
			playerTurn(player[i]);
		}
		
	}

	// Method for the player turn
	private void playerTurn(Player player) {
		GUI.showMessage(player.getName() + Text.roll );									//The player is asked to roll the dice
		player.setPosition(dicecup.roll());													//dice is rolled
		GUI.setCar(player.getPosition(), player.getName());
		GUI.setDice(dicecup.getDie1().getLastRoll(), dicecup.getDie2().getLastRoll());	//dice is shown on screen
		GUI.showMessage(player.getName() + Text.landedOn);								//Displays which player landed on the field
		player.getAccount().addBalance(0);												//no points are added at this point in time :D
		GUI.setBalance(player.getName(), player.getAccount().getBalance());				//displays balance on board 

	}
	
}

