/**
 * 
 */
package edu.ics211.h02;

/**
 * @author isaac
 *
 */
public class ManoaCheeseFromager implements CheeseFromager {

  private static ManoaCheeseFromager instance;
  
  /**
   * Returns the singleton instance.
   * @return the singleton instance.
   */
  public static ManoaCheeseFromager getInstance() {
    if (instance == null) {
      instance = new ManoaCheeseFromager();
    }
    return instance;
  }
  
  /**
   * 
   */
  private ManoaCheeseFromager() {
    // TODO Auto-generated constructor stub
  }


  @Override
  public Cheese makeCheese(String name, CheeseType type, Double fatPercentage) {
    // TODO Auto-generated method stub
    //Based on type, return a new concrete cheese
    if (type == CheeseType.FRESH)
      return new Mozzarella(name, fatPercentage);
    else if (type == CheeseType.SOFT)
      return new Brie(name, fatPercentage);
    else if (type == CheeseType.FIRM) {
      if (Math.random() > 0.5)
        return new Parmesan(name, fatPercentage);
      else
        return new Cheddar(name, fatPercentage);
    }
    return null;
  }


  @Override
  public Cheese makeCheese(String name, CheeseType type) {
    // TODO Auto-generated method stub
    if (type == CheeseType.FRESH)
      return new Mozzarella(name);
    else if (type == CheeseType.SOFT)
      return new Brie(name);
    else if (type == CheeseType.FIRM) {
      if (Math.random() > 0.5)
        return new Parmesan(name);
      else
        return new Cheddar(name);
    }
    return null;
  }


  @Override
  public Cheese makeMozzarella(String name, Double fatPercentage) {
    // TODO Auto-generated method stub
    Mozzarella newMozz = new Mozzarella(name, fatPercentage);
    return newMozz;
  }


  @Override
  public Cheese makeMozzarella(String name) {
    // TODO Auto-generated method stub
    Mozzarella newMozz = new Mozzarella(name);
    return newMozz;
  }


  @Override
  public Cheese makeBrie(String name, Double fatPercentage) {
    // TODO Auto-generated method stub
    Brie newBrie = new Brie(name, fatPercentage);
    return newBrie;
  }


  @Override
  public Cheese makeBrie(String name) {
    // TODO Auto-generated method stub
    Brie newBrie = new Brie(name);
    return newBrie;
  }


  @Override
  public Cheese makeCheddar(String name, Double fatPercentage) {
    // TODO Auto-generated method stub
    Cheddar newCheddar = new Cheddar(name, fatPercentage);
    return newCheddar;
  }


  @Override
  public Cheese makeCheddar(String name) {
    // TODO Auto-generated method stub
    Cheddar newCheddar = new Cheddar(name);
    return newCheddar;
  }


  @Override
  public Cheese makeParmesan(String name, Double fatPercentage) {
    // TODO Auto-generated method stub
    Parmesan newParm = new Parmesan(name, fatPercentage);
    return newParm;
  }


  @Override
  public Cheese makeParmesan(String name) {
    // TODO Auto-generated method stub
    Parmesan newParm = new Parmesan(name);
    return newParm;
  }

}
