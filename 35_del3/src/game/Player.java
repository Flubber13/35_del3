package game;


public class Player {

	private String name;
	private BankAccount account;

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
	
}
