package com.yhun.pattern.factory;

public class ChicagoStyleCheesePizza extends Pizza{
     public ChicagoStyleCheesePizza(){
          name = "시카고";
          dough = "범수같은 도우";
          sauce = "플럼토마토 소스";
          topping.add("조각낸 모짜렐라 치즈");
     }

     @Override
     public void cut(){
          System.out.println("네모로 조각냄");
     }
}
