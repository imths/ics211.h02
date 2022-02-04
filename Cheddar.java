/**
 * 
 */
package edu.ics211.h02;

/**
 * @author isaac
 *
 */
public class Cheddar extends Firm {

  /**
   * Creates a new Cheddar.
   * @param name the name
   */
  public Cheddar(String name) {
    super(name, CheeseType.FIRM, Math.random() * .55 + 0.5);
  }
  
  /**
   * Creates a new Cheddar.
   * @param name the name.
   * @param percentFat the fat.
   */
  public Cheddar(String name, Double percentFat) {
    super(name, CheeseType.FIRM, percentFat);
    // TODO Auto-generated constructor stub
  }
  
  @Override
  public String toString() {
    return "Cheddar [name=" + getName() + ", type=" + getType() + ", percentFat="
        + getPercentFat() + "]";
  }

}
