package objectExercise;

public class Land  extends Property {
  private String A ;
  
  Land(String name, String type, String price, String Floor ,String A) {
    super (name,type,price,Floor);
    this.A = A;
  }
  
  public String getA() {
	  return A;
  }
  
  public void setA(String A) {
	  this.A = A;
  }
  
  public void greeting() {
    super.greeting();
    System.out.println("広さ :" + this.A);
    }
  }

