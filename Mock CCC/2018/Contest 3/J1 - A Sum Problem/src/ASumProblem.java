import java.util.*;
public class ASumProblem {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		int sum = 0;
		for(int i = 0; i < num; i++) {
			sum+=input.nextInt();
		}
		System.out.println(sum);
	}
}