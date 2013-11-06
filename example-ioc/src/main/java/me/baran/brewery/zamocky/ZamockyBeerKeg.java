package me.baran.brewery.zamocky;

import me.baran.brewery.Beer;
import me.baran.brewery.SimpleBeerKeg;

public class ZamockyBeerKeg extends SimpleBeerKeg {

    public ZamockyBeerKeg(float capacity) {
      super(capacity);
    }

    @Override
    protected Beer createBeer() {
      return new ZamockyBeer();
    }
  }