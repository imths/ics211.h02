package edu.ics211.h02;

public class Cheese implements Comparable<Cheese> {

  private String name;
  private CheeseType type;
  private Double percentFat;
  
  
  
  /**
   * Creates a new Cheese.
   * 
   * @param name the name.
   * @param type the type.
   * @param percentFat the percentFat.
   */
  protected Cheese(String name, CheeseType type, Double percentFat) {
    super();
    this.name = name;
    this.type = type;
    this.percentFat = percentFat;
  }
  
  protected Cheese(String name, CheeseType type) {
    super();
    this.name = name;
    this.type = type;
  }



  /**
   * Returns the name.
   * @return the name
   */
  public String getName() {
    return name;
  }



  /**
   * Sets the name to name.
   * @param name the name to set
   */
  public void setName(String name) {
    this.name = name;
  }



  /**
   * Returns the type of Cheese.
   * @return the type
   */
  public CheeseType getType() {
    return type;
  }



  /**
   * Returns the percentFat.
   * @return the percentFat
   */
  public Double getPercentFat() {
    return percentFat;
  }

  /**
   * Returns the percentFat.
   * @return the percentFat
   */
  public Double getFatPercentage() {
    return percentFat;
  }

  @Override
  public int compareTo(Cheese o) {
    // TODO Auto-generated method stub
    return this.name.compareTo(o.name);
  }



  @Override
  public String toString() {
    return "Cheese [name=" + name + ", type=" + type + ", percentFat=" + percentFat + "]";
  }

}
