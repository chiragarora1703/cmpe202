/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */

import java.util.Stack;

public class CreditCardCVC implements IDisplayComponent, IKeyEventHandler {

  private IKeyEventHandler nextHandler;
  private Stack<String> cvc = new Stack<String>();

  private Screen screen;

  public CreditCardCVC(Screen screen) {
    this.screen = screen;
  }

  public void setNext(IKeyEventHandler next) {
    this.nextHandler = next;
  }

  public String display() {
    String val = "";
    if (cvc.isEmpty()) {
      val = "123";
    } else {
      val = String.join("", cvc);
    }
    return "[" + val + "]" + "  ";
  }

  public void key(String ch, int cnt) {
    if (cnt >= 21 && cnt <= 23) {
      screen.setState(this);
      if (ch.equalsIgnoreCase("X")) {
        cvc.pop();
      } else {
        cvc.add(ch);
      }
    } else if (nextHandler != null)
      nextHandler.key(ch, cnt);

  }

  public void addSubComponent(IDisplayComponent c) {
    return; // do nothing
  }

}