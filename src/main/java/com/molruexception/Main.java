package com.molruexception;

import com.molruexception.factory.pizzaaf.AFPizza;
import com.molruexception.factory.pizzaaf.AFPizzaStore;
import com.molruexception.factory.pizzaaf.stores.AFKoreanPizzaStore;
import com.molruexception.factory.pizzafm.KoreaPizzaStore;
import com.molruexception.factory.pizzafm.Pizza;
import com.molruexception.factory.pizzafm.PizzaStore;

public class Main {
    public static void main(String[] args) {

        // pizza fm
        System.out.println("\n--- Test pizzafm classes ---\n");

        PizzaStore store = new KoreaPizzaStore();

        Pizza cheesePizza = store.orderPizza("cheese");
        System.out.printf("Ordered a %s pizza \n", cheesePizza);

        Pizza pepperoniPizza = store.orderPizza("pepperoni");
        System.out.printf("Ordered a %s pizza \n", pepperoniPizza);

        // pizza f
        System.out.println("\n--- Test pizzaf classes ---\n");

        AFPizzaStore afStore = new AFKoreanPizzaStore();

        AFPizza afCheesePizza = afStore.orderPizza("cheese");
        System.out.printf("Ordered a %s pizza \n", afCheesePizza);

        AFPizza afPepperoniPizza = afStore.orderPizza("pepperoni");
        System.out.printf("Ordered a %s pizza \n", afPepperoniPizza);

        AFPizza bulgogiPizza = afStore.orderPizza("bulgogi");
        System.out.printf("Ordered a %s pizza \n", bulgogiPizza);

    }
}