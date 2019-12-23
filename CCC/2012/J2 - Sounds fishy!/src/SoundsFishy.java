import java.util.*;
public class SoundsFishy {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		int d = input.nextInt();
		
		if(a == b && a == c && a == d){
			System.out.print("Fish At Constant Depth");
		}
		else if(a < b && b < c && c < d){
			System.out.print("Fish Rising");
		}
		else if(a > b && b > c && c > d){
			System.out.print("Fish Diving");
		}
		else {
				System.out.print("No Fish");
			}
	}
}