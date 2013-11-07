package me.baran.brewery.zamocky;

import me.baran.brewery.blueprint.BeerKegFactory;
import me.baran.brewery.SimpleBeerFaucet;
import me.baran.brewery.SimpleBrewery;

/**
 * Author: Milan Baran (milan.baran@gmail.com) Date: 11/6/13 Time: 10:57 AM
 */
public class ZamockyPivovar extends SimpleBrewery {

  public ZamockyPivovar(BeerKegFactory factory) {
    super(new SimpleBeerFaucet(factory.orderBeerKeg()),factory);
  }

}
