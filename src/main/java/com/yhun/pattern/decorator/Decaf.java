package com.yhun.pattern.decorator;

public class Decaf extends Beverage{
     public Decaf(){
          this.description = "Decaf";
     }

     public double cost(){
          return 1.05;
     }
}
