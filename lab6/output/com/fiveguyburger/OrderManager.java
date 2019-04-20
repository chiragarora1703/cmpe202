package com.fiveguyburger;

import java.util.ArrayList;
import java.util.List;

public class OrderManager {

  protected List<MenuItem> menuItems = new ArrayList<>();

  public List<MenuItem> getMenuItems() {
    return menuItems;
  }

  public void addChild(MenuItem c) {
    this.menuItems.add(c);
  }


}
