package ProjectEuler;

import java.util.Scanner;

public class Problem5 {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    long largestDivisor = keyboard.nextLong();
    long multiple = 1;
    long product = 0;
    boolean solutionFound = false;
    while (!solutionFound) {
      product = largestDivisor * multiple;
      solutionFound = true;
      for (long currentDivisor = largestDivisor; currentDivisor > 1; --currentDivisor) {
        if (product % currentDivisor != 0) {
          solutionFound = false;
        }
      }
      ++multiple;
    }
    System.out.println(product);
  }
}
