
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TimeComplexityCalculator {
	public static void main(String[] args) throws FileNotFoundException {
		// File to be scanned
		File file = new File("sample.txt");
		// Create scanner to scan the file
		Scanner scanner = new Scanner(file);

		int operations = 0;
		int loops = 0;

		// Loop through the file until there are no more lines to read
		while (scanner.hasNextLine()) {
			// Read the current line
			String line = scanner.nextLine();

			// Count the number of operations
			if (line.contains("+") || line.contains("-") || line.contains("*") || line.contains("/")) {
				operations++;
			}
			// Count the number of loops
			if (line.contains("for") || line.contains("while") || line.contains("do-while")) {
				loops++;
			}
		}

		// Calculate and output the time complexity
		if (loops == 0) {
			System.out.println("Time complexity: O(N)");
		} else {
			int complexity = loops * operations;
			System.out.println("Time complexity: O(" + complexity + "N)");
		}
		
		// Close the scanner
		scanner.close();
	}
}