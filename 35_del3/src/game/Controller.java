package game;

import desktop_resources.GUI;

public class Controller {

	Player player1, player2;
	DiceCup dicecup;
	int numberofplayers;

	public void run() {

		numberofplayers = GUI.getUserInteger("Hvor mange spillere er I? (2-6 spillere)", 2, 6);

		Player[] player = new Player[6];
		
		for (int i = 0; i < numberofplayers; i++) {
			player[i] = new Player(30000);
			player[i].setName(GUI.getUserString(Text.enterName[i]));
			GUI.addPlayer(player[i].getName(), player[i].getAccount().getBalance());
		}
		
		dicecup = new DiceCup();


		/*The game continues as long as both player's balance is under 3000.  
		The loop assures both players have an equal amount of turns.*/
		while(player1.getAccount().getBalance()<3000 && player2.getAccount().getBalance()<3000){
			playerTurn(player1); 
			playerTurn(player2);
		}

		/* The following lines of code determines the winner of the game
		If only one player's balance exceeds 3000, in the last round, that player will win.
		If both player balances exceeds 3000 in the last round, it is a tie. */

		if (player1.getAccount().getBalance() >= 3000 && player2.getAccount().getBalance() < 3000)		//player 1 wins
			GUI.showMessage(">>> " + player1.getName() + Text.winner + " <<<");

		else if (player2.getAccount().getBalance() >= 3000 && player1.getAccount().getBalance() < 3000)	//player 2 wins
			GUI.showMessage(">>> " + player2.getName() + Text.winner+ " <<<");

		else 
			GUI.showMessage(">>> " + Text.tie + " <<<");												//its a tie

	}

	/*Method for the player turn
	The random integer defines which of the three texts are printed for the corresponding field. 
	This is because there are three different "texts" for every field.
	Every field has a corresponding amount of points which is added to the players balance.
	The method loops if the player rolls 10 (to give said player an extra turn).
	 */
	private void playerTurn(Player player) {
		int fieldNo;
		do{
			GUI.showMessage(player.getName() + Text.roll );									//The player is asked to roll the dice
			fieldNo = dicecup.roll();														//dice is rolled
			GUI.setDice(dicecup.getDie1().getLastRoll(), dicecup.getDie2().getLastRoll());	//dice is shown on screen
			int randomInt = (int)Math.floor( (Math.random())*3);							//creates random integer between 0 and 2
			GUI.displayChanceCard(Text.field[fieldNo][randomInt]);							//Displays the field landed on
			GUI.showMessage(player.getName() + Text.landedOn);								//Displays which player landed on the field
			player.getAccount().addBalance(GameBoard.field[fieldNo]);							//adds points to balance
			GUI.setBalance(player.getName(), player.getAccount().getBalance());				//displays balance 
		}while (fieldNo==10);
	}


}

