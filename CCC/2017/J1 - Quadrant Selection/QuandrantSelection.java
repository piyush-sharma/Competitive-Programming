import java.util.*;
public class QuandrantSelection
{
 public static void main(String args[])
 {
  int x;
  int y;
  
  Scanner scan = new Scanner(System.in);
  
  x = scan.nextInt();
  y = scan.nextInt();
  
  
  
  if(x > 0 && y > 0)
  {
   System.out.print("1");
  }
  if(x > 0 && y < 0)
  {
   System.out.print("4");
  }
  if(x < 0 && y > 0)
  {
   System.out.print("2");
  }
  if(x < 0 && y < 0)
  {
   System.out.print("3");
  }
  
 }

}
 
