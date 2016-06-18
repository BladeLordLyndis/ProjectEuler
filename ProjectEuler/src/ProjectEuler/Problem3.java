package ProjectEuler;

import java.util.HashMap;
import java.util.Scanner;

public class Problem3 {
  public static void main(String[] args) throws Exception {
    // Problem 3: 600851475143
    Scanner keyboard = new Scanner(System.in);
    long input = keyboard.nextLong();
    long largestPossiblePrime = (long) Math.sqrt(input);
    HashMap<Long, Boolean> lookUpTable = new HashMap<Long, Boolean>();
    for (long base = 2; base <= largestPossiblePrime; ++base) {
      if (lookUpTable.get(base) == null) {
        long multiple = 2;
        long product = base * multiple;
        while (product <= largestPossiblePrime) {
          lookUpTable.put(product, true);
          ++multiple;
          product = base * multiple;
        }
      }
    }
    
    for (long number = largestPossiblePrime; number >= 2; --number){
      if (lookUpTable.get(number) == null && input % number == 0) {
        System.out.println(number);
        break;
      }
    }
  }
}
