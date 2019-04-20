import java.util.List;
import java.util.Arrays;
public class GumballMachine {
 
    State soldOutState;
    State noQuarterState;
    State hasQuarterState;
    State soldState;
    State fulfillState;
 
    State state = soldOutState;
    int count = 0;
    int cost;
    List<Integer> coinAccepted;
    int fulfill;
 
    public GumballMachine(int numberGumballs, int cost, List<Integer> coinAccepted) {
        soldOutState = new SoldOutState(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);
        fulfillState = new FulFillState(this);
        
        this.cost = cost;
        this.coinAccepted = coinAccepted;
        this.count = numberGumballs;
        this.fulfill = 0;
        if (numberGumballs > 0) {
            state = noQuarterState;
        } 
    }
 
    public void insertQuarter(int coin) {
        if (accepts(coin)) {
            state.insertQuarter(coin);
        } else {
            state.rejectQuarter();
        }
    }
    
    int getCost() {
        return cost;
    }
    
    List<Integer> getAcceptedCoins() {
        return coinAccepted;
    }
    
    boolean accepts(int coin) {
        return coinAccepted.contains(coin);
    }
 
    public void ejectQuarter() {
        this.fulfill = 0;
        state.ejectQuarter();
    }
 
    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }

    void setState(State state) {
        this.state = state;
    }
    
    void addCost(int coin) {
        this.fulfill = fulfill + coin;
    }
    
    int getFulfill() {
        return this.fulfill;
    }
 
    void releaseBall() {
        System.out.println("A gumball comes rolling out the slot...");
        if (count != 0) {
            count = count - 1;
            this.fulfill = 0;
        }
    }
 
    int getCount() {
        return count;
    }
 
    void refill(int count) {
        this.count = count;
        state = noQuarterState;
    }

    public State getState() {
        return state;
    }

    public State getSoldOutState() {
        return soldOutState;
    }
    
    public State getFulfillState() {
        return fulfillState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }
 
    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append("\nMighty Gumball, Inc.");
        result.append("\nJava-enabled Standing Gumball Model #2004");
        result.append("\nInventory: " + count + " gumball");
        if (count != 1) {
            result.append("s");
        }
        result.append("\nCost: " + cost);
        result.append("\n");
        result.append("Machine is " + state + "\n");
        return result.toString();
    }
}
