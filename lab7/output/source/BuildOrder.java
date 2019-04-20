public class BuildOrder {
	public static Component newOrder()
	{
		Composite order = new Composite( "Order" ) ;
		CustomBurger customBurger = new CustomBurger( "Build Your Own Burger" ) ;
        // base price for 1/3 lb
        Burger b = new Burger( "Burger Options" ) ;
        String[] bo = { "Organic Bison", "1/2lb.", "On A Bun" } ;
        b.setOptions( bo ) ;
        // 1 cheese free, extra cheese +1.00
        Cheese c = new Cheese( "Cheese Options" ) ;
        String[] co = { "Yellow American", "Spicy Jalapeno Jack" } ;
        c.setOptions( co ) ;
        c.wrapDecorator( b ) ;
        
        //Premium Cheese
        PremiumCheese pc = new PremiumCheese( "Cheese Options" ) ;
        String[] pco = { "Danish Blue Cheese" } ;
        pc.setOptions( pco ) ;
        pc.wrapDecorator( c );
        
        Sauce s = new Sauce( "Sauce Options" ) ;
        String[] so = { "The Peanut Sauce", "Mayonnaise" } ;
        s.setOptions( so ) ;
        s.wrapDecorator( pc ) ;
        
        Toppings t = new Toppings( "Toppings Options" ) ;
        String[] to = { "Dill Pickle Chips", "Black Olives", "Spicy Pickels" } ;
        t.setOptions( to ) ;
        t.wrapDecorator( s ) ;
        // premium topping +1.50
        PremiumToppings p = new PremiumToppings( "Premium Options" ) ;
        String[] po = { "Marinated Tomatoes" } ;
        p.setOptions( po ) ;
        p.wrapDecorator( t ) ;
        
        //Add bun
        Bun bun = new Bun("Bun Oprions") ;
        String []buno = {"Ciabatta(Vegan)"} ;
        bun.setOptions( buno ) ;
        bun.wrapDecorator( p ) ;
        
        Sides sides = new Sides("Sides") ;
        String []sideso = {"Shoestring Fries"} ;
        sides.setOptions(sideso);
        sides.wrapDecorator(bun);
        
        // Setup Custom Burger Ingredients
        customBurger.setDecorator( sides ) ;
        customBurger.addChild( b ) ;
        customBurger.addChild( c ) ;
        customBurger.addChild( pc ) ;
        customBurger.addChild( s ) ;
        customBurger.addChild( t ) ;
        customBurger.addChild( p ) ;
        customBurger.addChild( bun );
        
        // Add Custom Burger to the ORder
        order.addChild( customBurger );
        order.addChild(sides);
        return order ;
	}
	
	public static Component Order2()
	{
		Composite order = new Composite( "Order" ) ;
		CustomBurger customBurger = new CustomBurger( "Build Your Own Burger" ) ;
        // base price for 1/3 lb
        Burger b = new Burger( "Burger Options" ) ;
        String[] bo = { "Harmone & Antibiotic Free beef*", "1/3lb.", "On A Bun" } ;
        b.setOptions( bo ) ;
        // 1 cheese free, extra cheese +1.00
        Cheese c = new Cheese( "Cheese Options" ) ;
        String[] co = { "Geeka Feta", "Smoked Gouda" } ;
        c.setOptions( co ) ;
        c.wrapDecorator( b ) ;
        
        //Premium Cheese
        PremiumCheese pc = new PremiumCheese( "Cheese Options" ) ;
        String[] pco = { "Fresh Mozerella" } ;
        pc.setOptions( pco ) ;
        pc.wrapDecorator( c );
        
        Sauce s = new Sauce( "Sauce Options" ) ;
        String[] so = { "Habanero Salsa" } ;
        s.setOptions( so ) ;
        s.wrapDecorator( pc ) ;
        
        Toppings t = new Toppings( "Toppings Options" ) ;
        String[] to = { "Crushed Peanuts" } ;
        t.setOptions( to ) ;
        t.wrapDecorator( s ) ;
        // premium topping +1.50
        PremiumToppings p = new PremiumToppings( "Premium Options" ) ;
        String[] po = {"Sunny Side up Egg*" ,"Marinated Tomatoes" } ;
        p.setOptions( po ) ;
        p.wrapDecorator( t ) ;
        
        //Add bun
        Bun bun = new Bun("Bun Oprions") ;
        String []buno = {"Gluten-free Bun"} ;
        bun.setOptions( buno ) ;
        bun.wrapDecorator( p ) ;
        
        Sides sides = new Sides("Sides") ;
        String []sideso = {"Shoestring Fries"} ;
        sides.setOptions(sideso);
        sides.wrapDecorator(bun);
        
        // Setup Custom Burger Ingredients
        customBurger.setDecorator( sides ) ;
        customBurger.addChild( b ) ;
        customBurger.addChild( c ) ;
        customBurger.addChild( pc ) ;
        customBurger.addChild( s ) ;
        customBurger.addChild( t ) ;
        customBurger.addChild( p ) ;
        customBurger.addChild( bun );
        
        // Add Custom Burger to the ORder
        order.addChild( customBurger );
        order.addChild(sides);
        return order ;
	}

    public static Component getOrder()
    {
        Composite order = new Composite( "Order" ) ;
        order.addChild(new Leaf("Crispy Onion Strings", 5.50 ));
        order.addChild(new Leaf("The Purist", 8.00 ));

        CustomBurger customBurger = new CustomBurger( "Build Your Own Burger" ) ;
        // base price for 1/3 lb
        Burger b = new Burger( "Burger Options" ) ;
        String[] bo = { "Beef", "1/3lb.", "On A Bun" } ;
        b.setOptions( bo ) ;
        // 1 cheese free, extra cheese +1.00
        Cheese c = new Cheese( "Cheese Options" ) ;
        String[] co = { "Danish Blue Cheese", "Horseradish Cheddar" } ;
        c.setOptions( co ) ;
        c.wrapDecorator( b ) ;
        // 4 toppings free, extra +.75
        Toppings t = new Toppings( "Toppings Options" ) ;
        String[] to = { "Bermuda Red Onion", "Black Olives", "Carrot Strings", "Coleslaw" } ;
        t.setOptions( to ) ;
        t.wrapDecorator( c ) ;
        // premium topping +1.50
        Premium p = new Premium( "Premium Options" ) ;
        String[] po = { "Applewood Smoked Bacon" } ;
        p.setOptions( po ) ;
        p.wrapDecorator( t ) ;
        // 1 sauce free, extra +.75
        Sauce s = new Sauce( "Sauce Options" ) ;
        String[] so = { "Appricot Sauce" } ;
        s.setOptions( so ) ;
        s.wrapDecorator( p ) ;
        
        
        // Setup Custom Burger Ingredients
        customBurger.setDecorator( s ) ;
        customBurger.addChild( b ) ;
        customBurger.addChild( c ) ;
        customBurger.addChild( t ) ;
        customBurger.addChild( p ) ;
        customBurger.addChild( s ) ;
        
        // Add Custom Burger to the ORder
        order.addChild( customBurger );
        return order ;
    }

}


/*
Counter Burger Menu:
https://thecounterburger.emn8.com/?store=Times%20Square
*/