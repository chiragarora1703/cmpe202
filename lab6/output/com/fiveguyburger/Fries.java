package com.fiveguyburger;

public class Fries extends ParentItem {

  public String size;

  public Fries(int quantity, String name, String size) {
    super(name, quantity);
    if (name.equals("CAJ")) {
      this.price = 2.79;
    } else {
      this.price = 0.0;
    }
    this.size = size;
  }


  @Override
  public String subInfo() {
    return this.size;
  }
}