package edu.ics211.h02;

import java.util.Comparator;

/**
 * Represents a TypeComparator.
 *
 * @author isaac
 *
 */
public class TypeComparator implements Comparator<Cheese> {

  @Override
  public int compare(Cheese o1, Cheese o2) {
 
    return o1.getType().compareTo(o2.getType());
  }

}