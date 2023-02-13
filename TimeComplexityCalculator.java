
import java.io.File;
import java.util.Scanner;

public class TimeComplexity {

    public static void main(String[] args) throws Exception {
	    
	
	//File Name has to be CORRECT
        Scanner sc = new Scanner(new File("YOUR_CODE_HERE.txt"));
        int operations = 0;
        int loops = 0;
        int nestedLoops = 0;
        boolean nestedExist = false;

        while(sc.hasNext()) {
            String line = sc.nextLine();
            if(line.contains("+") || line.contains("/")|| line.contains("*")|| line.contains("-") || 
            		line.contains("==")|| line.contains("+=") || line.contains("-=")|| line.contains("=")) {
                operations++;
            }
            if(line.contains("for") || line.contains("while") || line.contains("do")) {
                loops++;
                if(line.contains("for") && line.contains("{")) {
                    nestedLoops++;
                    nestedExist = true;
                }
            }
        }

        System.out.println("Number of Operations: " + operations);
        System.out.println("Number of Loops: " + loops);
        System.out.println("Number of Nested Loops: " + nestedLoops);
        System.out.println("----------------------");
        if (nestedExist) {
            System.out.println("Time Complexity: O(N^" + (nestedLoops) + ")");
		}
        if (!nestedExist) {
            System.out.println("Time Complexity: O(" + (loops) + "N)");
		}
    }
}
