package objectExercise;

public class Apartment  extends Property {
  private String Land;
  
  Apartment(String name, String type, String price, String Floor ,String Land) {
    super (name,type,price,Floor);
    this.Land = Land;
  }
  
  public String getLand() {
	  return Land;
  }
  
  public void setLand(String Land) {
	  this.Land = Land;
  }
  
  public void greeting() {
	  super.greeting();
	  System.out.println("間取り :" + this.Land);
  }
}
