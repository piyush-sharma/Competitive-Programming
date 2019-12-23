import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		String one = str.substring(0, 3);
		char two = str.charAt(3);
		String three = str.substring(4);
		boolean b = false;
		if(two == ' ' && three.length() == 7) {
			b = true;
		}
		if(one.equals("416") && b) {
			System.out.print("valuable");
		}
		else if((one.equals("647") || one.equals("437")) && b){
			System.out.print("valueless");
		}
		else {
			System.out.print("invalid");
		}
	}
}