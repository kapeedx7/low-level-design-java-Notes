package design.patterns.behavioral.strategy;

import design.patterns.behavioral.strategy.fly.FlyBehaviour;
import design.patterns.behavioral.strategy.quack.QuackBehaviour;

public abstract class Duck {
    private FlyBehaviour flyBehaviour;
    private QuackBehaviour quackBehaviour;

    public Duck(FlyBehaviour flyBehaviour, QuackBehaviour quackBehaviour) {
        this.flyBehaviour = flyBehaviour;
        this.quackBehaviour = quackBehaviour;
    }

    public abstract void display();

    public void swim() {
        System.out.println("All ducks float!");
    }

    public void fly(){
        this.flyBehaviour.fly();
    }
}
