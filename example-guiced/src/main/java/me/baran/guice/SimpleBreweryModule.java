package me.baran.guice;

import com.google.inject.PrivateModule;

import java.lang.annotation.Annotation;

import me.baran.brewery.Beer;
import me.baran.brewery.Brewery;

/**
 * Author: Milan Baran (milan.baran@gmail.com) Date: 11/6/13 Time: 2:45 PM
 */
public class SimpleBreweryModule extends PrivateModule {

  private final Class<? extends Beer> beerClass;
  private final String name;
  private final Annotation pubAnnotation;

  public SimpleBreweryModule(String name,Class<? extends Beer> beerClass) {
    this.beerClass = beerClass;
    this.name = name;
    this.pubAnnotation = new BreweryPubImpl(name);
  }

  @Override
  protected void configure() {
    install(new BreweryModule(pubAnnotation));

    bind(Beer.class).to(beerClass);

    expose(Brewery.class).annotatedWith(pubAnnotation);
  }

}
