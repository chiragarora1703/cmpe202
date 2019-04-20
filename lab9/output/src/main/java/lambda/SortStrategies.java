package lambda;

/**
 * @author carora
 * @since 4/13/19
 */
public class SortStrategies {

  public static SortingStrategy BUBBLE_SORT = (data) -> {
    for (int i = 0; i < data.length; i++) {
      for (int j = 0; j < data.length - 1; j++) {
        if (data[j + 1] <= data[j]) {
          int T = data[j];
          data[j] = data[j + 1];
          data[j + 1] = T;
        }
      }
    }
  };

  public static SortingStrategy INSERTION_SORT = (data) -> {
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
  };

}
