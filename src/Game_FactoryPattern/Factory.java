package Game_FactoryPattern;

import Game_FactoryPattern.actors.Actor;
import Game_FactoryPattern.actors.Ant;
import Game_FactoryPattern.actors.Bee;
import Game_FactoryPattern.actors.Wolf;
import Game_FactoryPattern.names.Names;

import java.util.Random;

public class Factory {
    public static Actor generateActor(){
        Random random = new Random();

        return switch (random.nextInt(3)) {
            case 1 -> new Ant(Names.getName(random.nextInt(Names.getLength())));
            case 2 -> new Wolf(Names.getName(random.nextInt(Names.getLength())));
            default -> new Bee(Names.getName(random.nextInt(Names.getLength())));
        };
    }

}
