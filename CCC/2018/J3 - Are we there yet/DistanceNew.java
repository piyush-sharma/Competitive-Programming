import java.util.*;

public class DistanceNew
{
 public static void main(String args[])
 {
  Scanner scan = new Scanner(System.in);
  int distance1;
  int distance2;
  int distance3;
  int distance4;
  
  distance1 = scan.nextInt();
  distance2 = scan.nextInt();
  distance3 = scan.nextInt();
  distance4 = scan.nextInt();
  
  int city1 = 0;
  int city2 = city1 + distance1;
  int city3 = city2 + distance2;
  int city4 = city3 + distance3;
  int city5 = city4 + distance4;
 
  System.out.println(city1 + " " + city2 + " " + city3 + " " + city4 + " " + city5);
  System.out.println((city2-city1) + " " + (city2-city2) + " " + (city3-city2) + " " + (city4-city2) + " " + (city5-city2));
  System.out.println((city3-city1) + " " + (city3-city2) + " " + (city3-city3) + " " + (city4-city3) + " " + (city5-city3));
  System.out.println((city4-city1) + " " + (city4-city2) + " " + (city4-city3) + " " + (city4-city4) + " " + (city5-city4));
  System.out.print((city5-city1) + " " + (city5-city2) + " " + (city5-city3) + " " + (city5-city4) + " " + (city5-city5));



   }
}
    
