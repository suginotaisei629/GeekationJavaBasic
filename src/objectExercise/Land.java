package objectExercise;

public class Land  extends Property {
  private String a ;
  
  Land(String name, String type, String price, String floor ,String a) {
    super (name,type,price,floor);
    this.a = a;
  }
  
  public String getA() {
	  return a;
  }
  
  public void setA(String a) {
	  this.a = a;
  }
  
  public void greeting() {
    super.greeting();
    System.out.println("広さ :" + this.a);
    }
  }

