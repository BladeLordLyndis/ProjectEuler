package ProjectEuler;

import java.util.Scanner;

public class Problem4 {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    int digits = keyboard.nextInt();
    long largestValueForProduct = getLargestValueForNumberOfDigits(digits * 2) + 1;
    long palindrome = nextPalindrome(largestValueForProduct);
    long largestDivisor = getLargestValueForNumberOfDigits(digits);
    
    boolean foundSolution = false;
    while (palindrome > 0) {
      for (long divisor = largestDivisor; palindrome / divisor <= largestDivisor; --divisor) {
        if (palindrome % divisor == 0) {
          foundSolution = true;
        }
      }
      if (foundSolution) {
        break;
      }
      palindrome = nextPalindrome(palindrome);
    }
    System.out.println(palindrome);
    keyboard.close();
  }
  
  private static long nextPalindrome(long number) {
    String numberString = String.valueOf(number);
    boolean isEven = numberString.length() % 2 == 0 ? true : false;
    int numberOfDigits = (numberString.length() + 1) / 2;
    long firstHalfDigits = Long.valueOf(numberString.substring(0, numberOfDigits));
    
    if (firstHalfDigits > 1) {
      --firstHalfDigits;
      numberString = String.valueOf(firstHalfDigits);
      int newNumberOfDigits = numberString.length();

      boolean isFewerDigitsNow = numberOfDigits - newNumberOfDigits == 0 ? false : true;
      
      if (isFewerDigitsNow || isEven) {
        for (int digit = numberString.length() - 1; digit >= 0; --digit) {
          numberString += numberString.charAt(digit);
        }
      } else {
        for (int digit = numberString.length() - 2; digit >= 0; --digit) {
          numberString += numberString.charAt(digit);
        }
      }
    } else {
      numberString = String.valueOf(0);
    }
    return Long.valueOf(numberString);
  }
  
  private static long getLargestValueForNumberOfDigits(int digits) {
    StringBuilder numberString = new StringBuilder();
    for (int digit = digits; digit > 0; --digit) {
      numberString.append("9");
    }
    return Long.valueOf(numberString.toString());
  }
}
