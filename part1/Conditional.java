package part1;
import java.util.Scanner;

public class Conditional {
  public static void main(String[] args) {
    System.out.println("Hello, world!");
    if (true) {
      System.out.println("This code is unavoidable!");
    }

    int x = 11;
    if (x > 10) {
      System.out.println("The x was greater than 10");
    }

    if (x != 0) {
      System.out.println("The x is not equal to 0");
    }

    if (x >= 1000) {
      System.out.println("The number is at least 1000");
    }

    

    // Else
    x = 4;

    if (x > 5) {
      System.out.println("Your x is greater than five!");
    } else {
      System.out.println("Your x is five or less!");
    }

    // More Conditionals: else if
    int number = 3;

    if (number == 1) {
      System.out.println("The number is one");
    } else if (number == 2) {
      System.out.println("The given number is two");
    } else if (number == 3) {
      System.out.println("The number must be three!");
    } else {
      System.out.println("Something else!");
    }






    // Conditional Statement Expression and the Boolean Variable
    boolean isItTrue = true;
    System.out.println("The value of the boolean variable is " + isItTrue);

    int remainderValue = 7 % 2;
    System.out.println(remainderValue);

    Scanner input = new Scanner(System.in);

    System.out.print("Enter a number to modulo by 400 >>> ");
    int numberValue = Integer.valueOf(input.nextLine());

    int remainder = numberValue % 400;

    if (remainder == 0) {
      System.out.println("The number " + numberValue + " is divisible by four hundred.");
    } else {
      System.out.println("The number " + numberValue + " is not divisible by four hundred.");
    }




    // Conditional Statements and Comparing Strings
    System.out.print("Enter a string >>> ");
    String text = input.nextLine();

    if (text.equals("a string")) {
      System.out.println("Great! You read the instructions correctly.");
    } else {
      System.out.println("Missed the mark!");
    }

    input.close();





    // Logical Operators (and &&, or ||, and not !)
    System.out.println("Is the number within the range 5-10: ");
    number = 7;

    if (number >= 5 && number <= 10) {
      System.out.println("It is! :)");
    } else {
      System.out.println("It is not :(");
    }

    System.out.println("Is the number less than 0 or greater than 100");
    number = 145;

    if (number < 0 || number > 100) {
      System.out.println("It is! :)");
    } else {
      System.out.println("It is not :(");
    }

    number = 7;

    if (!(number > 4)) {
      System.out.println("The number is not greater than 4.");
    } else {
      System.out.println("The number is greater than 4.");
    }
  }
}
