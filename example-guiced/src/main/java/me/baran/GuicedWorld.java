package me.baran;

import com.google.inject.Inject;

import me.baran.brewery.Beer;
import me.baran.brewery.Brewery;

/**
 * Author: Milan Baran (milan.baran@gmail.com) Date: 11/6/13 Time: 1:58 PM
 */
public class GuicedWorld {

  @Inject
  public GuicedWorld(Brewery brewery) {
    brewery.openShop();
    Beer b = brewery.orderBeer();
  }
}
