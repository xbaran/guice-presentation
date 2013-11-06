package me.baran.people;

import me.baran.brewery.Beer;

/**
 * Author: Milan Baran (milan.baran@gmail.com) Date: 11/6/13 Time: 11:23 AM
 */
public class OptimisticDrinkingStrategy implements DrinkingStrategy {

  @Override
  public void drink(Beer beer, int mood) {
    mood = mood + 1;
  }
}
