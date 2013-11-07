package me.baran.brewery;

import me.baran.brewery.blueprint.Beer;
import me.baran.brewery.blueprint.BeerKeg;

/**
 * Author: Milan Baran (milan.baran@gmail.com) Date: 11/6/13 Time: 10:51 AM
 */
public abstract class SimpleBeerKeg implements BeerKeg {

  private float capacity;

  public SimpleBeerKeg(float capacity) {
    this.capacity = capacity;
  }

  @Override
  public Beer pull(float amount) throws EmptyKegException {
    if((capacity - amount) < 0) throw new BeerKeg.EmptyKegException();
    this.capacity = this.capacity - amount;
    return createBeer();
  }

  protected abstract Beer createBeer();

}
