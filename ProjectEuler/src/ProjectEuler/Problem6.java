package ProjectEuler;

import java.util.Scanner;

public class Problem6 {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    long largestNumber = keyboard.nextLong();
    long sum = 0;
    long sumProds = 0;
    for(long currentNumber = 1; currentNumber <= largestNumber; ++currentNumber) {
      sumProds += currentNumber * currentNumber;
      sum += currentNumber;
    }
    sum *= sum;
    
    long answer = Math.abs(sumProds - sum);
    
    System.out.println(answer);
  }
}
