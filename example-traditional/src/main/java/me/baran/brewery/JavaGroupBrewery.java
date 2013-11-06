package me.baran.brewery;

/**
 * Author: Milan Baran (milan.baran@gmail.com) Date: 11/6/13 Time: 7:28 AM
 */
public class JavaGroupBrewery {

  private JavaBeerFaucet javaBeerFaucet;
  private Boolean openStatus = Boolean.FALSE;

  public JavaGroupBrewery() {
    buildCoffeeShop();
    this.javaBeerFaucet = new JavaBeerFaucet();
  }

  public void openShop() {
    cleanUp(javaBeerFaucet);
    this.openStatus = Boolean.TRUE;
  }

  public void closeShop() {
    cleanUp(javaBeerFaucet);
    this.openStatus = Boolean.FALSE;
  }

  public Boolean isOpen() {
    return openStatus;
  }

  public JavaBeer orderBeer() {
    try {
      return this.javaBeerFaucet.pourBeer();
    } catch (JavaBeerKeg.EmptyKegException e) {
      this.javaBeerFaucet.replaceEmptyKeg(new JavaBeerKeg());
      return orderBeer();
    }
  }

  public JavaBeer orderSmallBeer() {
    try {
      return this.javaBeerFaucet.pourSmallBeer();
    } catch (JavaBeerKeg.EmptyKegException e) {
      this.javaBeerFaucet.replaceEmptyKeg(new JavaBeerKeg());
      return orderSmallBeer();
    }
  }

  private void cleanUp(JavaBeerFaucet javaBeerFaucet) {

  }

  private void buildCoffeeShop() {
  }

}
