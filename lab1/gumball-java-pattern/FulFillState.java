

public class FulFillState implements State {
    GumballMachine gumballMachine;
 
    public FulFillState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
 
    public void insertQuarter(int coin) {
        gumballMachine.addCost(coin);
        System.out.println("You inserted a coin:" + coin);
        if (gumballMachine.getCost() <= gumballMachine.getFulfill()) {
            gumballMachine.setState(gumballMachine.getHasQuarterState());
        }
    }
 
    public void ejectQuarter() {
        System.out.println("Coins returned");
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }
 
    public void turnCrank() {
        int bal = gumballMachine.getCost() - gumballMachine.getFulfill();
        System.out.println("Please insert remaining value:" + bal);
    }
     
    public void rejectQuarter() {
        System.out.println("Please insert accepted coins" + this.gumballMachine.getAcceptedCoins());
    }
 
    public void dispense() {
        System.out.println("You need to pay first");
    } 
 
    public String toString() {
        return "waiting for coins";
    }
}
