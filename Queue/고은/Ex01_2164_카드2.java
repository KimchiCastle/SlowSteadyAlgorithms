package _03_����.ť;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class Ex01_2164_ī��2 {

	public static void main(String[] args) throws Exception{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(reader.readLine());
		
		LinkedList<Integer> list = new LinkedList<Integer>();
		
	    //������� 1~N�� �Է�
		for (int i = 1; i <= N; i++) {
			list.offer(i);
		}
		
		//������, ������ ������ �� �ݺ�
		while (list.size() != 1) {			
			list.poll(); //ù��°�� ���� ���� ������.
			list.offer(list.poll()); //�ι�°�� ���� ���� ���� �������� �ִ´�.
		}
		System.out.println(list.peek());
		
	}

}
