import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import me.baran.brewery.JavaBeer;
import me.baran.brewery.JavaGroupBrewery;

/**
 * Author: Milan Baran (milan.baran@gmail.com) Date: 11/6/13 Time: 9:06 AM
 */
public class JavaGroupBreweryTest {

  private static JavaGroupBrewery coffeeShop;
  private static final JavaBeer unexpectedBeer = new JavaBeer();

  @BeforeClass
  public static void setUp() throws Exception {
    coffeeShop = new JavaGroupBrewery();
    coffeeShop.openBrewery();
  }

  @AfterClass
  public static void tearDown() throws Exception {
    coffeeShop.closeBrewery();
  }

  @Test
  public void testOrderBeer() throws Exception {
    JavaBeer beer = this.coffeeShop.orderBeer();
    Assert.assertNotNull(beer);
    Assert.assertNotSame(unexpectedBeer,beer);
  }

  @Test
  public void testOrderBeerLoad() throws Exception {
    for(int i = 0 ; i < 100; i++) {
      JavaBeer beer = this.coffeeShop.orderBeer();
      Assert.assertNotNull(beer);
      Assert.assertNotSame(unexpectedBeer,beer);
    }
  }
}
