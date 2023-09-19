import java.util.Scanner;

public class Objective5Lab4 {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int userInput;

      System.out.println("Please enter a number: ");
      userInput = scanner.nextInt();

      if(userInput % 2 == 0) {
      	System.out.println("The number is even.");
      }

      else if(userInput % 2 == 1) {
      	System.out.println("The number is odd.");
      }

     

      scanner.close();
  }
}