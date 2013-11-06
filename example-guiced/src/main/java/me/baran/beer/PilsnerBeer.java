package me.baran.beer;

import me.baran.brewery.Beer;

/**
 * Author: Milan Baran (milan.baran@gmail.com) Date: 11/6/13 Time: 2:28 PM
 */
public class PilsnerBeer implements Beer {

  @Override
  public Boolean isStrong() {
    return true;
  }

  @Override
  public String getBrand() {
    return "Pilsner";
  }
}
