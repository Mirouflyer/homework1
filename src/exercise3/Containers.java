package exercise3;
import java.util.Scanner;
public class Containers {

	public static void main(String[] args) {
		int [] numbers = new int [5];
		Scanner getNumbers = new Scanner(System.in);
		System.out.println("Please Enter some numbers:");
		for(int i=0;i<numbers.length;i++) {
			numbers[i] = getNumbers.nextInt();
			
		}
		getNumbers.close();
		for (int j=0; j<numbers.length;j++) {
			System.out.print(numbers[j]+"," );
		}

	}

}
