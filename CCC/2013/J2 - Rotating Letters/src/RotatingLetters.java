import java.util.*;
public class RotatingLetters {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String word = scan.nextLine();
		boolean b = true;
		for(int i = 0; i < word.length(); i++)
		{
			char c = word.charAt(i);
			if(c != 'I' && c != 'O' && c != 'S' && c != 'H' && c != 'Z' && c != 'X' && c != 'N')
			{
				b = false;
				break;
			}
		}
		if(b)
		{
			System.out.print("YES");
		}
		else
		{
			System.out.print("NO");
		}
	}
}