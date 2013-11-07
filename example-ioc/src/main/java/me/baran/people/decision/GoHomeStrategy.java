package me.baran.people.decision;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Author: Milan Baran (milan.baran@gmail.com) Date: 11/6/13 Time: 11:18 AM
 */
public interface GoHomeStrategy {
  Boolean decideToGetOneMore(AtomicInteger mood);
}
