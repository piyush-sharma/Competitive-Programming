import java.util.Scanner;
public class WhenYouEatYourSmarties {

	public static void main(String[] args) {
		
			Scanner scan = new Scanner(System.in);
			for(int testcases = 0; testcases < 10; testcases++)
			{
				int orange = 0;
				int blue = 0;
				int green = 0;
				int yellow = 0;
				int pink = 0;
				int violet = 0;
				int brown = 0;
				int red = 0;
				int seconds = 0;
				int colours[] = {orange, blue, green, yellow, pink, violet, brown, red};
				String colourNames[] = {"orange", "blue", "green", "yellow", "pink", "violet", "brown", "red"};
				while(true)
				{
					String colour = scan.nextLine();
					
					if(colour.equals("end of box"))
					{
						break;
					}
					for(int n = 0; n < colourNames.length; n++)
					{
						if(colour.equals(colourNames[n]))
						{
							colours[n]++;
						}
					}
				}
				seconds += colours[7]*16;
				for(int i = 0; i < colours.length - 1; i++)
				{
					if(colours[i] >= 7)
				    {
					   seconds += (colours[i]/7)*13;
				    }
					if(colours[i]%7 > 0 && colours[i]%7 < 7)
				    {
					seconds += 13;
				    }	
				}
				System.out.println(seconds);
			}
		}
	}