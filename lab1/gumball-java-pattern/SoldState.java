

public class SoldState implements State {
 
    GumballMachine gumballMachine;
 
    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
       
    public void insertQuarter(int coin) {
        System.out.println("Please wait, we're already giving you a gumball");
    }
 
    public void ejectQuarter() {
        System.out.println("Sorry, you already turned the crank");
    }
 
    public void turnCrank() {
        System.out.println("Turning twice doesn't get you another gumball!");
    }
    
    public void rejectQuarter() {
        System.out.println("Please insert accepted coins" + this.gumballMachine.getAcceptedCoins());
    }
 
    public void dispense() {
        if (gumballMachine.getFulfill() > gumballMachine.getCost()) {
            int bal = gumballMachine.getFulfill() - gumballMachine.getCost();
            System.out.println("Returning the coins balance: " + bal); 
        }
        // now releasing the ball
        gumballMachine.releaseBall();
        if (gumballMachine.getCount() > 0) {
            gumballMachine.setState(gumballMachine.getNoQuarterState());
        } else {
            System.out.println("Oops, out of gumballs!");
            gumballMachine.setState(gumballMachine.getSoldOutState());
        }
    }
 
    public String toString() {
        return "dispensing a gumball";
    }
}


