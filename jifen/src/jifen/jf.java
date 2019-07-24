package jifen;

import java.util.Scanner;

public class jf{
	public static void main(String[] args) {
		int[] a = {8,4,2,1,23,344,12};
		Scanner in = new Scanner(System.in);
		System.out.println("请输入一个整数:");
		int num = in.nextInt();
		// 遍历数组a，判断num是否等于数组中的某个元素
		// boolean flag = false;
		int i=0;
		for(;i<a.length;i++) {
			if(num == a[i]) {
				//flag = true;
				System.out.println("数组a包含" + num);
				// 找到数字，跳出循环
				break;
			}
		}
		// 循环结束，没有进if条件，说明数组a不包含输入的数字
		if(i == a.length) {
			System.out.println("数组a不包含" + num);
		}
		
		
		
		
		
		
	}
}
//	public static void main(String[] args) {
//		// 猜数游戏：从键盘中任意输入一个数据，判断数列中是否包含此数
//		int[] a = {8,4,2,1,23,344,12};
//		Scanner in = new Scanner(System.in);
//		System.out.println("请输入一个整数:");
//		int num = in.nextInt();
//		// 遍历数组a，判断num是否等于数组中的某个元素
//		// boolean flag = false;
//		int i=0;
//		for(;i<a.length;i++) {
//			if(num == a[i]) {
//				//flag = true;
//				System.out.println("数组a包含" + num);
//				// 找到数字，跳出循环
//				break;
//			}
//		}
//		// 循环结束，没有进if条件，说明数组a不包含输入的数字
//		if(i == a.length) {
//			System.out.println("数组a不包含" + num);
//		}
//		
//}
//}
//	public static void main(String[] args ) { 
//    // 输入年份、月份，输出该年的该月有多少天
//		Scanner sr = new Scanner(System.in);
//		System.out.println("请输入年份:");
//		int year = sr.nextInt();
//		System.out.println("请输入月份");
//		
//		int month = sr.nextInt();
//		if (month==1||month==3|| month==5|| month==7||month==8||month==10|| month==12){
//		System.out.println("31天 ");	
//		}
//		else if (month==4||month==6|| month==9|| month==11) {
//		System.out.println("30天 ");
//		} 
//		if (month==2) {
//		if((year%4==0 && year%100!=0 || year%400==0 )); 
//	       System.out.println("28");
//		}else{ 
//	       System.out.println("29天 ");
//	       			
//	
//
//		   
//}		
//}	
//}		
//	
//		
//	
//
//	
//
//
//
//	
//	
//	
//	
//	public static void main123(String[] args) {
//		输入一个数，判断其个位是否为9
//		*Scanner in=new Scanner(System.in);
//		System.out.println("输入一个数");
//		int num=in.nextInt();
//		if(num%10==9) {
//	System.out.println( num+"个位为9");
//	}
//	}
//	
//	
//	
//	public static void main123(String[] args) {
//	输入一个会员号（4位的整数），如果该号的百位上的数字是6的话就中奖了。
//		Scanner in = new Scanner(System.in);
//		
//		System.out.println("输入一个会员号（4位的整数）");
//		int num = in.nextInt();
//		if(num/100%10==6) {
//			System.out.println( num+"恭喜您中奖了");
//		}else {
//			System.out.println( "很遗憾您没中奖");
//			
//				
//		}
//		 */
		
//某超市会员根据积分享受不同的折扣，具体折扣标准如下：
//   积分<2000  9折
//2000<=积分<4000  8折
//4000<=积分<8000  7折
//积分>=8000  6折
//要求：输入会员积分和商品总价，输出该会员应享受的折扣和应付的钱数

//Scanner in = new Scanner(System.in);
//.out.println("输入您的会员积分");
// a = in.nextInt();
//.out.println("输入商品总价");
// x = in.nextInt();
//if (a<2000) 
//{
// if (2000<=a&&a<4000)
///{
//else if (4000<=a&&a<8000)
//{
  //  System.out.println(x*0.7);
//}   
//else if(a>8000)
 // {
//	  System.out.println(x*0.6);
 

	

	       
	













