import java.util.*;
public class SpecialDay
{
public static void main(String args[])
 {
  int month;
  int day;
   
  Scanner scan = new Scanner(System.in);
  
  month = scan.nextInt();
  day = scan.nextInt();
  
  if((month == 2) && (day == 18))
  {
   System.out.print("Special");
  }
  
  else if(((month == 2) && (day < 18)) || (month < 2))
  {
   System.out.print("Before");
  }
  
  else
  {
   System.out.print("After");
  }
 }
}
 