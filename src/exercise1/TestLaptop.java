package exercise1;
import java.util.Scanner;
public class TestLaptop {

	public static void main(String[] args) {
		
		Laptop startPc = new Laptop(true,"Welcome to your World");
		startPc.powerOn(true);
		System.out.println(startPc.welcomeMessage);
		
		Laptop pcAccess = new Laptop("magic word"); 
		Scanner input = new Scanner (System.in);
		System.out.println("Please Enter "+pcAccess.passWord);
		int numPassWord = input.nextInt();
		
		if ( numPassWord == 1234) {
			
			System.out.println("Here you are !!!!");
		}else {
			System.out.println("Try again!!!");
		}
		input.close();
		
		Laptop.runEclipse();
		
		Laptop.runGoogleChrome();
		
		Laptop turnOff = new Laptop ();
		System.out.println("The Laptop is shuting down......");
		turnOff.shutDown();
		
		
		
		

	}

}
