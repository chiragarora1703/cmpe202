package traditional;

/**
 * @author carora
 * @since 4/12/19
 */
public class InsertionSort implements SortingStrategy {

  @Override
  public void sort(int[] data) throws Exception {
    int n = data.length;
    for (int i = 1; i < n; ++i) {
      int key = data[i];
      int j = i - 1;
      while (j >= 0 && data[j] > key) {
        data[j + 1] = data[j];
        j = j - 1;
      }
      data[j + 1] = key;
    }
  }
}
