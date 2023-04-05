package com.molruexception.factory.pizzaaf.pizzas;

import com.molruexception.factory.pizzaaf.AFPizza;
import com.molruexception.factory.pizzaaf.PizzaIngredientFactory;
import com.molruexception.factory.pizzafm.Pizza;

public class AFKoreanStylePepperoniPizza extends AFPizza {

    public AFKoreanStylePepperoniPizza(PizzaIngredientFactory ingredientFactory) {
        super(ingredientFactory);
    }

    @Override
    public void prepare() {
        System.out.println("Preparing" + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
        veggies = ingredientFactory.createVeggies();
        pepperoni = ingredientFactory.createPepperoni();
    }

}
