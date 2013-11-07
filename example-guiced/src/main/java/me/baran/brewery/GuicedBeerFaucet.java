package me.baran.brewery;

import com.google.inject.Inject;

import me.baran.brewery.blueprint.BeerKeg;

/**
 * Author: Milan Baran (milan.baran@gmail.com) Date: 11/6/13 Time: 1:39 PM
 */
public class GuicedBeerFaucet extends SimpleBeerFaucet {

  @Inject
  public GuicedBeerFaucet(BeerKeg beerKeg) {
    super(beerKeg);
  }
}
