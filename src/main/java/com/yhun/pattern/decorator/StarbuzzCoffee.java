package com.yhun.pattern.decorator;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StarbuzzCoffee {

     public static void main(String[] args) {

          Beverage beverage = new Espresso();
          System.out.println(beverage.getDescription() + ", $" + beverage.cost());

          Stream.iterate(0, i -> i+1) // first
                  .limit(10) // mid
                  .forEach(System.out::println);// exit
          // System.out :: println
          // () -> sout;



          List<Integer> a = Arrays.asList(1,2,3);
          for(int i : a){

          }
     }

}
