package Dog_StrategyPattern.bark;

public class wuff implements barkStrategy{
    @Override
    public void bark() {
        System.out.println("Wuuuuuff");
    }
}
