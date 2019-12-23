import java.util.*;
public class AromaticNumbers {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		int prevRoman = 0;
		int prevProduct = 0;
		int answer = 0;
		char[] digits = str.toCharArray();
		for(int i = 0; i < digits.length; i+=2) {
			int arabic = Character.getNumericValue(digits[i]);
			int roman = converter(digits[i+1]);
			answer+=arabic*roman;
			if(roman > prevRoman) {
				answer -= (2*prevProduct);
			}
			prevProduct = arabic*roman;
			prevRoman = roman;
		  }
		System.out.print(answer);
	}
	public static int converter(char romanLetter) {
		char[] romanLetters = {'I','V','X','L','C','D','M'};
		char[] romanNums =     {1, 5, 10, 50, 100, 500, 1000};
		int result = 0;
		for(int r = 0; r < romanLetters.length; r++) {
			if(romanLetter == romanLetters[r]) {
				result = romanNums[r];
				break;
			}
		}
		return result;
	}
}