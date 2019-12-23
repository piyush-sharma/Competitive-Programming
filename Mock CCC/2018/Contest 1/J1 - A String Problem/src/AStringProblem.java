import java.util.*;
public class AStringProblem {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = input.nextInt()+1;
		while(true) {
			String str = Integer.toString(num);
			if(str.contains("0"))
				num++;
			else
				break;
		}
		System.out.println(num);
	}
}