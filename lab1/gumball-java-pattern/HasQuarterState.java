

import java.util.Random;

public class HasQuarterState implements State {
	GumballMachine gumballMachine;
 
	public HasQuarterState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}
  
	public void insertQuarter(int coin) {
		System.out.println("You can't insert another coin");
	}
 
	public void ejectQuarter() {
		System.out.println("coins returned");
		gumballMachine.setState(gumballMachine.getNoQuarterState());
	}
	
	public void rejectQuarter() {
            System.out.println("Please insert accepted coins" + this.gumballMachine.getAcceptedCoins());
        }
 
	public void turnCrank() {
		System.out.println("You turned...");
		gumballMachine.setState(gumballMachine.getSoldState());
	}

        public void dispense() {
            System.out.println("No gumball dispensed");
        }
 
	public String toString() {
		return "waiting for turn of crank";
	}
}
