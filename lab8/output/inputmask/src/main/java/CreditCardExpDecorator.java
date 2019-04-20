/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */

public class CreditCardExpDecorator implements IDisplayComponent, IKeyEventHandler {

  CreditCardExp cardExp;

  public CreditCardExpDecorator(CreditCardExp cardExp) {
    this.cardExp = cardExp;
  }

  public void setNext(IKeyEventHandler next) {
    this.cardExp.setNext(next);
  }

  public String display() {
    StringBuilder builder = new StringBuilder();
    String exp = this.cardExp.display();
    if (!exp.contains("MM/")) {
      String[] arr = exp.split("\\[|\\]|\\s");
      String experiment = arr[1];
      builder.append("[");
      char[] carr = experiment.toCharArray();
      for (int i = 0; i < carr.length; i++) {
        if (i == 2) {
          builder.append("/");
        }
        builder.append(carr[i]);
      }
      builder.append("]  ");
      return builder.toString();
    }
    return exp;
  }

  public void key(String ch, int cnt) {
    this.cardExp.key(ch, cnt);
  }

  public void addSubComponent(IDisplayComponent c) {
    return; // do nothing
  }

  @Override
  public String name() {
    return this.cardExp.name();
  }

}