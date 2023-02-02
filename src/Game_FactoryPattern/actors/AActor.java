package Game_FactoryPattern.actors;

public abstract class AActor implements Actor {
    protected String name;
    protected ActorType type;

    public AActor(String name, ActorType type) {
        this.name = name;
        this.type = type;
    }

    public void sayHello() {
        System.out.println("Hello I'm a " + this.type + " and my name is " + this.name +"!");
    }
}
