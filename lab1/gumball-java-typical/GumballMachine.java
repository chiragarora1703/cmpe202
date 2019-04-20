import java.util.List;
import java.util.Arrays;
public class GumballMachine {

    protected final int cost;
    protected final List<Integer> coinAccepted;
    protected int num_gumballs;
    protected int fulFilled;
    /**
     * Constructor for objects of class Machine
     */
    public GumballMachine(int size, int cost, List<Integer> coinAccepted)
    {
        // initialise instance variables
        this.cost = cost;
        this.num_gumballs = size;
        this.coinAccepted = coinAccepted;
        this.fulFilled = 0;
    }
    
    public void insertQuarter(int coin)
    {
        if (coinAccepted.contains(coin)) {
            fulFilled = coin + fulFilled;
            System.out.println( "coin inserted:" + coin ) ;
        } else {
            System.out.println( "Invalid Coin" ) ;
        }
    }
    
    public void turnCrank()
    {
        if (fulFilled >= cost)
        {
            if ( this.num_gumballs > 0 )
            {              
                    this.num_gumballs-- ; 
                    System.out.println( "Thanks for your " +fulFilled +" cents.  Gumball Ejected!" ) ;
            }
            else
            {
                System.out.println( "No More Gumballs!  Sorry, can't return your "+fulFilled+" cents." ) ;
            }
            fulFilled = 0;
        }
        else 
        {
            System.out.println( "Please insert any of these coins:" + coinAccepted.toString() ) ;
        }        
    }

}
