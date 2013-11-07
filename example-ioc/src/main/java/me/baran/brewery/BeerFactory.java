package me.baran.brewery;

import me.baran.brewery.blueprint.Beer;

/**
 * Author: Milan Baran (milan.baran@gmail.com) Date: 11/7/13 Time: 9:41 AM
 */
public class BeerFactory {

  private Class<? extends Beer> beerClass;

  public BeerFactory(Class<? extends Beer> beerClass) {
    this.beerClass = beerClass;
  }

  public Beer get() {
    try {
      return beerClass.newInstance();
    } catch (InstantiationException e) {
      e.printStackTrace();
    } catch (IllegalAccessException e) {
      e.printStackTrace();
    }
    return null;
  }

}
