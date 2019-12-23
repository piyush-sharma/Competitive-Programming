import java.util.*;
public class Jerseys {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int jerseys = input.nextInt();
		int athletes = input.nextInt();
		int satisfied = 0;
	    ArrayList<Character> sizes = new ArrayList<>();
	    input.nextLine();
	    for(int i = 0; i < jerseys; i++) {
	    	sizes.add(input.nextLine().charAt(0));
	    }
	    for(int a = 0; a < athletes; a++) {
	    	String str = input.nextLine();
	    	char size = str.charAt(0);
	    	int num = Integer.parseInt(str.substring(2, str.length())) - 1;
	    	char stockSize = sizes.get(num);
	      if(stockSize != 'X') {
	    	if(size == 'S'){
	    		satisfied++;
	    		sizes.set(num, 'X');
	    	}
	    	else if(size == 'M' && (stockSize == 'M' || stockSize == 'L')) {
	    		satisfied++;
	    		sizes.set(num, 'X');
	    	}
	    	else if(size == 'L' && stockSize == 'L') {
	    		satisfied++;
	    		sizes.set(num, 'X');
	    	}
	      }
	    }
	    System.out.print(satisfied);
	}
}