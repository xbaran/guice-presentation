package me.baran.people;

import me.baran.brewery.JavaBeer;
import me.baran.brewery.JavaGroupBrewery;

/**
 * Author: Milan Baran (milan.baran@gmail.com) Date: 11/6/13 Time: 9:41 AM
 */
public class JavaCustomer {

  private String name;
  private int mood = 0;

  public JavaCustomer(String name) {
    this.name = name;
  }

  public void goGetSomeBeer(JavaGroupBrewery javaGroupBrewery) {
    if(javaGroupBrewery.isOpen()) {
      JavaBeer beer = javaGroupBrewery.orderBeer();
      drink(beer);
      goGetSomeBeer(javaGroupBrewery);
    } else {
      goBackHome();
    }
  }

  private void goBackHome() {
    mood--;
  }

  private void drink(JavaBeer beer) {
    mood++;
  }
}
