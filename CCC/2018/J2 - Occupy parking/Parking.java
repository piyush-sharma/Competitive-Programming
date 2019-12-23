import java.util.*;

public class Parking
{
 public static void main(String args[])
 {
  Scanner scan = new Scanner(System.in);
  
  int length;
  String one;
  String two;
  
  
  int answer = 0;
  
  length = scan.nextInt();
  scan.nextLine();
  one = scan.nextLine();
  two = scan.nextLine();
  
  for(int i = 0; i < length; i++)
  { 
   char a = one.charAt(i);
   char b = two.charAt(i);
   
   if((a == 'C') && (b == 'C'))
   {
    answer++;
   }
  }
  
  System.out.print(answer);
  
 }
}