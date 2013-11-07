import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.Key;

import org.junit.Before;
import org.junit.Test;

import me.baran.brewery.annotation.BreweryPub;
import me.baran.brewery.annotation.BreweryPubImpl;
import me.baran.brewery.blueprint.Brewery;
import me.baran.guice.ComplexWorldModule;

/**
 * Author: Milan Baran (milan.baran@gmail.com) Date: 11/7/13 Time: 12:03 PM
 */
public class ComplexWorldModuleTest {

  private Injector inj;

  public ComplexWorldModuleTest() {
    this.inj = Guice.createInjector(new ComplexWorldModule());
  }

  @Before
  public void setUp() throws Exception {
    inj.injectMembers(this);
  }

  @Test
  public void testWorldInjection() throws Exception {
    Brewery pilsnerPub = inj.getInstance(Key.get(Brewery.class, new BreweryPubImpl("PilsnerBeer")));
    Brewery javaPub = getJavaPub();
  }

  private Brewery javaPub;

  @Inject
  public void getJavaPub(@BreweryPub("JavaBeer") Brewery javaPub) {
    this.javaPub = javaPub;
  }

  public Brewery getJavaPub() {
    return this.javaPub;
  };

}
