package game;


public class Player {

	private String name;
	private BankAccount account;
	private int position = 1;

	//definition of player
	public Player(int startBalance) {
		this.account = new BankAccount(startBalance);
	}


	public BankAccount getAccount() {
		return account;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setPosition(int position) {
		if(this.position + position >= 22)
			this.position = this.position + position -22;
		else
			this.position = position;
	}
	
	public int getPosition() {
		return position;
	}




}
