import java.util.*;
import java.text.DecimalFormat;
public class VoronoiVillages {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.0");
		ArrayList<Integer> list = new ArrayList<>();
		ArrayList<Double> list2 = new ArrayList<>();
		ArrayList<Double> list3 = new ArrayList<>();
		int n = input.nextInt();
		for(int i = 0; i<n; i++) {
			list.add(input.nextInt());
		}
		 Collections.sort(list);
		 for(int b = 0; b < n-1; b++) {
			 list2.add(((double)((list.get(b+1) - list.get(b)))/2.0)+list.get(b));
		 }
		 for(int c = 0; c < n-2; c++) {
			 list3.add((list2.get(c+1) - list2.get(c)));
		 }
		 Collections.sort(list3);
		 System.out.print(df.format(list3.get(0)));
	}
}