package traditional;

/**
 * @author carora
 * @since 4/12/19
 */
public class BubbleSort implements SortingStrategy {

  @Override
  public void sort(int[] data) throws Exception {
    for (int i = 0; i < data.length; i++) {
      for (int j = 0; j < data.length - 1; j++) {
        if (data[j + 1] <= data[j]) {
          swap(data, j, j + 1);
        }
      }
    }
  }

  private void swap(int[] data, int x, int y) {
    int T = data[x];
    data[x] = data[y];
    data[y] = T;
  }
}
