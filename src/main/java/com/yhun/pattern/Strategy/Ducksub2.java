package com.yhun.pattern.Strategy;

public class Ducksub2 extends Duck{

     // composition
     public Ducksub2(){
          this.flyBehavior = new FlyNoWay();
          this.quackBehavior = new Quack();
     }

     // aggregation
     // lambda expression or object
     public Ducksub2(FlyBehavior flyBehavior, QuackBehavior quackBehavior){
          this.flyBehavior = flyBehavior;
          this.quackBehavior = quackBehavior;
     }
}
