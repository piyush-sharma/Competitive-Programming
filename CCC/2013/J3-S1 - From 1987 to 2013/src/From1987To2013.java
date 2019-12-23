import java.util.*;
public class From1987To2013 {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		int year = input.nextInt() + 1;
		
		
		boolean bool = true;
		while(true)
		{
	     
		String str = Integer.toString(year);
		for(int i = 0; i < str.length(); i++)
		{
			int counter = 0;
			char c = str.charAt(i);
			for(int n = 0; n < str.length(); n++)
			{
				if(c == str.charAt(n))
				{
				 counter++;
				}
			}
			if(counter > 1)
			{
				bool = false;
				break;
			}
		}
		if(bool)
		{
			break;
		}
		else 
		{
			bool = true;
			year++;
		}
		
		}
		System.out.print(year);
	}

}
