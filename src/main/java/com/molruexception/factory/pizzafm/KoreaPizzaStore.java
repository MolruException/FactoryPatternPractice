package com.molruexception.factory.pizzafm;

import javax.annotation.Nullable;

public class KoreaPizzaStore extends PizzaStore {

    @Nullable
    public Pizza createPizza(String item) {
        return switch (item) {
            case "cheese" -> new KoreanStyleCheesePizza();
            case "pepperoni" -> new KoreanStylePepperoniPizza();
            default -> null;
        };
    }

}
