package me.baran;

import me.baran.brewery.JavaGroupBrewery;
import me.baran.people.JavaBean;

/**
 * Author: Milan Baran (milan.baran@gmail.com) Date: 11/6/13 Time: 9:39 AM
 */
public class World {

  public World() {
    JavaBean Milan = new JavaBean("Milan");
    JavaBean Peter = new JavaBean("Peter");
    JavaBean Karol = new JavaBean("Karol");

    JavaGroupBrewery brewery = new JavaGroupBrewery();
    brewery.openShop();

    Milan.goGetSomeBeer(brewery);
    Peter.goGetSomeBeer(brewery);
    Karol.goGetSomeBeer(brewery);

    Peter.goGetSomeBeer(brewery);
    Peter.goGetSomeBeer(brewery);
    Peter.goGetSomeBeer(brewery);
    Peter.goGetSomeBeer(brewery);
    brewery.closeShop();
    Peter.goGetSomeBeer(brewery);
    Peter.goGetSomeBeer(brewery);

  }
}
