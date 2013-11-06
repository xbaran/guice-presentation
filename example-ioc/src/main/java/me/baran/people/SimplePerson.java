package me.baran.people;

import me.baran.brewery.Beer;
import me.baran.brewery.Brewery;

/**
 * Author: Milan Baran (milan.baran@gmail.com) Date: 11/6/13 Time: 11:11 AM
 */
public class SimplePerson implements LivingBean {

  private String name;
  private DrinkingStrategy drinkingStrategy;
  private GoHomeStrategy goHomeStrategy;
  private int mood = 0;

  public SimplePerson(String name) {
    this(name, new MoodAwareGoHomeStrategy());
  }

  public SimplePerson(String name, GoHomeStrategy goHomeStrategy) {
    this(name,new OptimisticDrinkingStrategy(), goHomeStrategy);
  }

  public SimplePerson(String name, DrinkingStrategy drinkingStrategy, GoHomeStrategy goHomeStrategy) {
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
    mood--;
  }

}
