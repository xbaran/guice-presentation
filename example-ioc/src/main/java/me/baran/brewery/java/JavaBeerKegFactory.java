package me.baran.brewery.java;

import me.baran.brewery.BeerFactory;
import me.baran.brewery.blueprint.BeerKeg;
import me.baran.brewery.blueprint.BeerKegFactory;
import me.baran.brewery.GenericBeerKeg;

/**
 * Author: Milan Baran (milan.baran@gmail.com) Date: 11/6/13 Time: 11:55 PM
 */
public class JavaBeerKegFactory implements BeerKegFactory {

  @Override
  public BeerKeg orderBeerKeg() {
    //return new JavaBeerKeg(50);
    return new GenericBeerKeg(50,new BeerFactory(JavaBeer.class));
  }
}
