package me.baran.brewery.blueprint;

/**
 * Author: Milan Baran (milan.baran@gmail.com) Date: 11/6/13 Time: 10:03 AM
 */
public interface Brewery {

  void openBrewery();
  void closeBrewery();

  Boolean isOpen();
  Beer orderBeer();
  Beer orderSmallBeer();
}
