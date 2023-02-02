package Dog_StrategyPattern;

import Dog_StrategyPattern.Dogs.*;
import Dog_StrategyPattern.bark.barkStrategy;
import Dog_StrategyPattern.bark.wuffwuff;
import Dog_StrategyPattern.bark.wuuuaauuf;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        barkStrategy b1 = new wuuuaauuf();
        barkStrategy b2 = new wuffwuff();
        List<Dog> dogs= new ArrayList<>();
        dogs.add(new Puddel("Lisa"));
        dogs.add(new Puddel("Leo", b1));
        dogs.add(new Schaefer("Theo",b2));
        dogs.add(new Schaefer("Blackie", b1));
        dogs.add(new Boxer("Jessie",b2));
        dogs.add(new Boxer("Tim"));

        for (Dog dog:dogs) {
            dog.run();
        }
    }
}
