package me.baran;

import me.baran.brewery.SimpleBeerFaucet;
import me.baran.brewery.SimpleBeerKegFactory;
import me.baran.brewery.SimpleBrewery;
import me.baran.brewery.blueprint.BeerKegFactory;
import me.baran.brewery.blueprint.Brewery;
import me.baran.brewery.java.JavaBeer;
import me.baran.brewery.zamocky.ZamockyBeerKegFactory;
import me.baran.brewery.zamocky.ZamockyPivovar;
import me.baran.people.CommonCustomer;
import me.baran.people.Customer;
import me.baran.people.decision.NeverGoHomeStrategy;
import me.baran.people.decision.PesimisticDrinkingStrategy;
import me.baran.people.decision.TimeToGoHomeStrategy;

/**
 * Author: Milan Baran (milan.baran@gmail.com) Date: 11/6/13 Time: 10:17 AM
 */
public class World {

  public World() {
    Brewery zamockyBrewery = new ZamockyPivovar(new ZamockyBeerKegFactory());

    BeerKegFactory javaBeerKegFactory = new SimpleBeerKegFactory(50, JavaBeer.class);
    Brewery javaPivarna = new SimpleBrewery(new SimpleBeerFaucet(javaBeerKegFactory.orderBeerKeg()),javaBeerKegFactory);


    Customer Milan = new CommonCustomer("Milan"); //Optimistic drinking, Random go home
    Customer Peter = new CommonCustomer("Peter",new NeverGoHomeStrategy());
    Customer Jaro = new CommonCustomer("Jaro",new PesimisticDrinkingStrategy(),new TimeToGoHomeStrategy());

    zamockyBrewery.openBrewery();
    javaPivarna.openBrewery();

    Milan.goGetSomeBeer(zamockyBrewery);
    Milan.goGetSomeBeer(javaPivarna);
    Peter.goGetSomeBeer(zamockyBrewery);
    Jaro.goGetSomeBeer(zamockyBrewery);

    zamockyBrewery.closeBrewery();
    javaPivarna.closeBrewery();
  }

}
