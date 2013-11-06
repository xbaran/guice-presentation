package me.baran;

import com.google.inject.Inject;

import me.baran.brewery.Beer;
import me.baran.brewery.Brewery;
import me.baran.guice.BreweryPub;

/**
 * Author: Milan Baran (milan.baran@gmail.com) Date: 11/6/13 Time: 1:58 PM
 */
public class GuicedWorld2 {

  @Inject
  public GuicedWorld2(
      @BreweryPub("PilsnerPub") Brewery pilsnerPub,
      @BreweryPub("KozelPub")   Brewery kozelPub) {
    pilsnerPub.openShop();
    kozelPub.openShop();

    Beer pilsner = pilsnerPub.orderBeer();
    Beer kozel = kozelPub.orderBeer();
  }
}
