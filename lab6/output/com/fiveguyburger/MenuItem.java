package com.fiveguyburger;

import java.util.List;
import java.util.function.Function;

public interface MenuItem {

  void addChild(ISubMenuItem c);

  default String subInfo() {
    return "\t";
  }

  String description();

  String content(Function<List<ISubMenuItem>, List<ISubMenuItem>> comparator);

  int getQuantity();

  double getPrice();

}
