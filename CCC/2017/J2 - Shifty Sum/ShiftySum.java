import java.util.*;
public class ShiftySum
{
 public static void main(String args[])
 {
  int n;
  int k;
  int sum = 0;
  Scanner scan = new Scanner(System.in);
  
  n = scan.nextInt();
  k = scan.nextInt();
  for(int counter = 1; counter <= k; counter++)
  {
   sum = sum + (n*((int)(Math.pow(10, counter))));
  }
  sum = sum + n;
  System.out.print(sum);
 }
}
  

  