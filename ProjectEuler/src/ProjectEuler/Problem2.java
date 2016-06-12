package ProjectEuler;

public class Problem2 {
  public static void main(String[] args) {
    int limit = 4000000;
    int secondPrevTerm = 1;
    int prevTerm = 2;
    int placeholder = 0;
    int sum = 0;
    
    while (prevTerm < limit) {
      if (prevTerm % 2 == 0) {
        sum += prevTerm;
      }
      placeholder = secondPrevTerm;
      secondPrevTerm = prevTerm;
      prevTerm = placeholder + secondPrevTerm;
    }
    
    System.out.println(sum);
  }
}
