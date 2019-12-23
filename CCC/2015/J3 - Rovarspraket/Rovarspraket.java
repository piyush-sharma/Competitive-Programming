import java.util.*;

public class Rovarspraket
{
 public static void main(String args[])
 {
  Scanner scan = new Scanner(System.in); 
  String word = scan.nextLine();
  String alphabet = "abcdefghijklmnopqrstuvwxyz";
  
  for(int i = 0; i < word.length(); i++)
  {
   char c = word.charAt(i);
   System.out.print(c);
   if(!((c == 'a') || (c == 'e') || (c == 'i') || (c == 'o') || (c == 'u')))
   {
   int n = alphabet.indexOf(c);
   if((n >= 1) && (n <= 2))
   {
    System.out.print("a");
   }
    if((n >= 3) && (n <= 6))
   {
    System.out.print("e");
   }
    if((n >= 7) && (n <= 11))
   {
    System.out.print("i");
   }
   if((n >= 12) && (n <= 17))
   {
    System.out.print("o");
   }
    if((n >= 18) && (n <= 25))
   {
    System.out.print("u");
   }
if(c != 'z')
{
char d = alphabet.charAt(n+1);
   if((d == 'a') || (d == 'e') || (d == 'i') || (d == 'o') || (d == 'u'))
   {
   System.out.print(alphabet.charAt(n+2));
   }
   else
   {
    System.out.print(alphabet.charAt(n+1));
   }
 }  
 if(c == 'z')
   {
    System.out.print("z");
   }
    
   }
  }
 }
}
 