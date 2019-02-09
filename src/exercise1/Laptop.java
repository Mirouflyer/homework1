package exercise1;

public class Laptop {
	
	String welcomeMessage;
	String passWord;
	static boolean powerButton =false;
	String KeyBoard;
	
	public Laptop () {}
	
	public  Laptop(boolean powerButton, String welcomeMessage) {
	    Laptop.powerButton = powerButton;
	    this.welcomeMessage = welcomeMessage;
	
	}
	
	public Laptop (String passWord) {
		this.passWord = passWord;
		
	}
	
	
	
	public boolean powerOn(boolean powerButton) {
		this.powerButton=powerButton;
		System.out.println("Shutdown your laptop"+powerButton);
		return powerButton;
	}
	public static void runEclipse() {
		System.out.println("Eclpise is running");
	
	}
	public static void runGoogleChrome() {
		System.out.println("Goole Chrome is running");
		System.out.println("What are you looking for ? ");
	}
	public boolean shutDown () {
		return powerButton;
	}

}
