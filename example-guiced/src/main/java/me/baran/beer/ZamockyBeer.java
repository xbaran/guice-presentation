package me.baran.beer;

import me.baran.brewery.blueprint.Beer;

public class ZamockyBeer implements Beer {

  @Override
  public Boolean isStrong() {
    return true;
  }

  @Override
  public String getBrand() {
    return "Zamocke";
  }
}