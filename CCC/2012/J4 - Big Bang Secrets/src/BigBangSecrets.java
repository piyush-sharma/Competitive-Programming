import java.util.*;
public class BigBangSecrets {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int k = input.nextInt();
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		input.nextLine();
		String word = input.nextLine().toLowerCase();
		String decoded = "";
		for(int p = 0; p < word.length(); p++){
			int shift = 3*(p+1) + k;
			if(alphabet.indexOf(word.charAt(p)) - shift < 0){
				decoded += alphabet.charAt(alphabet.length() - (shift-alphabet.indexOf(word.charAt(p))));
			}
			else{
			decoded += alphabet.charAt(alphabet.indexOf(word.charAt(p)-shift));
			}
		}
		System.out.print(decoded.toUpperCase());
	}
}