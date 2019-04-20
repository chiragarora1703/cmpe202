/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */

/**
 *  Main App Class for Displaying Screen.
 */
public class App {

    private Screen screen;
    private IDisplayComponent num;
    private IDisplayComponent exp;
    private CreditCardCVC cvc;
    private int count;

    public App() {

        screen = new Screen();
        num = new CreditCardNumDecorator(new CreditCardNum(screen));
        exp = new CreditCardExpDecorator(new CreditCardExp(screen));
        cvc = new CreditCardCVC(screen);

        screen.addSubComponent(num);
        screen.addSubComponent(exp);
        screen.addSubComponent(cvc);

        count = 1;

    }

    public String display() {
        String output = "";
        output += "========================================\n";
        output += screen.name() + "\n";
        output += "========================================\n";
        output += "\n\n\n\n";
        output += screen.display() + "\n";
        output += "\n\n\n";
        output += screen.name();
        output += "\n========================================\n";
        return output;
    }

    public void key(String ch) {
        try {
            if (ch.equalsIgnoreCase("X")) {
                if (count <= 1) {
                    return;
                }
                count--;
                screen.key(ch, count);
            } else if (Integer.parseInt(ch) >= 0 || Integer.valueOf(ch) <= 9) {
                screen.key(ch, count);
                count++;
            }
        } catch (Exception e) {

        }
    }

}

