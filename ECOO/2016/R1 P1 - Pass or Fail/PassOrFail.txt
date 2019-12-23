import java.util.*;
public class PassOrFail {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		for(int testcases = 0; testcases < 10; testcases++)
		{
			int testweight = scan.nextInt();
			int assignmentweight = scan.nextInt();
			int projectweight = scan.nextInt();
			int quizweight = scan.nextInt();
			
			int numstudents = scan.nextInt();
			int studentspassed = 0;
			for(int i = 0; i < numstudents; i++)
			{
				int testmark = scan.nextInt();
				int assignmentmark = scan.nextInt();
				int projectmark = scan.nextInt();
				int quizmark = scan.nextInt();
				
				int totalmark = (testweight*testmark) + (assignmentweight*assignmentmark) + (projectweight*projectmark) + (quizweight*quizmark);
				double mark = (double)(totalmark);
				
				if((mark/100) >= 50)
				{
					studentspassed++;
				}
				
			}
			System.out.println(studentspassed);
		}

	}

}
