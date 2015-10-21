package kc.ac.kookmin.exception.transaction;

class Bank {
	private int balance = 1000;

	public void oneqTrade() {
		try {
			tradeWithA();
			try {
				tradeWithB();
				try {
					tradeWithC();
				} catch (Exception ex) {
					System.out.println("�ŷ��� ���� �߻�, ��ü ��� ");
					cancelA();
					cancelB();
					cancelC();
				}
			} catch (Exception ex) {
				System.out.println("�ŷ��� ���� �߻�, ��ü ��� ");
				cancelA();
				cancelB();
			}
		} catch (Exception ex) {
			System.out.println("�ŷ��� ���� �߻�, ��ü ��� ");
			cancelA();
		}
		System.out.println("�ܿ� �ݾ� : " + balance); // ���� �߻��� �ܿ��ݾ��� ó�� �ݾװ� ����
													// �ϰ�ʹ�.
	}

	public void tradeWithA() throws Exception { // ���⼭����ó�������ʰ�, �� �Լ��� �θ����� ���ܸ�
												// ó���Ѵٴ¶�
		int m = 100; // A���¿��� ����� �ݾ�

		System.out.println("A ���¿��� ��� - " + m);
		balance -= m;

		System.out.println("A���� �ŷ� ���� �߻�");
		cancelA();

	}

	public void tradeWithB() throws Exception {
		int m = 200;

		System.out.println("B ���¿��� ��� - " + m);
		balance -= m;

		System.out.println("B���� �ŷ� ���� �߻�");
		cancelB();
	}

	public void tradeWithC() throws Exception {
		int m = 300;
		System.out.println("C ���¿��� ��� - " + m);
		balance -= m;
		Exception ex = new Exception();
		throw ex;
	}

	public void cancelA() {
		System.out.println("A ���� �ŷ� ���  ");
		balance += 100;
	}

	public void cancelB() {
		System.out.println("B ���� �ŷ� ���  ");
		balance += 200;
	}

	public void cancelC() {
		System.out.println("C ���� �ŷ� ���  ");
		balance += 300;
	}
}

public class Test {
	public static void main(String args[]) {
		Bank b = new Bank();
		b.oneqTrade();
	}
}
