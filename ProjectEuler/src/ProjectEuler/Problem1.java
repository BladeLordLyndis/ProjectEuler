package ProjectEuler;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Problem1 {
  public static void main(String[] args) {
    HashMap<Integer, Boolean> multiples = new HashMap<Integer, Boolean>();
    int multiple = 1;
    
    while (multiple * 3 < 1000) {
      multiples.put(multiple * 3, true);
      multiple++;
    }
    
    multiple = 1;
    while (multiple * 5 < 1000) {
      multiples.put(multiple * 5, true);
      multiple++;
    }
  
    int sum = 0;
    Iterator it = multiples.entrySet().iterator();
    while (it.hasNext()) {
      Map.Entry pair = (Map.Entry)it.next();
      sum += (int) pair.getKey();
    }
    
    System.out.println(sum);
  }
}
