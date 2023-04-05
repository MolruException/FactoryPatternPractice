package com.molruexception.factory.pizzafm;

import com.google.common.collect.Lists;

import java.util.List;

public abstract class Pizza {
    String name;
    String dough;
    String sauce;
    List<String> toppings = Lists.newArrayList();
    void prepare() {
        System.out.println("Prepare " + name);
//		System.out.println("Tossing dough...");
//		System.out.println("Adding sauce...");
//		System.out.println("Adding toppings: ");
//		for (String topping : toppings) {
//			System.out.println("   " + topping);
//		}
    }

    void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    void cut() {
        System.out.println("Cut the pizza into diagonal slices");
    }

    void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String getName() {
        return name;
    }

    public String toString() {
        StringBuffer display = new StringBuffer();
        display.append("---- " + name + " ----\n");
        display.append("\t"+dough + "\n");
        display.append("\t"+sauce + "\n");
        for (String topping : toppings) {
            display.append("\t"+topping + "\n");
        }
        return display.toString();
    }
}