package me.baran;

import com.google.inject.Inject;

import me.baran.brewery.annotation.BreweryPub;
import me.baran.brewery.blueprint.Brewery;

/**
 * Author: Milan Baran (milan.baran@gmail.com) Date: 11/6/13 Time: 1:58 PM
 */
public class GuicedWorld2 {

  @Inject
  public GuicedWorld2(
      @BreweryPub("PilsnerBeer") Brewery pilsnerPub,
      @BreweryPub("KozelBeer")   Brewery kozelPub,
      @BreweryPub("JavaBeer")    Brewery javaPub,
      @BreweryPub("ZamockyBeer") Brewery zamockyPub
  ) {
    pilsnerPub.openBrewery();
    kozelPub.openBrewery();
    javaPub.openBrewery();
    zamockyPub.openBrewery();

  }
}
