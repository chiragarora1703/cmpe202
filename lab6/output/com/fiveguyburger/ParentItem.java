package com.fiveguyburger;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

/**
 * @author carora
 * @since 3/11/19
 */
public class ParentItem implements MenuItem {

  protected String description;
  protected int quantity;
  protected double price;
  protected List<ISubMenuItem> subMenu = new ArrayList<>();

  public ParentItem(String desc, int quantity) {
    this.description = desc;
    this.quantity = quantity;
  }

  public ParentItem(String desc) {
    this(desc, 1);
  }

  @Override
  public void addChild(ISubMenuItem c) {
    subMenu.add(c);
  }

  @Override
  public String description() {
    return description;
  }

  @Override
  public String content(Function<List<ISubMenuItem>, List<ISubMenuItem>> comparator) {
    List<ISubMenuItem> subMenuItems = comparator.apply(subMenu);

    StringBuilder builder = new StringBuilder();
    for (ISubMenuItem subMenu : subMenuItems) {
      builder.append("\t\t\t\t");
      builder.append(Helper.padRight(subMenu.description(), 20));
      builder.append("\n");
    }
    return builder.toString();
  }

  @Override
  public int getQuantity() {
    return quantity;
  }

  @Override
  public double getPrice() {
    return price;
  }
}
