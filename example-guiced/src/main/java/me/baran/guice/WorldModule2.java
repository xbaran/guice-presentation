package me.baran.guice;

import com.google.inject.AbstractModule;

import me.baran.beer.KozelBeer;
import me.baran.beer.PilsnerBeer;

/**
 * Author: Milan Baran (milan.baran@gmail.com) Date: 11/6/13 Time: 2:55 PM
 */
public class WorldModule2 extends AbstractModule {

  @Override
  protected void configure() {
    install(new SimpleBreweryModule("PilsnerPub", PilsnerBeer.class));
    install(new SimpleBreweryModule("KozelPub", KozelBeer.class));
  }
}
