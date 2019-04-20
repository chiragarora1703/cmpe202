

public class Main {

    public static void main(String[] args) {
        GumballMachine gumballMachine = new Gumball25(5);

        System.out.println(gumballMachine);
        
        gumballMachine.insertQuarter(25);
        gumballMachine.turnCrank();
        
        System.out.println(gumballMachine);
        
        gumballMachine.insertQuarter(25);
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter(25);
        gumballMachine.turnCrank();
        
        System.out.println(gumballMachine);
        
        gumballMachine.insertQuarter(25);
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter(25);
        gumballMachine.turnCrank();
        
        GumballMachine gumballMachine50Quart = new Gumball50Quart(2);
        
        System.out.println(gumballMachine50Quart);
        
        gumballMachine50Quart.insertQuarter(25);
        gumballMachine50Quart.turnCrank();
        
        gumballMachine50Quart.insertQuarter(25);
        gumballMachine50Quart.turnCrank();
        
        System.out.println(gumballMachine50Quart);
        gumballMachine50Quart.insertQuarter(25);
        gumballMachine50Quart.ejectQuarter();
        
        System.out.println(gumballMachine50Quart);
        
        gumballMachine50Quart.insertQuarter(25);
        gumballMachine50Quart.insertQuarter(25);
        gumballMachine50Quart.turnCrank();
        
        System.out.println(gumballMachine50Quart);
        gumballMachine50Quart.insertQuarter(25);
        
        GumballMachine gumballMachine50All = new Gumball50All(2);

        System.out.println(gumballMachine50All);
        
        gumballMachine50All.insertQuarter(25);
        gumballMachine50All.insertQuarter(25);
        gumballMachine50All.ejectQuarter();
        
        System.out.println(gumballMachine50All);
        gumballMachine50All.insertQuarter(25);
        gumballMachine50All.insertQuarter(10);
        gumballMachine50All.insertQuarter(5);
        gumballMachine50All.insertQuarter(10);
        gumballMachine50All.turnCrank();
        System.out.println(gumballMachine50All);
        
        gumballMachine50All.insertQuarter(25);
        gumballMachine50All.insertQuarter(10);
        gumballMachine50All.insertQuarter(25);
        gumballMachine50All.turnCrank();
        
        System.out.println(gumballMachine50All);

	
    }
}
