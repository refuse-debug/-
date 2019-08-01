package buyphone;

public class People {
	String name;
	String gender;
	double cash;
	
	  public People(String name){
	      this.name = name;
	  }
	      public void pesex(String pesex){
	    	  gender = pesex;
	    	  
	   }
	      public void pemoney(int pemoney){
	    	  cash = pemoney;
}

	      public void printPhone(){
	          System.out.println("名字:"+  name);
	          System.out.println("性别:" + gender );
	          System.out.println("存款:" + cash );
	        
	       }
	      public double aftercash(){
	          
	    	  cash = cash -3000;
	    	  return cash;
	      }
	    } 

