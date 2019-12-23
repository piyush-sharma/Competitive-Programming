import java.util.*;
public class ArrivalTime {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		int hour = Integer.parseInt(str.substring(0, str.indexOf(':')));
		int min = Integer.parseInt(str.substring(3));
		double regMins = 2*60;
		while(regMins > 0) {
			if((hour >= 7 && hour < 10) || (hour >= 15 && hour < 19)) {
				regMins -= 0.5;
			}
			else {
				regMins--;
			}
			min++;
			if(min == 60) {
				min = 0;
				hour++;
				if(hour == 24) {
					hour = 0;
				}
			}
		}
		if(hour<10) {
			System.out.print("0");
		}
		System.out.print(hour + ":");
		if(min < 10) {
			System.out.print("0");
		}
		System.out.print(min);
	}
}