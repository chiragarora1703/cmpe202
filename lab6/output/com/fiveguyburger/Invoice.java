package com.fiveguyburger;

import static com.fiveguyburger.Helper.formatter;
import static com.fiveguyburger.Helper.padLeft;

public class Invoice implements Strategy {

  @Override
  public void display(OrderManager order) {
    double subTotal = 0.0d;
    System.out.print("\nInvoice");
    StringBuilder invoice = new StringBuilder();
    invoice.append("\n----------------------------------------\n");
    for (MenuItem menuItem : order.getMenuItems()) {
      String formattedString = menuItem.getQuantity() + " "+ padLeft(menuItem.subInfo(), 2) + "\t"
        + padLeft(menuItem.description(), 4)
        + "\t" + padLeft(Double.toString(menuItem.getPrice()), 5);
      invoice.append(formattedString);
      invoice.append("\n");
      invoice.append(menuItem.content(Helper::invoice));
      invoice.append("\n");
      subTotal += menuItem.getPrice() * menuItem.getQuantity();
    }
    invoice.append(taxCalculator(subTotal).toString());
    invoice.append("\n----------------------------------------\n");
    System.out.println(invoice.toString());
  }

  private String taxCalculator(double subTotal) {
    StringBuilder calculation = new StringBuilder();
    double tax = subTotal * 0.09;
    double total = tax + subTotal;
    calculation.append("\n");
    calculation.append("SubTotal:");
    calculation.append("\t\t");
    calculation.append(formatter.format(subTotal));
    calculation.append("\n");
    calculation.append("Tax:\t\t\t\t");
    calculation.append(formatter.format(tax));
    calculation.append("\n");
    calculation.append("Total:\t\t\t");
    calculation.append(formatter.format(total));
    return calculation.toString();
  }

}
