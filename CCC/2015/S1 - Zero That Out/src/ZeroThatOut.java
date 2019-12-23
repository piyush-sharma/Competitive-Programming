import java.util.*;
public class ZeroThatOut {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int sum = 0;
		ArrayList<Integer> total = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			int p = input.nextInt();
			if(p != 0) {
				total.add(p);
			}
			else {
				total.remove(total.size()-1);
			}
		}
		for(int k = 0; k < total.size(); k++) {
			sum += total.get(k);
		}
		System.out.print(sum);
	}
}
