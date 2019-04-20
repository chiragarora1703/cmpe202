package com.fiveguyburger;

import java.util.List;
import java.util.function.Function;

/**
 * @author carora
 * @since 3/11/19
 */
public abstract class ISubMenuItem implements Comparable<ISubMenuItem>, MenuItem {

  public abstract String description();

  public String specialCharacter() {
    return "";
  }

  @Override
  public final int compareTo(ISubMenuItem o) {
    return this.description().compareTo(o.description());
  }

  @Override
  public final String content(Function<List<ISubMenuItem>, List<ISubMenuItem>> comparator) {
    return "";
  }

  @Override
  public final void addChild(ISubMenuItem c) {
  }

  @Override
  public final int getQuantity() {
    return 0;
  }

  @Override
  public final double getPrice() {
    return 0;
  }
}
