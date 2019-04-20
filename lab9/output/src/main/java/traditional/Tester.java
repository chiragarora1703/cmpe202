package traditional;

/**
 * @author carora
 * @since 4/12/19
 */
public class Tester {

  public static void main(String[] args) {
    DataSet dataSet = new DataSet();
    dataSet.display();
    dataSet.doSort();
    dataSet.display();
    dataSet.resetData();
    dataSet.display();
    dataSet.changeStrategy(new InsertionSort());
    dataSet.doSort();
    dataSet.display();
  }
}
