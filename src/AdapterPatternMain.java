public class AdapterPatternMain {

    public static void main(String[] args) {
        BrownDuck brownDuck=new BrownDuck();
        GiantTurkey giantTurkey=new GiantTurkey() ;
        TurkeyAdapter turkyAdapter=new TurkeyAdapter(giantTurkey);

        System.out.println("When a Duck object given");
        testDuck(brownDuck);

        System.out.println("\n When a turkey wrapped in a Duck interface is given");
        testDuck(turkyAdapter);


    }


    public static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}
