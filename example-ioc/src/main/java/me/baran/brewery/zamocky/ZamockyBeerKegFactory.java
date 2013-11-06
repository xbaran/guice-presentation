package me.baran.brewery.zamocky;

import me.baran.brewery.BeerKeg;
import me.baran.brewery.BeerKegFactory;

public class ZamockyBeerKegFactory implements BeerKegFactory {

    @Override
    public BeerKeg brewBeerKeg() {
      return new ZamockyBeerKeg(50);
    }
  }