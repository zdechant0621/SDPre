public class Objective8Lab3 {
  public static void main(String[] args) {
    int counter = 1;

    for (int i=1; i<=20; i+=counter){
      if (i % 2 == 0)
        System.out.println(i + " is even");
      if (i % 2 == 1)
        System.out.println(i + " is odd");
    }
    
  }
}