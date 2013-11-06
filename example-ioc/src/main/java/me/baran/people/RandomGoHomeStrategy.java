package me.baran.people;

import java.util.Date;
import java.util.Random;

/**
 * Author: Milan Baran (milan.baran@gmail.com) Date: 11/6/13 Time: 11:28 AM
 */
public class RandomGoHomeStrategy implements GoHomeStrategy {

  private final static Random rnd = new Random(new Date().getTime());

  @Override
  public Boolean decideToGetOneMore(int mood) {
    return rnd.nextBoolean();
  }
}
