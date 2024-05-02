import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * This program reads and writes to a file the sum of a set of ints.
 *
 * @author Ioana Marinescu
 * @version 1.0
 * @since 2024-04-01
 */
@SuppressWarnings("HideUtilityClassConstructor")
public class Factorial {
  /** Constructor for the ReverseString class. */
  public Factorial() {
    // empty constructor
  }

  /**
   * Reads input from a file, reverses string, and write to an output file.
   *
   * @param args Command line arguments (unused).
   */
  public static void main(final String[] args) {
    try {
      // File paths
      String in = "Unit3/Unit3-02/Unit3-02-Java-Factorial/input.txt";
      String out = "Unit3/Unit3-02/Unit3-02-Java-Factorial/output.txt";
      File inputFile = new File(in);
      File outputFile = new File(out);

      // Initializing scanner and writer
      Scanner scanner = new Scanner(inputFile);
      FileWriter writer = new FileWriter(outputFile);

      // variables
      int fileLine;

      // loops until there is nothing to read
      while (scanner.hasNextLine()) {
        // reads a single line
        fileLine = scanner.nextInt();

        // call the recursive function
        int result = recFac(fileLine);

        // write to file
        writer.write(result + "\n");
      }
      // message to console confirming the process finished with no errors
      System.out.println("Successfully completed task!");

      // close scanner and writer
      scanner.close();
      writer.close();

      // file could not be found
    } catch (IOException e) {
      System.out.println("The file does not exists.");
    } catch (InputMismatchException e) {
      System.out.println("Invalid datatype found in input file.");
    }
  }

  /**
   * This function calculates the factorial, recursively
   *
   * @param n
   * @return an integer value (the factorial)
   */
  public static int recFac(int n) {
    // Base case n is 0
    if (n == 0) {
      return 1;

      // call recursive and multiply result with n
    } else {
      return recFac(n - 1) * n;
    }
  }
}
