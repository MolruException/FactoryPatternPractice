package com.molruexception.factory.pizzaaf.pizzas;

import com.molruexception.factory.pizzaaf.AFPizza;
import com.molruexception.factory.pizzaaf.PizzaIngredientFactory;

public class AFKoreanStyleCheesePizza extends AFPizza {

    public AFKoreanStyleCheesePizza(PizzaIngredientFactory ingredientFactory) {
        super(ingredientFactory);
    }

    @Override
    public void prepare() {
        System.out.println("Preparing" + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
    }

}
