package buyphone;

public class Phone {
	String model;
	double price;
	int count;
	
  public Phone(String model){
      this.model = model;
  }
  public void pprice(int pprice){
	  price = pprice;
    	  
   }
  public void pnumber(int pnumber){
	  count = pnumber;
  }

  public void printPhone(){
	  System.out.println("小明你好，本店现有如下手机：");
      System.out.println("型号:"+ model);
      System.out.println("库存:" + count );
      System.out.println("价钱:" + price );
    
  }
  public int aftercount(){
      
	  count = count -1;
	  return count;
  }
} 