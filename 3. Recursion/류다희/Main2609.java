package boj;

import java.util.Scanner;

public class Main2609 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		System.out.println(euclid(a,b));
		System.out.println(a*b/euclid(a,b));
		
	}

	private static int euclid(int i, int j) {
		int r = i%j;
		if (r==0) {
			return j;
		}
		else {
			return euclid(j,r);
		}
		
		/*
		 
		 ��Ŭ���� ȣ����
		 r=a%b
		 gcb(a,b) = gcb(b,r)
		 
		 �ּҰ������ a*b�� �ִ������� ���� ��.
		 
		 */
		
	}
	

}
