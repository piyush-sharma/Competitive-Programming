import java.util.*;
public class HiddenPalindrome
 {
  public static void main(String args[])
  {
   Scanner input = new Scanner(System.in);
   String word = input.nextLine();
	int num = 0;
	for(int begin = 0; begin < word.length() - 2; begin++)
   {
	 String one = word.substring(begin, word.length());
	 for(int end = one.length();end >= 2; end--)
    {
	 String two = one.substring(0, end);
    String reverse = new StringBuilder(two).reverse().toString();
    if(two.equals(reverse))
    {
	 if(two.length() > num)
     {
		num = two.length();
	  }
    }
    }
   }
	System.out.print(num);
 }
}

