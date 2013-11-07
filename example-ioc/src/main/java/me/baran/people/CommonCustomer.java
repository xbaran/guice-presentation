package me.baran.people;

import java.util.concurrent.atomic.AtomicInteger;

import me.baran.brewery.blueprint.Beer;
import me.baran.brewery.blueprint.Brewery;
import me.baran.people.decision.DrinkingStrategy;
import me.baran.people.decision.GoHomeStrategy;
import me.baran.people.decision.OptimisticDrinkingStrategy;
import me.baran.people.decision.TimeToGoHomeStrategy;

/**
 * Author: Milan Baran (milan.baran@gmail.com) Date: 11/6/13 Time: 11:11 AM
 */
public class CommonCustomer implements Customer {

  private String name;
  private DrinkingStrategy drinkingStrategy;
  private GoHomeStrategy goHomeStrategy;
  private final AtomicInteger mood = new AtomicInteger(0);

  public CommonCustomer(String name) {
    this(name, new TimeToGoHomeStrategy());
  }

  public CommonCustomer(String name, GoHomeStrategy goHomeStrategy) {
    this(name,new OptimisticDrinkingStrategy(), goHomeStrategy);
  }

  public CommonCustomer(String name, DrinkingStrategy drinkingStrategy,
                        GoHomeStrategy goHomeStrategy) {
    this.name = name;
    this.drinkingStrategy = drinkingStrategy;
    this.goHomeStrategy = goHomeStrategy;
  }

  @Override
  public void goGetSomeBeer(Brewery brewery) {
    if(brewery.isOpen()) {
      Beer beer = brewery.orderBeer();
      drinkingStrategy.drink(beer, mood);
      if(goHomeStrategy.decideToGetOneMore(mood)) {
        goBackHome();
      } else {
        goGetSomeBeer(brewery);
      }
    } else {
      goBackHome();
    }
  }

  private void goBackHome() {
    mood.incrementAndGet();
  }

}
