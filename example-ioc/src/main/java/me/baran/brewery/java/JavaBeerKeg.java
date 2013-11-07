package me.baran.brewery.java;

import me.baran.brewery.blueprint.Beer;
import me.baran.brewery.SimpleBeerKeg;

/**
 * Author: Milan Baran (milan.baran@gmail.com) Date: 11/7/13 Time: 12:19 AM
 */
public class JavaBeerKeg extends SimpleBeerKeg {

  public JavaBeerKeg(float capacity) {
    super(capacity);
  }

  @Override
  protected Beer createBeer() {
    return new JavaBeer();
  }
}
