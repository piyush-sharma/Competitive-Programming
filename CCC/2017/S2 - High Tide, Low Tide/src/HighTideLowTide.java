import java.util.*;
public class HighTideLowTide {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		ArrayList<Integer> low = new ArrayList<>();
		ArrayList<Integer> high = new ArrayList<>();
		int n = input.nextInt();
		input.nextLine();
		String line [] = input.nextLine().trim().split("\\s+");
		for(int i = 0; i < n; i++) {
			list.add(Integer.parseInt(line[i]));
		}
		Collections.sort(list);
		if(n%2 == 0) {
		for(int a = 0; a < n; a++) {
			if(a < (n/2)) {
			  low.add(list.get(a));
			}
			if(a >= (n/2)) {
		      high.add(list.get(a));
			}
		 }
		}
		else {
			for(int a = 0; a < n; a++) {
				if(a <= (n/2)) {
				  low.add(list.get(a));
				}
				if(a > (n/2)) {
			      high.add(list.get(a));
				}
			 }
		}
		Collections.reverse(low);
		for(int b = 0; b < (n/2); b++) {
			System.out.print(low.get(b) + " ");
			System.out.print(high.get(b));
			if(b != (n/2)) {
				System.out.print(" ");
			}
		}
		if(n%2 != 0) {
			System.out.print(low.get(low.size()-1));
		}
	}
}
