package com.yhun.pattern.factory;

public class ChicagoStore extends PizzaStore{

     @Override
     public Pizza createPizza(String item){
          if(item.equals("cheese"))
               return new ChicagoStyleCheesePizza();

          return null;
     }
}
