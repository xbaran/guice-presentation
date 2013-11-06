package me.baran.brewery;

/**
 * Author: Milan Baran (milan.baran@gmail.com) Date: 11/6/13 Time: 10:04 AM
 */
public interface Beer {
  public enum Brand { Pilsner,Kozel,Svijany,Magic };

  Boolean isStrong();
  String getBrand();

}
