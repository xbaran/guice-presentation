package me.baran;

import me.baran.brewery.JavaGroupBrewery;
import me.baran.people.JavaCustomer;

/**
 * Author: Milan Baran (milan.baran@gmail.com) Date: 11/6/13 Time: 9:39 AM
 */
public class World {

  public World() {
    JavaCustomer Milan = new JavaCustomer("Milan");
    JavaCustomer Peter = new JavaCustomer("Peter");
    JavaCustomer Jaro = new JavaCustomer("Jaro");

    JavaGroupBrewery brewery = new JavaGroupBrewery();
    JavaGroupBrewery brewery2 = new JavaGroupBrewery();
    brewery.openBrewery();

    Milan.goGetSomeBeer(brewery);
    Peter.goGetSomeBeer(brewery);
    Jaro.goGetSomeBeer(brewery);

    Peter.goGetSomeBeer(brewery);
    Peter.goGetSomeBeer(brewery);
    Peter.goGetSomeBeer(brewery);
    Peter.goGetSomeBeer(brewery);

    brewery.closeBrewery();

    Peter.goGetSomeBeer(brewery);
    Peter.goGetSomeBeer(brewery);

  }
}
