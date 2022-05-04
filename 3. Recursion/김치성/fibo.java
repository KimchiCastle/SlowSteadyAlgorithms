package recursion;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class fibo {
	
	//���ʿ��� �ݺ��� ���̱� ���� �̹� ����� ���� ������ �迭 
	static long [] fibo_s;
	
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		
		
		//���� �� ���� 1ĭ �� ũ�� �迭 ����
		fibo_s = new long[N+1];
		
		
		//����Լ� ȣ��
		sb.append(fibo(N));
		
		System.out.println(sb);
	}

	private static long fibo(int n) {
		
		// base 
		if(n == 0) {
			return 0;
		}
		if(n == 1) {
			return 1;
		}
		//�̹� ���� ���� ������ �װ��� ��ȯ
		if(fibo_s[n] !=0) {
			return fibo_s[n];
		}
		
		//��������� ȣ��ɶ����� �迭�ε����� ���� �����
		fibo_s[n] = fibo(n-1) + fibo(n-2);
		
		return fibo_s[n];
		
	}

}
