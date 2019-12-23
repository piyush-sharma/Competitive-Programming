import java.util.*;
public class AnArithmeticProblem {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		int one = Integer.parseInt(str.substring(0, str.indexOf("+")).trim());
		int two = Integer.parseInt(str.substring(str.indexOf("+")+1, str.indexOf("=")).trim());
		int three = Integer.parseInt(str.substring(str.indexOf("=")+1).trim());
		if(one + two == three) 
			System.out.println("True");
		else
			System.out.println("False");
	}
}
