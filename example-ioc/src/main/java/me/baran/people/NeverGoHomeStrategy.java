package me.baran.people;

/**
 * Author: Milan Baran (milan.baran@gmail.com) Date: 11/6/13 Time: 11:27 AM
 */
public class NeverGoHomeStrategy implements GoHomeStrategy {

  @Override
  public Boolean decideToGetOneMore(int mood) {
    return true;
  }
}
