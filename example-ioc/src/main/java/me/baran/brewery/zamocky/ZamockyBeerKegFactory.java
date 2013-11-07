package me.baran.brewery.zamocky;

import me.baran.brewery.blueprint.BeerKeg;
import me.baran.brewery.blueprint.BeerKegFactory;
import me.baran.brewery.GenericBeerKeg;

public class ZamockyBeerKegFactory implements BeerKegFactory {

    @Override
    public BeerKeg orderBeerKeg() {
      //return new ZamockyBeerKeg(50);
      return new GenericBeerKeg(50F,ZamockyBeer.class);
    }
  }