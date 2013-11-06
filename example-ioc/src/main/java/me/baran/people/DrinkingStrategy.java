package me.baran.people;

import me.baran.brewery.Beer;

/**
 * Author: Milan Baran (milan.baran@gmail.com) Date: 11/6/13 Time: 11:14 AM
 */
public interface DrinkingStrategy {
  void drink(Beer beer, int mood);
}
