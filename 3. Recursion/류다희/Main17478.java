package recursion;

import java.util.Scanner;

public class Main17478 {
	static String lines = "";
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		System.out.println("��� �� ��ǻ�Ͱ��а� �л��� ������ �������� ã�ư� ������.");
		recursion(n);
		
	}
	
	public static void recursion(int n) {
		
		String line = lines;
		if(n==0) {
			System.out.println(line+"\"����Լ��� ������?\"");
			System.out.println(line+"\"����Լ��� �ڱ� �ڽ��� ȣ���ϴ� �Լ����\"");
			System.out.println(line+"��� �亯�Ͽ���.");
			return;
		}
			System.out.println(line+"\"����Լ��� ������?\"");
			System.out.println(line+"\"�� ����. �������� �� �� ����⿡ �̼��� ��� ������ ����� ������ �־���.");
			System.out.println(line+"���� ������� ��� �� ���ο��� ������ ������ �߰�, ��� �����Ӱ� ����� �־���.");
			System.out.println(line+"���� ���� ��κ� �ǾҴٰ� �ϳ�. �׷��� ��� ��, �� ���ο��� �� ���� ã�ƿͼ� ������.\"");
			
			lines+="____";
			recursion(n-1);
			System.out.println(line+"��� �亯�Ͽ���.");
		
		
	}
	

}
