import java.util.*;

public class TournamentSelection
{
 public static void main(String args[])
 {
  Scanner scan = new Scanner(System.in);
  int wins = 0;
  int losses = 0;
  
  String c;
  
  for(int i = 1; i <= 6; i++)
  {
   c = scan.nextLine();
   
   if(c.equals("W"))
   {
    wins++;
   }
   
   if(c.equals("L"))
   {
    losses++;
   }
  }
   
   if((wins == 5) || (wins == 6))
   {
    System.out.print("1");
   }
   
   
   if((wins == 3) || (wins == 4))
   {
    System.out.print("2");
   }


  if((wins == 1) || (wins == 2))
   {
    System.out.print("3");
   }
   
  if(wins == 0)
   {
    System.out.print("-1");
   }

   
   
   }
  }
