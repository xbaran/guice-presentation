import com.google.inject.Guice;
import com.google.inject.Injector;

import org.junit.Test;

import me.baran.GuicedWorld2;
import me.baran.guice.WorldModule2;

/**
 * Author: Milan Baran (milan.baran@gmail.com) Date: 11/6/13 Time: 1:56 PM
 */
public class InjectionTest {

  @Test
  public void testWorldInjection() throws Exception {
    Injector inj = Guice.createInjector(new WorldModule2());
    GuicedWorld2 world = inj.getInstance(GuicedWorld2.class);
  }
}
