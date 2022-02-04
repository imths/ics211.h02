/**
 * 
 */
package edu.ics211.h02;

/**
 * @author isaac
 *
 */
public class Parmesan extends Firm {

  /**
   * Creates a new Parmesan.
   * @param name the name
   */
  public Parmesan(String name) {
    super(name, CheeseType.FIRM, Math.random() * .55 + 0.5);
  }
  
  /**
   * Creates a new Parmesan.
   * @param name the name.
   * @param percentFat the fat.
   */
  public Parmesan(String name, Double percentFat) {
    super(name, CheeseType.FIRM, percentFat);
    // TODO Auto-generated constructor stub
  }
  
  @Override
  public String toString() {
    return "Parmesan [name=" + getName() + ", type=" + getType() + ", percentFat="
        + getPercentFat() + "]";
  }

}
