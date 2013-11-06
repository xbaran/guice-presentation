import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import me.baran.brewery.JavaBeer;
import me.baran.brewery.JavaGroupBrewery;

/**
 * Author: Milan Baran (milan.baran@gmail.com) Date: 11/6/13 Time: 9:06 AM
 */
public class JavaGroupCoffeeShopTest {

  private static JavaGroupBrewery coffeeShop;
  private static final JavaBeer expectedBeer = new JavaBeer();

  @BeforeClass
  public static void setUp() throws Exception {
    coffeeShop = new JavaGroupBrewery();
    coffeeShop.openShop();
  }

  @AfterClass
  public static void tearDown() throws Exception {
    coffeeShop.closeShop();
  }

  @Test @Ignore
  public void testOrderBeer() throws Exception {
    JavaBeer beer = this.coffeeShop.orderBeer();
    Assert.assertEquals(expectedBeer,beer);
  }

  @Test @Ignore
  public void testOrderBeerLoad() throws Exception {
    JavaBeer beer = this.coffeeShop.orderBeer();
    Assert.assertEquals(expectedBeer,beer);
  }
}
