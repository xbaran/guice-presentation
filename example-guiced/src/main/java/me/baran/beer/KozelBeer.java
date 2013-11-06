package me.baran.beer;

import me.baran.brewery.Beer;

/**
 * Author: Milan Baran (milan.baran@gmail.com) Date: 11/6/13 Time: 2:37 PM
 */
public class KozelBeer implements Beer {

  @Override
  public Boolean isStrong() {
    return false;
  }

  @Override
  public String getBrand() {
    return "Kozel";
  }
}
