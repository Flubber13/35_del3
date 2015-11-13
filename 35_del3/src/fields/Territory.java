package fields;

import desktop_resources.GUI;
import game.Player;

public class Territory extends Ownables {


	int rent;
	int i;
	int j;
	int[] territoryPrice = {0, 2000, 1500, 3000, 1000, 4000, 8000, 4300, 4750, 5000, 5500, 6000};
	int[] territoryRent = {0, 500, 300, 700, 100, 1000, 4000, 1300, 1600, 2000, 2600, 3200};

	@Override
	public int getRent() {
		return rent;
	}

	@Override
	public void landedOn(Player player) {
		this.i = player.getPosition();

		// j er spillerens position i ovenstående index. Hvis eksempelvis spilleren befinder sig på 
		// felt nr. 4, så vil det svare til index 2 (både i Price og Rent). 
		this.j = i/2;

		if ((i == 2) || (i == 4) || (i == 6) || (i == 8) ||
				(i == 10) || (i == 12) || (i == 14) || (i == 16) ||
				(i == 18) ||(i == 20) || (i == 22)){

			// Hvis det pågældende felt er ejet (mangler at udføre klassen).
			if(i == 0){
				player.getAccount().addBalance(- territoryRent[j]);
			}
			// Ellers bliver spilleren spurgt, om vedkommende vil købe feltet.
			else{
				boolean Buttonpressed = GUI.getUserLeftButtonPressed("Feltet er ikke ejet. Vil du købe det for: "
						+ territoryPrice[j] + " ?", "Ja", "Nej");{
							
							// Hvis spilleren siger ja, købes feltet.
							if (Buttonpressed == true){
								player.getAccount().addBalance(- territoryPrice[j]);
								
								// Tilføjer derefter feltet til spilleren.
							}
						}

			}

		}

	}

}