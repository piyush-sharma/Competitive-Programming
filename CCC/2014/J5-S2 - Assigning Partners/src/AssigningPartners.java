import java.util.*;
public class AssigningPartners {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numStudents = input.nextInt();
		input.nextLine();
		String line1 [] = input.nextLine().trim().split("\\s+");
		String line2 [] = input.nextLine().trim().split("\\s+");
		
		HashMap<String, String> names1 = new HashMap<>();
		HashMap<String, String> names2 = new HashMap<>();
	
		boolean good = true;
		
		for(int i = 0; i < numStudents; i++){
			names1.put(line1[i], line2[i]);
			names2.put(line2[i], line1[i]);
		}
		for(int n = 0; n < numStudents; n++){
			if(line1[n].equals(line2[n])){
				good = false;
				break;
			}
			else if(names1.get(line1[n]).equals(names2.get(line1[n]))){
				good = true;
			}
			else{
				good = false;
				break;
			}
		}
		if(good)
			System.out.print("good");
		else
			System.out.print("bad");
	}
}