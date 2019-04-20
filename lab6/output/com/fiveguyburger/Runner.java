package com.fiveguyburger;

/**
 * @author carora
 * @since 3/10/19
 */
public class Runner {

  public static void main(String[] args) {

    OrderManager manager = new OrderManager();
    MenuItem burger = new Burger(1, "LBB");
    burger.addChild(new Bacon());
    burger.addChild(new OnMeat("G Onion"));
    burger.addChild(new OnMeat("JALA Grilled"));
    burger.addChild(new OnTopBun("LETTUCE"));
    burger.addChild(new OnTopBun("TOMATO"));
    manager.addChild(burger);
    manager.addChild(new Fries(1, "CAJ", "LTL"));


    Strategy invoice = new Invoice();
    invoice.display(manager);

    Strategy print = new AssemblyNote();
    print.display(manager);

  }
}
