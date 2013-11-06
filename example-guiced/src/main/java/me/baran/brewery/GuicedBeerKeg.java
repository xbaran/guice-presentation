package me.baran.brewery;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.google.inject.name.Named;

/**
 * Author: Milan Baran (milan.baran@gmail.com) Date: 11/6/13 Time: 1:37 PM
 */
public class GuicedBeerKeg extends SimpleBeerKeg {

  @Inject
  private Provider<Beer> beerProvider;

  @Inject
  public GuicedBeerKeg(@Named("keg.capacity") float capacity) {
    super(capacity);
  }

  @Override
  protected Beer createBeer() {
    return beerProvider.get();
  }
}
