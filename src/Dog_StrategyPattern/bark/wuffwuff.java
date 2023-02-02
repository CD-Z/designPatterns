package Dog_StrategyPattern.bark;

public class wuffwuff implements barkStrategy {
    @Override
    public void bark() {
        System.out.println("wuffwuff");
    }
}
