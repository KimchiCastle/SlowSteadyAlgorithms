package _03_����.ť;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Ex03_1966_������ť {

	public static void main(String[] args) throws Exception{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer token;
		StringBuilder buffer = new StringBuilder();
		
		//�μ� ��û ������ ���� �߿䵵(data) ��� �� : LinkedList
		LinkedList<Integer> printList;
		
		int caseNum = Integer.parseInt(reader.readLine()); //���̽� ��
		int N;//������ ����
		int M;//ã������ ��������
		int data = -1; //ã������ ����
		int thNum = 0;
		
		while (caseNum > 0) {
			//int[] request�� ��û���� ������ ������� �Է�
			
			//�Է� ù��°�� : ������ ���� N, ã������ ������ ���� M
			token = new StringTokenizer(reader.readLine());
			N = Integer.parseInt(token.nextToken()); //�������� �ʱ�ȭ
			M = Integer.parseInt(token.nextToken()); //ã������ ��¼��� �ʱ�ȭ
			
			//�Է� �ι�° �� : (�켱����) �Է°��� �ϳ��� �迭�� list�� ����
			token = new StringTokenizer(reader.readLine());
			request = new int[N];
			printList = new LinkedList<Integer>();
			
			for (int i = 0; i < N; i++) {
				int tmp = Integer.parseInt(token.nextToken());
				request[i] = tmp;
				printList.add(tmp);

				if (i == M) { //������ M�� ���, data�� �ʱ�ȭ
					data = tmp;
				}
			}
			
			//ó�� : 
			//(1) ����
			
			
			//(2) int[] request�� M��° �����Ͱ� LinkedList�� ���°���� ã�´�.
			buffer.append(fintElement(printList,data));
			if (caseNum != 1) {
				buffer.append("\n");
			}
			
			caseNum--;
			
		}//end while
		
		System.out.println(buffer);
		
	}

	///////////
	private static int fintElement(LinkedList<Integer> printList, int data) {
		
		for (int i = 0; i < printList.size(); i++) {
			
			if (printList.get(i) == data) {
				
				//////
				
				return i + 1;
			}
		}
		
		return -1; //������ ���� ��� Ȯ�ο� -1
	}



}
