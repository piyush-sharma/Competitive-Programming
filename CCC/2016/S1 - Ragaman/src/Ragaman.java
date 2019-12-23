import java.util.*;
public class Ragaman {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String one = input.nextLine();
		String two = input.nextLine();
		ArrayList<Character> list1 = new ArrayList<>();
		ArrayList<Character> line1 = new ArrayList<>();
		ArrayList<Character> list2 = new ArrayList<>();
		ArrayList<Character> line2 = new ArrayList<>();
		HashMap<Character, Integer> hm = new HashMap<>();
		HashMap<Character, Integer> hm2 = new HashMap<>();
		int total = 0;
		boolean bool = true;
		for(int i = 0; i < one.length(); i++) {
			if(list1.contains(one.charAt(i)) == false) {
				list1.add(one.charAt(i));
			}
			line1.add(one.charAt(i));
		}
		for(int n = 0; n < list1.size(); n++) {
			hm.put(list1.get(n), Collections.frequency(line1, list1.get(n)));
		}
		for(int a = 0; a < two.length(); a++) {
			if(list2.contains(two.charAt(a)) == false) {
				list2.add(two.charAt(a));
			}
			line2.add(two.charAt(a));
		}
		for(int b = 0; b < list2.size(); b++) {
			hm2.put(list2.get(b), Collections.frequency(line2, list2.get(b)));
		}
		outerloop:
		while(true) {
			if(line2.contains('*') == false) {
				for(int d = 0; d < hm.size(); d++) {
						if(hm.get(list1.get(d)) != hm2.get(list1.get(d))) {
							bool = false;
					   }
				}
				if(bool) {
					System.out.print("A");
					break outerloop;
				}
			  }
			else {
		for(int c = 0; c < hm.size(); c++) {	
			if(list2.contains(list1.get(c))){
			if(hm.get(list1.get(c)) != hm2.get(list1.get(c))) {
				total += Math.abs(hm.get(list1.get(c)) - hm2.get(list1.get(c)));
			}
		   }
			else {
				total += hm.get(list1.get(c));
			}
		  }
		 if(total == Collections.frequency(line2, '*')) {
			System.out.print("A");
			break outerloop;
		 }
		}		
		System.out.print("N");
		break;
		}
       }
	}