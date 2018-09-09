package misc;

import java.util.ArrayList;

import org.junit.Test;

public class SetOfSetsTest {

  @Test
  public void test() {
    char[] set = {'a', 'b', 'c'};

    ArrayList<ArrayList<Character>> subsets = new ArrayList<ArrayList<Character>>();

    for (int i = 0; i < set.length; i++) {
      ArrayList<Character> subset = new ArrayList<Character>();
      for (int j = i; j < set.length; j++) {
        subset.add(set[j]);
        subsets.add(new ArrayList<Character>(subset));
      }
    }

    for (ArrayList<Character> subset : subsets) {
      for (Character c : subset) {
        System.out.print(c + " ");
      }
      System.out.println();
    }
  }
}
