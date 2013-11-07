package me.baran.people.decision;

import java.util.concurrent.atomic.AtomicInteger;

import me.baran.brewery.blueprint.Beer;

/**
 * Author: Milan Baran (milan.baran@gmail.com) Date: 11/6/13 Time: 11:23 AM
 */
public class OptimisticDrinkingStrategy implements DrinkingStrategy {

  @Override
  public void drink(Beer beer, AtomicInteger mood) {
    mood.getAndIncrement();
  }
}
