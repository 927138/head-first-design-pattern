package com.yhun.pattern.decorator;

public abstract class Beverage {
     protected String description = "no title";

     public String getDescription(){
          return this.description;
     }

     public abstract double cost();
}
