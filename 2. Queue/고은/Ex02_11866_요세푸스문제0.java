package _03_����.ť;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Ex02_11866_�似Ǫ������0 {

	public static void main(String[] args) throws Exception{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder buffer = new StringBuilder();
		StringTokenizer token = new StringTokenizer(reader.readLine());
		
		int N = Integer.parseInt(token.nextToken());
		int K = Integer.parseInt(token.nextToken());
		
		//1~N������ �����͸� ���� ���Ḯ��Ʈ
		LinkedList<Integer> list = new LinkedList<Integer>();
		
		for (int i = 1; i <= N; i++) {
			list.add(i);
		}
		
		//inner Loop���� �ӽ÷� ���� �迭��
		int[] tmp = new int[N];
		
		int pos = K - 1; //K��°�� ��ġ
		int m = 0;   //�ӽ� �迭�� �ε���
		
		//outer while���� �ƹ��� ���� ������ x������ ������.
		while (!list.isEmpty()) {
			
			//�����ִ� ������� ������ ���ƾ��ϴ� k���� �� ũ��
//			if (pos > list.size() - 1) {
//				for (int data : list) {
//					tmp[m] = data;
//					m++;
//				}
//				break;
//			}
			
			//inner while���� �ѹ����� ���� Ż���� ����� tmp�� ����
			for (int i = 0; pos < list.size(); i++) {
				tmp[m] = list.get(pos);
				m++;
				pos += K;
			}
			//�ѹ��� ���� �� ������ ����
			if (pos > list.size() - 1) pos -= list.size();
			removeAll(list, tmp, m); //Ż���� ����� ��� Ż����Ű��
		}
		
		//����ϱ�
		buffer.append("<");
		for (int i = 0; i < m; i++) {
			if (i == 0) {
				buffer.append(tmp[i]);
				continue;
			}
			buffer.append(", ");
			buffer.append(tmp[i]);
		}
		buffer.append(">");
		System.out.println(buffer);
		
	}

	private static void removeAll(LinkedList<Integer> list, int[] tmp, int length) {
		for (int i = 0; i < length; i++) {
			list.remove(new Integer(tmp[i]));
		}
	}

}
