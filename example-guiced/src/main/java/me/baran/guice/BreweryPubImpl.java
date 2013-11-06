package me.baran.guice;

import java.io.Serializable;
import java.lang.annotation.Annotation;

class BreweryPubImpl implements BreweryPub, Serializable {

  private final String value;

  public BreweryPubImpl(String value) {
    this.value = (value!=null) ? value : "name";
  }

  public String value() {
    return this.value;
  }

  public int hashCode() {
    // This is specified in java.lang.Annotation.
    return (127 * "value".hashCode()) ^ value.hashCode();
  }

  public boolean equals(Object o) {
    if (!(o instanceof BreweryPub)) {
      return false;
    }

    BreweryPub other = (BreweryPub) o;
    return value.equals(other.value());
  }

  public String toString() {
    return "@" + BreweryPub.class.getName() + "(value=" + value + ")";
  }

  public Class<? extends Annotation> annotationType() {
    return BreweryPub.class;
  }

  private static final long serialVersionUID = 0;
}