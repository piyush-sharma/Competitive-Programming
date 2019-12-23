import java.util.Scanner;
public class SpeedingFines {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the speed limit:");
		int limit = input.nextInt();
		System.out.print("Enter the recorded speed of the car:");
		int speed = input.nextInt();
		
		int diff = speed - limit;
		
		if(diff >= 1 && diff <= 20){
			System.out.print("You are speeding and your fine is $100.");
		}
		else if(diff >= 21 && diff <= 30){
			System.out.print("You are speeding and your fine is $270.");
		}
		else if(diff >= 31){
			System.out.print("You are speeding and your fine is $500.");
		}
		else{
			System.out.print("Congratulations, you are within the speed limit!");
		}
	}
}
