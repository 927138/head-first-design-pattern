package com.yhun.pattern.ch1;

public class Test1 {
     public static void main(String[] args) {
          Ducksub1 t = new Ducksub1();

          t.print();
          t.setFlyBehavior(new FlyNoWay());
          t.print();

     }
}
