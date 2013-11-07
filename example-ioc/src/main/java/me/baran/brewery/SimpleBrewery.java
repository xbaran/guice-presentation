package me.baran.brewery;

import me.baran.brewery.blueprint.Beer;
import me.baran.brewery.blueprint.BeerFaucet;
import me.baran.brewery.blueprint.BeerKeg;
import me.baran.brewery.blueprint.BeerKegFactory;
import me.baran.brewery.blueprint.Brewery;

/**
 * Author: Milan Baran (milan.baran@gmail.com) Date: 11/6/13 Time: 10:18 AM
 */
public class SimpleBrewery implements Brewery {

  protected BeerFaucet beerFaucet;
  protected BeerKegFactory beerKegFactory;
  protected Boolean openStatus = Boolean.FALSE;

  public SimpleBrewery(BeerFaucet beerFaucet, BeerKegFactory beerKegFactory) {
    buildCoffeeShop();
    this.beerFaucet = beerFaucet;
    this.beerKegFactory = beerKegFactory;
  }

  public void openBrewery() {
    cleanUp(beerFaucet);
    this.openStatus = Boolean.TRUE;
  }

  public void closeBrewery() {
    cleanUp(beerFaucet);
    this.openStatus = Boolean.FALSE;
  }

  public Boolean isOpen() {
    return openStatus;
  }

  public Beer orderBeer() {
    try {
      return beerFaucet.pourBeer();
    } catch (BeerKeg.EmptyKegException e) {
      replaceEmptyKeg();
      return orderBeer();
    }
  }

  public Beer orderSmallBeer() {
    try {
      return beerFaucet.pourSmallBeer();
    } catch (BeerKeg.EmptyKegException e) {
      replaceEmptyKeg();
      return orderSmallBeer();
    }
  }

  private void replaceEmptyKeg() {
    beerFaucet.replaceEmptyKeg(beerKegFactory.orderBeerKeg());
  }

  private void cleanUp(BeerFaucet beerFaucet) {

  }

  private void buildCoffeeShop() {
  }
}
