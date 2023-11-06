package com.yhun.pattern.ch1;

public class Ducksub1 extends Duck{

     public Ducksub1(){
          this.flyBehavior = new FlyWithWings();
          this.quackBehavior = new Quack();
     }

     public void print(){
          swim();
          display();
          performQuack();
          performFly();
     }
}
