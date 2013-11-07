package me.baran.brewery;

import me.baran.brewery.blueprint.Beer;

/**
 * Author: Milan Baran (milan.baran@gmail.com) Date: 11/6/13 Time: 10:51 AM
 */
public class GenericBeerKeg extends SimpleBeerKeg {

  private Class<? extends Beer> beerClass;

  public GenericBeerKeg(float capacity, Class<? extends Beer> beerClass) {
    super(capacity);
    this.beerClass = beerClass;
  }

  protected Beer createBeer() {
    try {
      return beerClass.newInstance();
    } catch (InstantiationException e) {
      e.printStackTrace();
    } catch (IllegalAccessException e) {
      e.printStackTrace();
    }
    return null;
  };

}
