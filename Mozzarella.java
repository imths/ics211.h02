/**
 * 
 */
package edu.ics211.h02;

/**
 * @author isaac
 *
 */
public class Mozzarella extends Fresh {

  /**
   * Creates a new Mozzarella.
   * @param name the name
   */
  public Mozzarella(String name) {
    super(name, CheeseType.FRESH, Math.random() * .55 + 0.5);
  }
  
  /**
   * Creates a new Mozzarella.
   * @param name the name.
   * @param percentFat the fat.
   */
  public Mozzarella(String name, Double percentFat) {
    super(name, CheeseType.FRESH, percentFat);
    // TODO Auto-generated constructor stub
  }
  
  @Override
  public String toString() {
    return "Mozzarella [name=" + getName() + ", type=" + getType() + ", percentFat="
        + getPercentFat() + "]";
  }

}
