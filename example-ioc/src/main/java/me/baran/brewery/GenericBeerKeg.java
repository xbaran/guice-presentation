package me.baran.brewery;

import me.baran.brewery.blueprint.Beer;

/**
 * Author: Milan Baran (milan.baran@gmail.com) Date: 11/6/13 Time: 10:51 AM
 */
public class GenericBeerKeg extends SimpleBeerKeg {

  private BeerFactory beerFactory;

  public GenericBeerKeg(float capacity, BeerFactory beerFactory) {
    super(capacity);
    this.beerFactory = beerFactory;
  }

  protected Beer createBeer() {
    return beerFactory.get();
  };

}
