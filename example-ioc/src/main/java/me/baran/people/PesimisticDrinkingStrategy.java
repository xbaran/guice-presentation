package me.baran.people;

import me.baran.brewery.Beer;

/**
 * Author: Milan Baran (milan.baran@gmail.com) Date: 11/6/13 Time: 11:24 AM
 */
public class PesimisticDrinkingStrategy implements DrinkingStrategy {

  @Override
  public void drink(Beer beer, int mood) {
    if(beer.isStrong()) {
      mood = mood + 5;
    } else {
      mood = mood + 2;
    }
  }
}
