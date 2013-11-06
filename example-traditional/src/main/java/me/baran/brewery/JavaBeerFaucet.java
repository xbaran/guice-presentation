package me.baran.brewery;

/**
 * Author: Milan Baran (milan.baran@gmail.com) Date: 11/6/13 Time: 7:43 AM
 */
public class JavaBeerFaucet {

  private JavaBeerKeg beerKeg;

  public JavaBeerFaucet() {
    this.beerKeg = new JavaBeerKeg();
  }

  public void replaceEmptyKeg(JavaBeerKeg javaBeerKeg) {
    this.beerKeg = javaBeerKeg;
  }

  public JavaBeer pourBeer() throws JavaBeerKeg.EmptyKegException {
    return beerKeg.pull(0.5F);
  }

  public JavaBeer pourSmallBeer() throws JavaBeerKeg.EmptyKegException {
    return beerKeg.pull(0.3F);
  }
}
