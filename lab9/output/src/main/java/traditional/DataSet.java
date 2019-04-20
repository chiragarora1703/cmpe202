package traditional;

import java.util.ArrayList;
import java.util.List;

/**
 * @author carora
 * @since 4/12/19
 */
public class DataSet {

  private List<Integer> data = new ArrayList<>();
  private SortingStrategy strategy;
  private int[] sortedList = new int[12];

  public DataSet() {
    strategy = new BubbleSort();
    data.clear();
    data.add(198);
    data.add(56);
    data.add(12);
    data.add(34);
    data.add(62);
    data.add(99);
    data.add(145);
    data.add(87);
    data.add(26);
    data.add(37);
    data.add(13);
    data.add(16);

    for (int i = 0; i < data.size(); i++) {
      sortedList[i] = data.get(i);
    }
  }

  public void doSort() {
    try {
      strategy.sort(sortedList);
      System.out.println("List sorted with " + strategy.toString());
    } catch (Exception e) {
      System.out.println(e);
    }
  }

  public void display() {
    for (int i = 0; i < sortedList.length; i++) {
      System.out.println(sortedList[i]);
    }
  }

  public void resetData() {
    for (int i = 0; i < data.size(); i++) {
      sortedList[i] = data.get(i);
    }
    System.out.println("Data Reset Done!");
  }

  public void changeStrategy(SortingStrategy s) {
    strategy = s;
  }
}
