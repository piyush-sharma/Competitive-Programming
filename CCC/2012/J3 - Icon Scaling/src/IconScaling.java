import java.util.*;
public class IconScaling {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		char[] icon = {'*','x','*',' ','x','x','*',' ','*'};
		int scaleFactor = input.nextInt();
		String str = "";
		for(int i = 0; i < icon.length; i++){
			for(int n = 0; n < scaleFactor; n++){
				str += icon[i];
				if(str.length() == scaleFactor*3){
					for(int y = 0; y < scaleFactor; y++){
						System.out.println(str);
					}
					str = "";
				}
			}
		}
	}
}