package part1;

// 1.4
import java.util.Scanner;

public class Variables {
  public static void main(String[] args) {

    String text = "Contains text";
    int number = 123;
    double floatingPoint = 1.12345;
    boolean isStudent = true;

    System.out.println("Text variable: " + text);
    System.out.println("Integer variable: " + number);
    System.out.println("Floating-point variable: " + floatingPoint);
    System.out.println("Boolean: " + isStudent);

    number = 500;
    System.out.println("Integer variable: " + number);

    // ------

    Scanner input = new Scanner(System.in);

    System.out.print("Enter you age >>> ");
    // Reading Integers
    int age = Integer.valueOf(input.nextLine());
    System.out.println("I'm " + age + " years old.");

    input.close();

    String valueAsString = "42.42";
    // Reading Double
    double value = Double.valueOf(valueAsString);
    System.out.println(value);
  }
}