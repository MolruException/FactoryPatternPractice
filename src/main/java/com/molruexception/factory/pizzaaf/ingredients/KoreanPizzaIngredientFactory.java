package com.molruexception.factory.pizzaaf.ingredients;

import com.molruexception.factory.pizzaaf.PizzaIngredientFactory;

public class KoreanPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[] {
                new BlackOlives(),
                new Eggplant()
        };
    }

    @Override
    public Pepperoni createPepperoni() {
        return null;
    }

    @Override
    public Clams createClam() {
        return null;
    }

    @Override
    public Bulgogi createBulgogi() {
        return new SpicyBulgogi();
    }

}
