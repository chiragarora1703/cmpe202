
/**
 * Write a description of class Bun here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Bun extends LeafDecorator
{
    // instance variables - replace the example below with your own
    private int x;
    private String[] options ;
    /**
     * Constructor for objects of class Bun
     */
    public Bun( String d )
    {
        // initialise instance variables
        super(d);
        x = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
    
    public void setOptions( String[] options ){
        this.options = options ;
        if ( options.length > 1 )
            this.price += (options.length-1) * 1.00 ;
    }
    
    public String getDescription() {
        String desc = "   " ;
        for ( int i = 0; i<options.length; i++ )
        {
            if (i>0) desc += " + " + options[i] ;
            else desc = options[i] ;
        }        
        return desc ;
    }
}
