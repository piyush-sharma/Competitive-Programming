import java.util.*;
public class TimeOnTasks {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int totalmins = input.nextInt();
		
		int numchores = input.nextInt();
		
		int choremins[] = new int[numchores];
		
		for(int i = 0; i < numchores; i++)
		{
			choremins[i] = input.nextInt();
		}
		
		Arrays.sort(choremins);
		
		int completedchores = 0;
		for(int n = 0; n < choremins.length; n++)
		{
			if(totalmins < 0)
			{
				break;
			}
			totalmins -= choremins[n];
			if(totalmins >= 0)
			{
				completedchores++;
		    }
			
		}
			System.out.print(completedchores);
	}

}
