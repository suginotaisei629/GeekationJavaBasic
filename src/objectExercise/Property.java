package objectExercise;

public class Property {
  private String name;
  private String type;
  private String price;
  private String floor;
  
  Property (String name, String type, String price, String floor) {
    this.name = name;
    this.type =type;
    this.price = price;
    this.floor = floor;
  }
  
  public String getName( ) {
	  return name;
  }
  
  public void setName(String name) {
	  this.name = name;
  }
  
  public String getType() {
	  return type;
  }
  
  public void setType(String type) {
	  this.type = type;
  }
  
  public String getPrice() {
	  return price;
  }
  
  public void setPrice(String price) {
	  this.price = price;
  }
  
  public String getFloor() {
	  return floor;
  }
  
  public void setFloor(String floor) {
	  this.floor = floor;
  }
  
  
  public void greeting() {
    System.out.println("物件名 : " + this.name);
    System.out.println("物件所有者名 :" + this.type);
    System.out.println("物件種別 :" + this.price);
    System.out.println("物件価格 :" + this.floor);
  }
}
