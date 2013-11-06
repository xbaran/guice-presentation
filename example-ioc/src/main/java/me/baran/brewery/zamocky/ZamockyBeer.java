package me.baran.brewery.zamocky;

import me.baran.brewery.Beer;

public class ZamockyBeer implements Beer {

  @Override
  public Boolean isStrong() {
    return true;
  }

  @Override
  public String getBrand() {
    return Brand.Kozel.name();
  }
}