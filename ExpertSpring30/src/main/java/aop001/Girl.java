package aop001;

public class Girl {
	public void runSomething() {
		System.out.println("����� ���� ���� ���� ����.");

		try {
			System.out.println("å�� ��� ���θ� �Ѵ�.");
		} catch (Exception e) {
			if (e.getMessage().equals("���� �ҳ�")) {
				System.out.println("119�� �Ű��Ѵ�.");
			}
		} finally {
			System.out.println("�ҵ��ϰ� �ܴ�.");
		}

		System.out.println("�ڹ��踦 �ᱸ�� ���� ������.");
	}

}
