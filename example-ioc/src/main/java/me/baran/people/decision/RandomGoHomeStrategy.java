package me.baran.people.decision;

import java.util.Date;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Author: Milan Baran (milan.baran@gmail.com) Date: 11/6/13 Time: 11:28 AM
 */
public class RandomGoHomeStrategy implements GoHomeStrategy {

  private final static Random rnd = new Random(new Date().getTime());

  @Override
  public Boolean decideToGetOneMore(AtomicInteger mood) {
    return rnd.nextBoolean();
  }
}
