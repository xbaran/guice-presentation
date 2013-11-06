package me.baran.guice;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.name.Names;

import java.lang.annotation.Annotation;

import me.baran.brewery.BeerFaucet;
import me.baran.brewery.BeerKeg;
import me.baran.brewery.BeerKegFactory;
import me.baran.brewery.Brewery;
import me.baran.brewery.GuicedBeerFaucet;
import me.baran.brewery.GuicedBeerKeg;
import me.baran.brewery.GuicedBrewery;

/**
 * Author: Milan Baran (milan.baran@gmail.com) Date: 11/6/13 Time: 2:37 PM
 */
class BreweryModule extends AbstractModule {

  private final Annotation pubAnnotation;

  BreweryModule(Annotation pubAnnotation) {
    this.pubAnnotation = pubAnnotation;
  }

  @Override
  protected void configure() {
    bind(Brewery.class).annotatedWith(pubAnnotation).to(GuicedBrewery.class);
    bind(BeerFaucet.class).to(GuicedBeerFaucet.class);
    bind(BeerKeg.class).to(GuicedBeerKeg.class);

    bindConstant().annotatedWith(Names.named("keg.capacity")).to(50F);
  }

  @Provides
  public BeerKegFactory providesBeerKegFactory(final BeerKeg beerKeg) {

    return new BeerKegFactory() {
      @Override
      public BeerKeg brewBeerKeg() {
        return beerKeg;
      }
    };
  }
}
