package com.fiveguyburger;

public class Bacon extends ISubMenuItem {

  private String description = "BACON";

  @Override
  public String description() {
    return "{{{{ " + this.description + " }}}}";
  }

  @Override
  public String specialCharacter() {
    return "{";
  }

}