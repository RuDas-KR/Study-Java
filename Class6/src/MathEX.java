
public class MathEX
{
	public static void main(String[] args)
	{
		double a = -2.78987434;
		// ���밪 ���ϱ�
		System.out.println(Math.abs(a));
		System.out.println(Math.ceil(a)); // ceil
		System.out.println(Math.floor(a)); // floor
		System.out.println(Math.sqrt(9.0)); // ������
		System.out.println(Math.exp(1.5)); // exp
		System.out.println(Math.rint(3.141592)); // rint
		// [1,45] ������ ���� �߻�
		System.out.print("�̹��� ����� ��ȣ�� ");
		for (int i=0; i<5; i++)
		System.out.print(Math.round(1 + Math.random() * 44) + " ");
		System.out.println("�Դϴ�.");
	}
}