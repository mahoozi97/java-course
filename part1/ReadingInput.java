package part1;

// 1.3
import java.util.Scanner;

public class ReadingInput {
  public static void main(String[] args) {
    // For reading input, we use the Scanner tool that comes with Java.
    Scanner input = new Scanner(System.in);

    // We can now use the scanner tool.
    // This tool is used to read input.

    System.out.print("Enter your name >>> ");
    String name = input.nextLine();

    System.out.print("Enter your age >>> ");
    String age = input.nextLine();

    System.out.println("Name: " + name);
    System.out.println("Age: " + age);

    input.close();
  }
}