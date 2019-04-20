/**
 * @author carora
 * @since 3/11/19
 */
public class CreditCardNumDecorator implements IDisplayComponent, IKeyEventHandler {

  private CreditCardNum creditCardNum;

  public CreditCardNumDecorator(CreditCardNum creditCardNum) {
    this.creditCardNum = creditCardNum;
  }

  @Override
  public String display() {
    String num = creditCardNum.display();

    if (!num.matches("\\[[0-9]{4}\\s[0-9]{4}\\s[0-9]{4}\\s[0-9]{4}\\]\\s\\s")) {
      StringBuilder builder = new StringBuilder();
      String[] stripped = num.split("\\]");
      char[] arr = stripped[0].toCharArray();
      for (int i = 0; i < arr.length; i++) {
        if (i == 5 || i == 9 || i == 13) {
          builder.append(" ");
          builder.append(arr[i]);
        } else {
          builder.append(arr[i]);
        }
      }
      builder.append("]");
      builder.append(stripped[1]);
      return builder.toString();
    }
    return num;
  }

  @Override
  public void addSubComponent(IDisplayComponent c) {
    creditCardNum.addSubComponent(c);
  }

  @Override
  public String name() {
    return this.creditCardNum.name();
  }

  @Override
  public void key(String ch, int cnt) {
    creditCardNum.key(ch, cnt);
  }

  @Override
  public void setNext(IKeyEventHandler next) {
    creditCardNum.setNext(next);
  }
}
