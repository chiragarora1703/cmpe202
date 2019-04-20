/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */

import java.util.Stack;

public class CreditCardNum implements IDisplayComponent, IKeyEventHandler {

  private IKeyEventHandler nextHandler;
  private Stack<String> number = new Stack<String>();
  private Screen screen;

  public CreditCardNum(Screen screen) {
    this.screen = screen;
  }

  public void setNext(IKeyEventHandler next) {
    this.nextHandler = next;
  }

  public String display() {
    String val = "";
    if (number.isEmpty()) {
      val = "4444 4444 4444 4444";
    } else {
      val = String.join("", number);
    }
    return "[" + val + "]" + "  ";
  }

  public void key(String ch, int cnt) {
    if (cnt >= 1 && cnt <= 16) {
      screen.setState(this);
      if (ch.equalsIgnoreCase("X")) {
        number.pop();
      } else {
        number.add(ch);
      }
    } else if (nextHandler != null)
      nextHandler.key(ch, cnt);
  }

  public void addSubComponent(IDisplayComponent c) {
    return; // do nothing
  }

}