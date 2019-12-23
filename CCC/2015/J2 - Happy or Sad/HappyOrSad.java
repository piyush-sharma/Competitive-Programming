import java.util.*;

public class HappyOrSad
{
 public static void main(String args[])
 {
  Scanner scan = new Scanner(System.in);
  
  String line = scan.nextLine();
  
  int happyCounter = 0;
  int sadCounter = 0;
  int position = 0;
  
  while(true)
  {
	int index = line.indexOf(":-)", position);
	position = index + 1;
   
	if(index == -1)
   {
	 break;
   }
			
   else
   {
	 happyCounter++;
   }
  }
		
		position = 0;
      
  while(true)
  {
	int index = line.indexOf(":-(", position);
	position = index + 1;
   
	if(index == -1)
   {
	 break;
   }
   
	else
   {
	 sadCounter++;
   }
  }
		
		if(happyCounter > sadCounter)
      {
			System.out.print("happy");
      }
         
		else if(happyCounter < sadCounter)
      {
			System.out.print("sad");
      }
      
		else if((happyCounter == 0) && (sadCounter == 0))
      {
			System.out.print("none");
      }
      
		else
      {
			System.out.print("unsure");
      }
 }
}