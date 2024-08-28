package objectExercise;

public class Apartment  extends Property {
  private String land;
  
  Apartment(String name, String type, String price, String floor ,String land) {
    super (name,type,price,floor);
    this.land = land;
  }
  
  public String getLand() {
	  return land;
  }
  
  public void setLand(String land) {
	  this.land = land;
  }
  
  public void greeting() {
	  super.greeting();
	  System.out.println("間取り :" + this.land);
  }
}
