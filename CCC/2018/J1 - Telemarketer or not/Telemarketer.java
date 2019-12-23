import java.util.*;

public class Telemarketer
{
 public static void main(String args[])
 {
  int one, two, three, four;
  
  Scanner scan = new Scanner(System.in);
  
  one = scan.nextInt();
  two = scan.nextInt();
  three = scan.nextInt();
  four = scan.nextInt();
  
  if(((one == 8) || (one == 9)) && ((four == 8) || (four == 9)) && (two==three))
  {
   System.out.print("ignore");
  }
  else
  {
   System.out.print("answer");
  }
  
 }
}