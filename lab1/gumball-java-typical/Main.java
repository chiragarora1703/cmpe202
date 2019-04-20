

public class Main {

	public static void main(String[] args) {
		GumballMachine gumballMachine = new GumballMachine1(5);

		System.out.println(gumballMachine);

		gumballMachine.insertQuarter( 25 );
		gumballMachine.turnCrank();

		System.out.println(gumballMachine);

		gumballMachine.insertQuarter( 25 );
		gumballMachine.turnCrank();
		gumballMachine.insertQuarter( 25 );
		gumballMachine.turnCrank();

		System.out.println(gumballMachine);
		
		GumballMachine gumballMachine2 = new GumballMachine2(2);

		System.out.println(gumballMachine2);

		gumballMachine2.insertQuarter( 25 );
		gumballMachine2.turnCrank();
		gumballMachine2.insertQuarter( 25 );
		gumballMachine2.turnCrank();
		
		System.out.println(gumballMachine2);

		gumballMachine2.insertQuarter( 25 );
		gumballMachine2.insertQuarter( 25 );
		gumballMachine2.turnCrank();

		gumballMachine2.insertQuarter( 25 );
		gumballMachine2.insertQuarter( 25 );
		gumballMachine2.turnCrank();
		System.out.println(gumballMachine2);
		
		GumballMachine gumballMachine3 = new GumballMachine3(2);

		System.out.println(gumballMachine3);

		gumballMachine3.insertQuarter( 25 );
		gumballMachine3.turnCrank();
		gumballMachine3.insertQuarter( 5 );
		gumballMachine3.insertQuarter(10);
		gumballMachine3.insertQuarter(10);
		gumballMachine3.turnCrank();
		
		System.out.println(gumballMachine3);

		gumballMachine3.insertQuarter( 25 );
		gumballMachine3.insertQuarter( 25 );
		gumballMachine3.turnCrank();
	}
}
