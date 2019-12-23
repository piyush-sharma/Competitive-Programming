import java.util.*;
public class DoNotPassMeTheBall {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		System.out.print(((n-1)*(n-2)*(n-3))/6);
	}
}