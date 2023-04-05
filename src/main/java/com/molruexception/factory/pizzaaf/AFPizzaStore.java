package com.molruexception.factory.pizzaaf;

public abstract class AFPizzaStore {

    protected abstract AFPizza createPizza(String item);

    public AFPizza orderPizza(String type) {
        AFPizza pizza = createPizza(type);
        System.out.println("--- Making a " + pizza.getName() + " ---");
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

}
