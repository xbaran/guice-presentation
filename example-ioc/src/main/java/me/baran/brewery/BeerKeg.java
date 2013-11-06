package me.baran.brewery;

/**
 * Author: Milan Baran (milan.baran@gmail.com) Date: 11/6/13 Time: 10:05 AM
 */
public interface BeerKeg {

  Beer pull(float amount) throws EmptyKegException;

  public class EmptyKegException extends Throwable {};
}
