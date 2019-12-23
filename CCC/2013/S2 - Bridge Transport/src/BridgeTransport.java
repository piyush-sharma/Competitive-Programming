import java.util.*;
public class BridgeTransport {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> onBridge = new ArrayList<>();
		int max = input.nextInt();
		int numCars = input.nextInt();
		int transported = 0;
		while(input.hasNextInt()) {
			int i = input.nextInt();
			if(onBridge.size() == 4) {
			    onBridge.remove(0);
			}
			if(listSum(onBridge)+i <= max) {
				onBridge.add(i);
				transported++;
			}
			else {
				break;
			}
		}
		System.out.print(transported);
	}
public static int listSum(ArrayList<Integer> onBridge) {
	int sum = 0;
	for(int s = 0; s < onBridge.size(); s++) {
		sum+=onBridge.get(s);
	}
	return sum;
 }
}
