package com.yhun.pattern.Strategy;

public abstract class Duck {

     protected FlyBehavior flyBehavior;
     protected QuackBehavior quackBehavior;


     public void performQuack(){
          quackBehavior.quack();
     }

     public void performFly(){
          flyBehavior.fly();
     }

     public void setFlyBehavior(FlyBehavior flyBehavior){
          this.flyBehavior = flyBehavior;
     }

     public void swim(){
          System.out.println("swim");
     }

     public void display(){
          System.out.println("display");
     }
}
