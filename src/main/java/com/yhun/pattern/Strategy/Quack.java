package com.yhun.pattern.Strategy;

public class Quack implements QuackBehavior{
     @Override
     public void quack() {
          System.out.println("Quack class");
     }
}
