package com.yhun.pattern.Strategy;

public class Test2 {
     static private Ducksub2 duck2;
     public static void main(String[] args) {
          FlyBehavior flyBehavior = () -> System.out.println("응 못날아");

          duck2 = new Ducksub2(flyBehavior, new Quack());
          duck2.performFly();
          duck2.performQuack();
     }

}
