package com.fiveguyburger;

/**
 * @author carora
 * @since 3/11/19
 */
public class OnTopBun extends ISubMenuItem {

  private final String description;

  public OnTopBun(String description) {
    this.description = description;
  }

  @Override
  public String description() {
    return description;
  }
}
