package me.baran.people;

/**
 * Author: Milan Baran (milan.baran@gmail.com) Date: 11/6/13 Time: 11:29 AM
 */
public class MoodAwareGoHomeStrategy implements GoHomeStrategy {

  @Override
  public Boolean decideToGetOneMore(int mood) {
    return (mood%10 > 0);
  }
}
