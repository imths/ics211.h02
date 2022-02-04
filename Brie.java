/**
 * 
 */
package edu.ics211.h02;

/**
 * @author isaac
 *
 */
public class Brie extends Soft {

  /**
   * Creates a new Brie.
   * @param name the name
   */
  public Brie(String name) {
    super(name, CheeseType.SOFT, Math.random() * .55 + 0.5);
  }
  
  /**
   * Creates a new Brie.
   * @param name the name.
   * @param percentFat the fat.
   */
  public Brie(String name, Double percentFat) {
    super(name, CheeseType.SOFT, percentFat);
    // TODO Auto-generated constructor stub
  }
  
  @Override
  public String toString() {
    return "Brie [name=" + getName() + ", type=" + getType() + ", percentFat=" +
        getPercentFat() + "]";
  }

}
