package com.fiveguyburger;

/**
 * @author carora
 * @since 3/11/19
 */
public class OnMeat extends ISubMenuItem {

  private final String description;

  public OnMeat(String description) {
    this.description = description;
  }

  @Override
  public String description() {
    return "->|" + description;
  }

  @Override
  public String specialCharacter() {
    return "->";
  }
}
