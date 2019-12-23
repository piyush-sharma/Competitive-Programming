import java.util.*;
public class SumGame {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int sumA = 0;
		int sumB = 0;
		int n = input.nextInt();
		input.nextLine();
		String line1 [] = input.nextLine().trim().split("\\s+");
		String line2 [] = input.nextLine().trim().split("\\s+");
		ArrayList<Integer> sumList = new ArrayList<>();
		for(int k = 0; k < n; k++) {
			int a = Integer.parseInt(line1[k]);
			int b = Integer.parseInt(line2[k]);
			sumA += a;
			sumB += b;
			if(sumA == sumB) {
				sumList.add(k+1);
			}
		}
		if(sumList.isEmpty()) {
			System.out.print("0");
		}
		else {
		System.out.print(sumList.get(sumList.size()-1));	
		}
	}
}
