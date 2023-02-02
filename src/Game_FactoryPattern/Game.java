package Game_FactoryPattern;

import Game_FactoryPattern.actors.Actor;

import java.util.ArrayList;
import java.util.List;

public class Game {
    public static void main(String[] args) {
        List<Actor> actors = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            actors.add(Factory.generateActor());
        }
        for (Actor a: actors) {
            a.sayHello();
        }
    }
}
