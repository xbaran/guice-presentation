package me.baran.guice;

import com.google.inject.PrivateModule;
import com.google.inject.Provider;
import com.google.inject.Provides;
import com.google.inject.name.Names;

import java.lang.annotation.Annotation;

import me.baran.brewery.GuicedBeerFaucet;
import me.baran.brewery.GuicedBeerKeg;
import me.baran.brewery.GuicedBrewery;
import me.baran.brewery.annotation.BreweryPubImpl;
import me.baran.brewery.blueprint.Beer;
import me.baran.brewery.blueprint.BeerFaucet;
import me.baran.brewery.blueprint.BeerKeg;
import me.baran.brewery.blueprint.BeerKegFactory;
import me.baran.brewery.blueprint.Brewery;

/**
 * Author: Milan Baran (milan.baran@gmail.com) Date: 11/6/13 Time: 2:37 PM
 */
class PrivateBreweryModule extends PrivateModule {

  private final Annotation pubAnnotation;
  private final Class<? extends Beer> beerClass;

  PrivateBreweryModule(Class<? extends Beer> beerClass) {
    this.pubAnnotation = new BreweryPubImpl(beerClass.getSimpleName());
    this.beerClass = beerClass;
  }

  @Override
  protected void configure() {
    bind(Brewery.class).annotatedWith(pubAnnotation).to(GuicedBrewery.class);
    bind(BeerFaucet.class).to(GuicedBeerFaucet.class);
    bind(BeerKeg.class).to(GuicedBeerKeg.class);
    bindConstant().annotatedWith(Names.named("keg.capacity")).to(50F);

    bind(Beer.class).to(beerClass);

    expose(Brewery.class).annotatedWith(pubAnnotation);
  }

  @Provides
  public BeerKegFactory providesBeerKegFactory(final Provider<BeerKeg> beerKegProvider) {

    return new BeerKegFactory() {
      @Override
      public BeerKeg orderBeerKeg() {
        return beerKegProvider.get();
      }
    };
  }
}
