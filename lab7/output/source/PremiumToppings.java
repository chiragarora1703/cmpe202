public class PremiumToppings extends Premium{

	public PremiumToppings(String d) {
		super(d);
	}
	
	public void setOptions( String[] options )
    {
        this.options = options ;
        if ( options.length > 0 )
        {
            this.price += options.length * 1.00 ;
        }
        for ( int i = 0; i<options.length; i++ )
        {
            if ( "Marinated Tomatoes".equals(options[i]) ) this.price += 2.00 ;
        }
    }

}