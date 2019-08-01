
package buyphone;
import java.util.Scanner;

public class Test {


	public static void main(String[]rags) {
		
		Phone pOne = new Phone("iphone6s");
		People peOne = new People("李四");
		
		pOne.pprice(3000);
		pOne.pnumber(100);
		pOne.printPhone();
		 
		peOne.pemoney(5000);
		peOne.pesex("男");
		peOne.printPhone();	
		
		System.out.println("是否购买手机，请输入YES/NO：");//通过控制台输入
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
	
		if(str.equals("YES")) {
		
			System.out.println("购买成功，您的信息如下：");
			System.out.println("余额："+peOne.aftercash());
			System.out.println("余额："+pOne.aftercount());//不能直接调用方法，通过相关类调用方法
			
		}else {
			System.out.println("购买失败");
		}
		

	}
}
