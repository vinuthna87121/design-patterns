package com.java.designpatterns.builder;

public class Client {
public static void main(String[] args) {
pizzaBuilder margherita= new MargheritaPizza();
Director director = new Director(margherita);
Pizza margheritspizza= director.construct();
System.out.println(margheritspizza);

pizzaBuilder pepperoni= new pepperoniPizza();
 director= new Director(pepperoni);
Pizza pepperoniPizza= director.construct();
System.out.println(pepperoniPizza);

pizzaBuilder veggiepizza= new veggiePizza();
director = new Director(veggiepizza);
Pizza veggie=director.construct();
System.out.println(veggie);}
}
