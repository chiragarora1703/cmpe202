public class Client {

    public static void runTest()
    {
        Component theOrder = BuildOrder.newOrder() ;
        theOrder.printDescription();
        Component Order2 = BuildOrder.Order2() ;
        Order2.printDescription();

    }
}