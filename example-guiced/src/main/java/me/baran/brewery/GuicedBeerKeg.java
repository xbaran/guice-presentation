package me.baran.brewery;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.google.inject.name.Named;

import me.baran.brewery.blueprint.Beer;

/**
 * Author: Milan Baran (milan.baran@gmail.com) Date: 11/6/13 Time: 1:37 PM
 */
public class GuicedBeerKeg extends SimpleBeerKeg {

  private Provider<Beer> beerProvider;

  @Inject
  public GuicedBeerKeg(@Named("keg.capacity") float capacity, Provider<Beer> beerProvider) {
    super(capacity);
    this.beerProvider = beerProvider;
  }

  @Override
  protected Beer createBeer() {
    return beerProvider.get();
  }
}
