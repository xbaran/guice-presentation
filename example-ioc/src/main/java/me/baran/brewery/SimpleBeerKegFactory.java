package me.baran.brewery;

import me.baran.brewery.blueprint.Beer;
import me.baran.brewery.blueprint.BeerKeg;
import me.baran.brewery.blueprint.BeerKegFactory;

/**
 * Author: Milan Baran (milan.baran@gmail.com) Date: 11/7/13 Time: 2:40 PM
 */
public class SimpleBeerKegFactory implements BeerKegFactory {

  private final float capacity;
  private final Class<? extends Beer> beerClass;

  public SimpleBeerKegFactory(float capacity, Class<? extends Beer> beerClass) {
    this.capacity = capacity;
    this.beerClass = beerClass;
  }

  @Override
  public BeerKeg orderBeerKeg() {
    return new GenericBeerKeg(capacity,new BeerFactory(beerClass));
  }
}
