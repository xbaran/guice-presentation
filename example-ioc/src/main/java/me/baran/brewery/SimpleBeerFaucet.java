package me.baran.brewery;

/**
 * Author: Milan Baran (milan.baran@gmail.com) Date: 11/6/13 Time: 10:49 AM
 */
public class SimpleBeerFaucet implements BeerFaucet {

  private BeerKeg beerKeg;

  public SimpleBeerFaucet(BeerKeg beerKeg) {
    this.beerKeg = beerKeg;
  }

  @Override
  public void replaceEmptyKeg(BeerKeg beerKeg) {
    this.beerKeg = beerKeg;
  }

  @Override
  public Beer pourBeer() throws BeerKeg.EmptyKegException {
    return beerKeg.pull(0.5F);
  }

  @Override
  public Beer pourSmallBeer() throws BeerKeg.EmptyKegException {
    return beerKeg.pull(0.3F);
  }
}
