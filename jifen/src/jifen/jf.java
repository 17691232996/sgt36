package jifen;

import java.util.Scanner;

public class jf{
	public static void main(String[] args) {
		int[] a = {8,4,2,1,23,344,12};
		Scanner in = new Scanner(System.in);
		System.out.println("������һ������:");
		int num = in.nextInt();
		// ��������a���ж�num�Ƿ���������е�ĳ��Ԫ��
		// boolean flag = false;
		int i=0;
		for(;i<a.length;i++) {
			if(num == a[i]) {
				//flag = true;
				System.out.println("����a����" + num);
				// �ҵ����֣�����ѭ��
				break;
			}
		}
		// ѭ��������û�н�if������˵������a���������������
		if(i == a.length) {
			System.out.println("����a������" + num);
		}
		
		
		
		
		
		
	}
}
//	public static void main(String[] args) {
//		// ������Ϸ���Ӽ�������������һ�����ݣ��ж��������Ƿ��������
//		int[] a = {8,4,2,1,23,344,12};
//		Scanner in = new Scanner(System.in);
//		System.out.println("������һ������:");
//		int num = in.nextInt();
//		// ��������a���ж�num�Ƿ���������е�ĳ��Ԫ��
//		// boolean flag = false;
//		int i=0;
//		for(;i<a.length;i++) {
//			if(num == a[i]) {
//				//flag = true;
//				System.out.println("����a����" + num);
//				// �ҵ����֣�����ѭ��
//				break;
//			}
//		}
//		// ѭ��������û�н�if������˵������a���������������
//		if(i == a.length) {
//			System.out.println("����a������" + num);
//		}
//		
//}
//}
//	public static void main(String[] args ) { 
//    // ������ݡ��·ݣ��������ĸ����ж�����
//		Scanner sr = new Scanner(System.in);
//		System.out.println("���������:");
//		int year = sr.nextInt();
//		System.out.println("�������·�");
//		
//		int month = sr.nextInt();
//		if (month==1||month==3|| month==5|| month==7||month==8||month==10|| month==12){
//		System.out.println("31�� ");	
//		}
//		else if (month==4||month==6|| month==9|| month==11) {
//		System.out.println("30�� ");
//		} 
//		if (month==2) {
//		if((year%4==0 && year%100!=0 || year%400==0 )); 
//	       System.out.println("28");
//		}else{ 
//	       System.out.println("29�� ");
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
//		����һ�������ж����λ�Ƿ�Ϊ9
//		*Scanner in=new Scanner(System.in);
//		System.out.println("����һ����");
//		int num=in.nextInt();
//		if(num%10==9) {
//	System.out.println( num+"��λΪ9");
//	}
//	}
//	
//	
//	
//	public static void main123(String[] args) {
//	����һ����Ա�ţ�4λ��������������úŵİ�λ�ϵ�������6�Ļ����н��ˡ�
//		Scanner in = new Scanner(System.in);
//		
//		System.out.println("����һ����Ա�ţ�4λ��������");
//		int num = in.nextInt();
//		if(num/100%10==6) {
//			System.out.println( num+"��ϲ���н���");
//		}else {
//			System.out.println( "���ź���û�н�");
//			
//				
//		}
//		 */
		
//ĳ���л�Ա���ݻ������ܲ�ͬ���ۿۣ������ۿ۱�׼���£�
//   ����<2000  9��
//2000<=����<4000  8��
//4000<=����<8000  7��
//����>=8000  6��
//Ҫ�������Ա���ֺ���Ʒ�ܼۣ�����û�ԱӦ���ܵ��ۿۺ�Ӧ����Ǯ��

//Scanner in = new Scanner(System.in);
//.out.println("�������Ļ�Ա����");
// a = in.nextInt();
//.out.println("������Ʒ�ܼ�");
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
 

	

	       
	













