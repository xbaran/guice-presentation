package me.baran;

import me.baran.brewery.Brewery;
import me.baran.people.AlwaysGoHomeStrategy;
import me.baran.people.LivingBean;
import me.baran.brewery.zamocky.ZamockyBeerKegFactory;
import me.baran.brewery.zamocky.ZamockyPivovar;
import me.baran.people.NeverGoHomeStrategy;
import me.baran.people.PesimisticDrinkingStrategy;
import me.baran.people.SimplePerson;

/**
 * Author: Milan Baran (milan.baran@gmail.com) Date: 11/6/13 Time: 10:17 AM
 */
public class World {

  public World() {
    Brewery zamockyBrewery = new ZamockyPivovar(new ZamockyBeerKegFactory());
    LivingBean Milan = new SimplePerson("Milan"); //Optimistic drinking, Random go home
    LivingBean Peter = new SimplePerson("Peter",new NeverGoHomeStrategy());
    LivingBean Karol = new SimplePerson("Karol",new PesimisticDrinkingStrategy(),new AlwaysGoHomeStrategy());

    zamockyBrewery.openShop();

    Milan.goGetSomeBeer(zamockyBrewery);
    Peter.goGetSomeBeer(zamockyBrewery);
    Karol.goGetSomeBeer(zamockyBrewery);

    zamockyBrewery.closeShop();
  }
}
