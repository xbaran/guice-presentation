package me.baran.brewery;

import com.google.inject.Inject;

/**
 * Author: Milan Baran (milan.baran@gmail.com) Date: 11/6/13 Time: 1:15 PM
 */
public class GuicedBrewery extends SimpleBrewery {

  @Inject
  public GuicedBrewery(BeerFaucet beerFaucet, BeerKegFactory beerKegFactory) {
    super(beerFaucet, beerKegFactory);
  }
}
