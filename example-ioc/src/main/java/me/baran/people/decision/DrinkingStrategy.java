package me.baran.people.decision;

import java.util.concurrent.atomic.AtomicInteger;

import me.baran.brewery.blueprint.Beer;

/**
 * Author: Milan Baran (milan.baran@gmail.com) Date: 11/6/13 Time: 11:14 AM
 */
public interface DrinkingStrategy {
  void drink(Beer beer, AtomicInteger mood);
}
