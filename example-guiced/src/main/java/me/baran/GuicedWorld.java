package me.baran;

import com.google.inject.Inject;

import me.baran.brewery.blueprint.Beer;
import me.baran.brewery.blueprint.Brewery;

/**
 * Author: Milan Baran (milan.baran@gmail.com) Date: 11/6/13 Time: 1:58 PM
 */
public class GuicedWorld {

  @Inject
  public GuicedWorld(Brewery brewery) {
    brewery.openBrewery();
    Beer b = brewery.orderBeer();
  }
}
