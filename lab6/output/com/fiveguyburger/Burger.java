package com.fiveguyburger;

public class Burger extends ParentItem {

  public Burger(int quantity, String name) {
    super(name, quantity);
    if (name.equals("LBB")) {
      this.price = 5.59;
    } else {
      this.price = 0.0;
    }
  }

}