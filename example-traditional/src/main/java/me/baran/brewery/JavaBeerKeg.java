package me.baran.brewery;

/**
 * Author: Milan Baran (milan.baran@gmail.com) Date: 11/6/13 Time: 7:43 AM
 */
public class JavaBeerKeg {

  private float capacity;

  public JavaBeerKeg() {
    this.capacity = 50.0F;
  }

  public JavaBeer pull(float amount) throws EmptyKegException {
    if((capacity - amount) < 0) throw new EmptyKegException();
    this.capacity = this.capacity - amount;
    return new JavaBeer();
  }

  public class EmptyKegException extends Throwable {

  }
}
