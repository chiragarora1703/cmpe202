package com.fiveguyburger;

/**
 * @author carora
 * @since 3/11/19
 */
public class OnBottomBun extends ISubMenuItem {

  private final String description;

  public OnBottomBun(String description) {
    this.description = description;
  }

  @Override
  public String description() {
    return description;
  }
}
