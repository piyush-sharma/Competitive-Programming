import java.util.*;
public class NextInLine {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		int young = scan.nextInt();
		int middle = scan.nextInt();
		
		int difference = middle - young;
		
		System.out.print(middle + difference);

	}

}
