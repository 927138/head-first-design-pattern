package com.yhun.pattern.factory;

public abstract class PizzaStore {

     abstract Pizza createPizza(String item);

     public Pizza orderPizza(String type){
          Pizza pizza = createPizza(type);
          System.out.println("--Marking a " + pizza.getName() + "---");
          pizza.prepare();
          pizza.bake();
          pizza.cut();
          pizza.box();

          return pizza;
     }
}
