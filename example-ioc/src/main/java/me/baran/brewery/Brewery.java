package me.baran.brewery;

/**
 * Author: Milan Baran (milan.baran@gmail.com) Date: 11/6/13 Time: 10:03 AM
 */
public interface Brewery {

  void openShop();
  void closeShop();

  Boolean isOpen();
  Beer orderBeer();
  Beer orderSmallBeer();
}
