import java.util.*;

public class ExactlyElectrical
{
 public static void main(String args[])
 {
  Scanner scan = new Scanner(System.in);
  
  int startX = scan.nextInt();
  int startY = scan.nextInt();
  
  int endX = scan.nextInt();
  int endY = scan.nextInt();
  
  int charge = scan.nextInt();
  
  int distanceX = Math.abs(startX - endX);
  int distanceY = Math.abs(startY - endY);
  
  charge = charge - (distanceX + distanceY);
  
  if(charge < 0)
  {
   System.out.println("N");
  }
  
  else if(charge%2 == 1)
  {
   System.out.println("N");
  }
  
  else
  {
   System.out.println("Y");
  }
 }
} 