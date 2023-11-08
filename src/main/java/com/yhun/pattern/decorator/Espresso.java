package com.yhun.pattern.decorator;

public class Espresso extends Beverage{

     public Espresso() {
          this.description = "espresso";
     }

     public double cost(){
          return 1.99;
     }
}
