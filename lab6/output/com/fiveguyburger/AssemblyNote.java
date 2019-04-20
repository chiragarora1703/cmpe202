package com.fiveguyburger;

import static com.fiveguyburger.Helper.padLeft;

public class AssemblyNote implements Strategy {

  @Override
  public void display(OrderManager order) {

    System.out.print("\nAssembly Note");
    StringBuilder note = new StringBuilder();
    note.append("\n----------------------------------------\n");
    for (MenuItem menuItem : order.getMenuItems()) {
      String formattedString = menuItem.getQuantity() + " " + padLeft(menuItem.subInfo(), 2) + "\t"
        + padLeft(menuItem.description(), 4);
      note.append(formattedString);
      note.append("\n");
      note.append(menuItem.content(Helper::assembly));
      note.append("\n");
    }
    note.append("\n----------------------------------------\n");
    System.out.println(note.toString());
  }
}
