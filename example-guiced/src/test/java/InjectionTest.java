import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Key;

import org.junit.Test;

import me.baran.brewery.blueprint.Brewery;
import me.baran.guice.annotation.BreweryPubImpl;
import me.baran.guice.WorldModule;

/**
 * Author: Milan Baran (milan.baran@gmail.com) Date: 11/6/13 Time: 1:56 PM
 */
public class InjectionTest {

  @Test
  public void testWorldInjection() throws Exception {
    Injector inj = Guice.createInjector(new WorldModule());
    Brewery zamocky = inj.getInstance(Key.get(Brewery.class,new BreweryPubImpl("Zamocky")));
    Brewery pilsner = inj.getInstance(Key.get(Brewery.class,new BreweryPubImpl("Pilsner")));
  }
}

