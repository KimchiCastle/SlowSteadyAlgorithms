package _02_�����ϱ�;

import java.util.Arrays;
import java.util.Scanner;

public class Ex01_18258_ť2_��ü�̻��_BufferdReader {
	public static void main(String[] args) throws Exception{
		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt();
		
		int[] queue = new int[N];
		Arrays.fill(queue, -1);
		
		String input;
		int firstCursor = 0; //���� �ƹ��͵� �� �� ����
		int lastCursor = 0;  //���� �ƹ��͵� �� �� ����
		int size = 0;
		
		int k = N;
		while (k > 0) {
			input = scanner.next();
			
			//������ ��ɾ ���� ó��
			if (input.equals("push")) {
				
				int data = scanner.nextInt();
				
				if (queue[firstCursor] != -1) { //ù��° ��ġ�� �̹� ��Ұ� ��������
					lastCursor = lastCursor+1;
				}
				queue[lastCursor] = data;
				
			}else if (input.equals("pop")) {
				
				if (firstCursor == 0 && queue[firstCursor] == -1) { //�ƹ� ��ҵ� ���� ��� = ù��� ����
					System.out.println(-1);
					continue;
				}
				System.out.println(queue[firstCursor]); //��� �б�
				queue[firstCursor] = -1; //��� ����
				
				//ù��° ��� �ε��� ����
				if (firstCursor != lastCursor) {
					firstCursor++;
				}
				
			}else if (input.equals("size")) {
				
				System.out.println(size);
				
			}else if (input.equals("empty")) {
				
				if (size == 0) {
					System.out.println(1);
				}else {
					System.out.println(0);
				}
				
			}else if (input.equals("front")) {
				
				System.out.println(queue[firstCursor]);
				
			}else if (input.equals("back")) {
				
				System.out.println(queue[lastCursor]);
				
			}
			
			//����� �˷��ִ� if��
			if (firstCursor == lastCursor && queue[firstCursor] == -1){
				size = 0;
			}else {
				size = (lastCursor - firstCursor) + 1;
			}
			
			k--;
		}
		
		scanner.close();
		
	}	
}
