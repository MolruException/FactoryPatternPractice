package com.molruexception.factory.pizzaaf;

import com.molruexception.factory.pizzaaf.ingredients.*;

public abstract class AFPizza {

    protected String name;

    protected Dough dough;
    protected Sauce sauce;
    protected Veggies[] veggies;
    protected Cheese cheese;
    protected Pepperoni pepperoni;
    protected Clams clam;
    protected Bulgogi bulgogi;

    protected PizzaIngredientFactory ingredientFactory;

    protected AFPizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    public abstract void prepare();

    public void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("---- ").append(name).append(" ----\n");

        if (dough != null) {
            result.append("\t");
            result.append(dough);
            result.append("\n");
        }

        if (sauce != null) {
            result.append("\t");
            result.append(sauce);
            result.append("\n");
        }

        if (cheese != null) {
            result.append("\t");
            result.append(cheese);
            result.append("\n");
        }

        if (veggies != null) {
            result.append("\t");
            for (int i = 0; i < veggies.length; i++) {
                result.append(veggies[i]);
                if (i < veggies.length-1) {
                    result.append(", ");
                }
            }
            result.append("\n");
        }

        if (clam != null) {
            result.append("\t");
            result.append(clam);
            result.append("\n");
        }

        if (pepperoni != null) {
            result.append("\t");
            result.append(pepperoni);
            result.append("\n");
        }

        if (bulgogi != null) {
            result.append("\t");
            result.append(bulgogi);
            result.append("\n");
        }

        return result.toString();
    }

}