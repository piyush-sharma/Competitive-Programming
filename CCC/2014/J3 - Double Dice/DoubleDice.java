import java.util.*;

public class DoubleDice
{
 public static void main(String args[])
 {
  Scanner scan = new Scanner(System.in);
  
  int rounds;
  
  int davidScore = 100;
  int antoniaScore = 100;
  
  rounds = scan.nextInt();
  
  for(int i = 0; i < rounds; i++)
  {
   int antoniaRoll = scan.nextInt();
   int davidRoll = scan.nextInt();
   
   if(davidRoll > antoniaRoll)
   {
    antoniaScore = antoniaScore - davidRoll;
   }
   else if(antoniaRoll > davidRoll)
   {
    davidScore = davidScore - antoniaRoll;
   }
  }
   System.out.println(antoniaScore);
   System.out.println(davidScore);
   
  
 }
}