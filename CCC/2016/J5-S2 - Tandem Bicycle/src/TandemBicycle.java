import java.util.*;
public class TandemBicycle {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int type = input.nextInt();
		int n = input.nextInt();
		input.nextLine();
		String lineA [] = input.nextLine().trim().split("\\s+");
		String lineB [] = input.nextLine().trim().split("\\s+");
		ArrayList<Integer> line1 = new ArrayList<>();
		ArrayList<Integer> line2 = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			line1.add(Integer.parseInt(lineA[i]));
			line2.add(Integer.parseInt(lineB[i]));
		}
		if(type == 1) {
			findMin(line1, line2);
		}
		if(type == 2) {
			findMax(line1, line2);
		}
	}
    public static void findMin(ArrayList<Integer> line1, ArrayList<Integer> line2) {
    	Collections.sort(line1);
	Collections.sort(line2);
    	Collections.reverse(line1);
    	Collections.reverse(line2);
    	int sumMin = 0;
	    for(int a = 0; a < line1.size(); a++) {
	    	sumMin += Math.max(line1.get(a), line2.get(a));
	    }
	    System.out.print(sumMin);
     }
    public static void findMax(ArrayList<Integer> line1, ArrayList<Integer> line2) {
	    Collections.sort(line1);
	    Collections.sort(line2);
	    Collections.reverse(line2);
	    int sumMax = 0;
	    for(int a = 0; a < line1.size(); a++) {
	    	sumMax += Math.max(line1.get(a), line2.get(a));
	    }
	    System.out.print(sumMax);
 }
}
