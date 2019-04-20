/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */

import java.util.ArrayList;
import java.util.Stack;

public class Screen implements IScreen, IDisplayComponent {
  private ArrayList<IDisplayComponent> components = new ArrayList<IDisplayComponent>();
  private IKeyEventHandler chain;
  private Stack<String> state = new Stack<>();

  public Screen() {
    // no constructor elements
  }

  public void key(String ch, int cnt) {
    chain.key(ch, cnt);
  }

  public void addSubComponent(IDisplayComponent c) {
    components.add(c);
    if (components.size() == 1) {
      chain = (IKeyEventHandler) c;
      this.state.add(c.name());
    } else {
      IKeyEventHandler prev = (IKeyEventHandler) components.get(components.size() - 2);
      prev.setNext((IKeyEventHandler) c);
    }
  }

  public String display() {
    String value = "";
    for (IDisplayComponent c : components) {
      value = value + c.display();
    }
    return value;
  }

  public String name() {
    if (state.size() == 1) {
      return "PREV:" + "" + " CURR:" + (this.state.get(state.size()-1));
    }
    return "PREV:" + (this.state.get(state.size()-2) + " CURR:" + (this.state.get(state.size()-1));
  }

  public void setState(IDisplayComponent state) {
    if (this.state != state.name()) {
      this.previousState = this.state;
      this.state = state.name();
    }
  }
}
