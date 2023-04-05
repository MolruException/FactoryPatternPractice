package com.molruexception.factory.pizzaaf.stores;

import com.molruexception.factory.pizzaaf.AFPizza;
import com.molruexception.factory.pizzaaf.AFPizzaStore;
import com.molruexception.factory.pizzaaf.PizzaIngredientFactory;
import com.molruexception.factory.pizzaaf.ingredients.KoreanPizzaIngredientFactory;
import com.molruexception.factory.pizzaaf.pizzas.AFKoreanStyleBulgogiPizza;
import com.molruexception.factory.pizzaaf.pizzas.AFKoreanStyleCheesePizza;
import com.molruexception.factory.pizzaaf.pizzas.AFKoreanStylePepperoniPizza;

public class AFKoreanPizzaStore extends AFPizzaStore {

    protected AFPizza createPizza(String item) {
        AFPizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new KoreanPizzaIngredientFactory();

        switch (item) {
            case "cheese" -> {
                pizza = new AFKoreanStyleCheesePizza(ingredientFactory);
                pizza.setName("Korean Style Cheese Pizza");
            }
            case "pepperoni" -> {
                pizza = new AFKoreanStylePepperoniPizza(ingredientFactory);
                pizza.setName("Korean Style Pepperoni Pizza");
            }
            case "bulgogi" -> {
                pizza = new AFKoreanStyleBulgogiPizza(ingredientFactory);
                pizza.setName("Korean Style bulgogi Pizza");
            }
        }

        return pizza;
    }

}
