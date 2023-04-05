package com.molruexception.factory.pizzaaf;

import com.molruexception.factory.pizzaaf.ingredients.*;

public interface PizzaIngredientFactory {

    Dough createDough();
    Sauce createSauce();
    Cheese createCheese();
    Veggies[] createVeggies();
    Pepperoni createPepperoni();
    Clams createClam();
    Bulgogi createBulgogi();

}
