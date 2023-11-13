package com.yhun.pattern.factory;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {

     protected String name;
     protected String dough;
     protected String sauce;

     protected List<String> topping = new ArrayList<>();

     void prepare(){
          System.out.println("준비 중 : " + name);
          System.out.println("도어를 돌리는 중...");
          System.out.println("소스를 뿌리는 중...");
          System.out.println("토핑을 올리는중...");
          for(String toppings : topping){
               System.out.println(" " + toppings);
          }
     }

     void bake(){
          System.out.println("175도에서 25분 굽기");
     }

     void cut(){
          System.out.println("피자를 사선으로 자르기");
     }

     void box(){
          System.out.println("상자에 피자 담기");
     }

     public String getName(){
          return this.name;
     }
}
