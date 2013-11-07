package me.baran.guice;

import com.google.inject.AbstractModule;

import me.baran.beer.JavaBeer;
import me.baran.beer.KozelBeer;
import me.baran.beer.PilsnerBeer;
import me.baran.beer.ZamockyBeer;

/**
 * Author: Milan Baran (milan.baran@gmail.com) Date: 11/6/13 Time: 2:55 PM
 */
public class ComplexWorldModule extends AbstractModule {

  @Override
  protected void configure() {
    install(new PrivateBreweryModule(PilsnerBeer.class));
    install(new PrivateBreweryModule(KozelBeer.class));
    install(new PrivateBreweryModule(JavaBeer.class));
    install(new PrivateBreweryModule(ZamockyBeer.class));
  }
}
