package com.yhun.pattern.factory;

public class factory {

     public static void main(String[] args){
          PizzaStore store = new ChicagoStore();


          store.orderPizza("cheese");
     }

}
