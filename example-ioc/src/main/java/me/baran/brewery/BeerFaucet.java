package me.baran.brewery;

/**
 * Author: Milan Baran (milan.baran@gmail.com) Date: 11/6/13 Time: 10:07 AM
 */
public interface BeerFaucet {

  public void replaceEmptyKeg(BeerKeg beerKeg);
  public Beer pourBeer() throws BeerKeg.EmptyKegException;
  public Beer pourSmallBeer() throws BeerKeg.EmptyKegException;

}
