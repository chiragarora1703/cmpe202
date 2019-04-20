package com.fiveguyburger;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author carora
 * @since 3/11/19
 */
public class Helper {

  public static DecimalFormat formatter = new DecimalFormat("$0.00");

  public static String padLeft(String string, int length) {
    if (string.length() > 0) {
      return String.format("%1$" + length + "s", string);
    }
    return string;
  }

  public static String padRight(String string, int length) {
    if (string.length() > 0) {
      return String.format("%-" + length + "s", string);
    }
    return string;
  }

  private static void process(List<ISubMenuItem> items, List<ISubMenuItem> meat, List<ISubMenuItem> onTop,
                              List<ISubMenuItem> regular) {
    for (ISubMenuItem subMenuItem : items) {
      if (subMenuItem.specialCharacter().equals("{")) {
        meat.add(subMenuItem);
      } else if (subMenuItem.specialCharacter().equals("->")) {
        onTop.add(subMenuItem);
      } else {
        regular.add(subMenuItem);
      }
    }
    Collections.sort(meat);
    Collections.sort(onTop);
    Collections.sort(regular);

  }

  public static List<ISubMenuItem> assembly(List<ISubMenuItem> items) {
    List<ISubMenuItem> meat = new ArrayList<>();
    List<ISubMenuItem> onTop = new ArrayList<>();
    List<ISubMenuItem> regular = new ArrayList<>();
    process(items, meat, onTop, regular);
    List<ISubMenuItem> output = new ArrayList<>();
    output.addAll(regular);
    output.addAll(onTop);
    output.addAll(meat);
    return output;
  }

  public static List<ISubMenuItem> invoice(List<ISubMenuItem> items) {
    List<ISubMenuItem> meat = new ArrayList<>();
    List<ISubMenuItem> onTop = new ArrayList<>();
    List<ISubMenuItem> regular = new ArrayList<>();
    process(items, meat, onTop, regular);
    List<ISubMenuItem> output = new ArrayList<>();
    output.addAll(meat);
    output.addAll(regular);
    output.addAll(onTop);
    return output;
  }
}
