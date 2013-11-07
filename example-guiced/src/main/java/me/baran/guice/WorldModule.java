package me.baran.guice;

import com.google.inject.AbstractModule;
import com.google.inject.Provider;
import com.google.inject.Provides;
import com.google.inject.name.Names;

import me.baran.beer.ZamockyBeer;
import me.baran.brewery.blueprint.Beer;
import me.baran.brewery.blueprint.BeerFaucet;
import me.baran.brewery.blueprint.BeerKeg;
import me.baran.brewery.blueprint.BeerKegFactory;
import me.baran.brewery.blueprint.Brewery;
import me.baran.brewery.GuicedBeerFaucet;
import me.baran.brewery.GuicedBeerKeg;
import me.baran.brewery.GuicedBrewery;
import me.baran.guice.annotation.BreweryPubImpl;

/**
 * Author: Milan Baran (milan.baran@gmail.com) Date: 11/6/13 Time: 11:40 AM
 */
public class WorldModule extends AbstractModule {

  @Override
  protected void configure() {
    bind(Brewery.class).annotatedWith(new BreweryPubImpl("Zamocky")).to(GuicedBrewery.class);
    bind(BeerFaucet.class).to(GuicedBeerFaucet.class);
    bind(BeerKeg.class).to(GuicedBeerKeg.class);
    bindConstant().annotatedWith(Names.named("keg.capacity")).to(50F);

    bind(Beer.class).to(ZamockyBeer.class);

    bind(Brewery.class).annotatedWith(new BreweryPubImpl("Pilsner")).to(GuicedBrewery.class);

  }

  @Provides
  public BeerKegFactory providesBeerKegFactory(final Provider<BeerKeg> beerKeg) {

    return new BeerKegFactory() {
      @Override
      public BeerKeg orderBeerKeg() {
        return beerKeg.get();
      }
    };
  }
}
