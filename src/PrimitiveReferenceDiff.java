public class PrimitiveReferenceDiff {

	public static void main(String[] args) {
		int a = 10;
		// primitive ������ �Ҵ��ϸ� ���� �Ҵ��
		int b = a;
		b = 30;
		System.out.println(a);
		System.out.println(b);
		
		int [] test = {10,20,30,40};
		// reference ������ �Ҵ��ϸ� ���� ��ü�� ������
		int[] temp = test;
		
		System.out.printf("test[0] : %d, temp[0] : %d%n", test[0], temp[0]);
		System.out.printf("test[1] : %d, temp[1] : %d%n", test[1], temp[1]);
		
		temp[2] = 3000;
		
		System.out.printf("test[2] : %d, temp[2] : %d%n", test[2], temp[2]);
		
		System.out.println(temp);
		System.out.println(test);
	}
}