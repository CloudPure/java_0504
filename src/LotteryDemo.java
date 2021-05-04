
public class LotteryDemo {

	public static void main(String[] args) {
		// Math.random() => 0���� ũ�ų� ���� 1���� ���� ���� double ��ȯ

		// ���� �𸣴ϱ� [] �̰Ÿ� ��!
		int[] lotto = new int[6];
		for (int i = 0; i < lotto.length; i++) {
			// 1���� ũ�ų� ���� 45���� ���� ������ int ��ȯ
			int random = (int) (Math.random() * 45) + 1;
			boolean isExisted = false;

			// �ٽ��ڵ�
			for (int j = 0; j < i; j++) {
				if (random == lotto[j]) {
					isExisted = true;
					
					// break �� �޸� ū�ϳ�!
					break;
				}
			}
			if (isExisted) {
				// ex) i=2�ε� ���� �ö󰡸� i�� 3���� ���� �ȵ�!! ���� i=2�� ���� �� �־����� ������
				// �ߺ� �˻��ϰ� �ִµ� i=3����(��������) �Ѿ�� �Ǹ� i=2�� ���� ���� �� ������ �ִ�.
				i--;
			} else {
				lotto[i] = random;
			}

			
			  //for (int i = 0; i < lotto.length; i++) { 
				 System.out.print(lotto[i] + "\t"); }
			
		}
	}

