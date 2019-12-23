import java.util.*;

public class MunchNBrunch 
{
public static void main(String[] args) 
 {
	Scanner scan = new Scanner(System.in);
	for(int testcases = 0; testcases < 10; testcases++)
	{
	int cost = scan.nextInt();
	double one = scan.nextDouble();
	double two = scan.nextDouble();
    	double three = scan.nextDouble();
	double four = scan.nextDouble();
	int students = scan.nextInt();
	
	int yearone = (int)(one*students);
	int yeartwo = (int)(two*students);
	int yearthree = (int)(three*students);
	int yearfour = (int)(four*students);
	
    int remainder = students - yearone - yeartwo - yearthree - yearfour;
    
    if(remainder != 0)
    {
    	if(yearone > yeartwo && yearone > yearthree && yearone > yearfour)
    	{
    		yearone += remainder;
    	}
    	
    	if(yeartwo > yearone && yeartwo > yearthree && yeartwo > yearfour)
    	{
    		yeartwo += remainder;
    	}
    	
    	if(yearthree > yearone && yearthree > yeartwo && yearthree > yearfour)
    	{
    		yearthree += remainder;
    	}
    	
    	else
    	{
    		yearfour += remainder;
    	}
    }
	int profit = (yearone*12) + (yeartwo*10) + (yearthree*7) + (yearfour*5);
	if((int)(profit*0.5) >= cost)
	{
		System.out.println("NO");
	}
	else{
		System.out.println("YES");
	}
   }
 }
}
