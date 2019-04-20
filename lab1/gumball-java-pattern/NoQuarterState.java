

public class NoQuarterState implements State {
    GumballMachine gumballMachine;
 
    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
 
    public void insertQuarter(int coin) {
        System.out.println("You inserted a coin:" + coin);
        gumballMachine.addCost(coin);
        if (gumballMachine.getCost() <= gumballMachine.getFulfill()) {
            gumballMachine.setState(gumballMachine.getHasQuarterState());
        } else {
            gumballMachine.setState(gumballMachine.getFulfillState());   
        }
    }
 
    public void ejectQuarter() {
        System.out.println("You haven't inserted a coin");
    }
 
    public void turnCrank() {
        System.out.println("You turned, but there's no coin");
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
