package com.adapter;

/**
 * Created by Zornitsa Petkova on 9/15/15.
 */
public class Providers {

  public static <T> Provider<T> of(final T value) {
    return new Provider<T>() {
      @Override
      public T get() {
        return value;
      }
    };
  }
}
