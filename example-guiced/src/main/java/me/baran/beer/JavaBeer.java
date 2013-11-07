package me.baran.beer;

import me.baran.brewery.blueprint.Beer;

/**
 * Author: Milan Baran (milan.baran@gmail.com) Date: 11/6/13 Time: 11:54 PM
 */
public class JavaBeer implements Beer {

  @Override
  public Boolean isStrong() {
    return false;
  }

  @Override
  public String getBrand() {
    return "Java";
  }
}
