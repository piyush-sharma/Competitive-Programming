import java.util.*;

public class VoteCount
{
 public static void main(String args[])
 {
  Scanner scan = new Scanner(System.in);
  
  int total;
  
  total = scan.nextInt();
  scan.nextLine();
  String line = scan.nextLine();
  
  int singerA = 0;
  int singerB = 0;
  
  
  for(int i = 0; i <= line.length(); i++)
  {
   char c = line.charAt(i); 
   
   if(c == 'A')
   {
    singerA++;
   }
   
   if(c == 'B')
   {
    singerB++;
   }
   
   if(i == line.length() - 1)
   {
    break;
   }
  }
  
  if(singerA > singerB)
  {
   System.out.println("A");
  }
  
  else if(singerA < singerB)
  {
   System.out.println("B");
  }
  
  else
  {
   System.out.print("Tie");
  }
  
 }
}
  
  
