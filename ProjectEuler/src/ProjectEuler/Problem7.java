package ProjectEuler;

import java.util.Scanner;

public class Problem7 {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    int nthTerm = keyboard.nextInt();
    int limit = (nthTerm - 2) * 12;
    boolean[] composites = new boolean[limit + 1];
    
    // Mark the composites
    for (int number = 2; number <= limit; ++number) {
      if (composites[number] == false) {
        int multiple = 2;
        int composite = number * multiple;
        while (composite <= limit) {
          composites[composite] = true;
          ++multiple;
          composite = number * multiple;
        }
      }
    }
    
    int currentPrime = 0;
    for (int number = 2; number <= limit; ++number) {
      if (composites[number] == false) {
        ++currentPrime;
      }
      if (currentPrime == nthTerm) {
        System.out.println("Answer: " + number);
        break;
      }
    }
  }
}
