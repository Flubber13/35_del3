package game;

import desktop_resources.GUI;

public class GameBoard {
	
	
	public static void initialize(){
		
		GUI.setSubText(1, null); // Start skal ikke umiddelbart have nogen text, og Title er allerede "START"
		
		GUI.setTitleText(2, "Mountain");
		GUI.setSubText(2, "");
		
		GUI.setTitleText(3, "Gold Mine");
		GUI.setSubText(3, "");
		
		GUI.setTitleText(4, "Crater");
		GUI.setSubText(4, "");
		
		GUI.setTitleText(5, "Second Sail");
		GUI.setSubText(5, "");
		
		GUI.setTitleText(6, "Cold Dessert");
		GUI.setSubText(6, "");
		
		GUI.setTitleText(7, "Monastery");
		GUI.setSubText(7, "");
		
		GUI.setTitleText(8, "Tribe Encapment");
		GUI.setSubText(8, "");
		
		GUI.setTitleText(9, "Sea Grover");
		GUI.setSubText(9, "");
		
		GUI.setTitleText(10, "Black Cave");
		GUI.setSubText(10, "");
		
		GUI.setTitleText(11, "The Pit");
		GUI.setSubText(11, "");
		
		GUI.setTitleText(12, "Castle");
		GUI.setSubText(12, "");
		
		GUI.setTitleText(13, "Caraven");
		GUI.setSubText(13, "");
		
		GUI.setTitleText(14, "The Werewall");
		GUI.setSubText(14, "");
		
		GUI.setTitleText(15, "Buccaneers");
		GUI.setSubText(15, "");
		
		GUI.setTitleText(16, "Mountain Village");
		GUI.setSubText(16, "");
		
		GUI.setTitleText(17, "Walled City");
		GUI.setSubText(17, "");
		
		GUI.setTitleText(18, "South Citadel");
		GUI.setSubText(18, "");
		
		GUI.setTitleText(19, "Huts in the mountain");
		GUI.setSubText(19, "");
		
		GUI.setTitleText(20, "Palace Gates");
		GUI.setSubText(20, "");
		
		GUI.setTitleText(21, "Privateer Armade");
		GUI.setSubText(21, "");
		
		GUI.setTitleText(22, "Tower");
		GUI.setSubText(22, "");
	
		for (int i = 23; i < 40; i++) {
			GUI.setTitleText(i, "");
			GUI.setSubText(i, "");
		}
	
	}

	
}