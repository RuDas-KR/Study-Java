import java.util.Scanner;

public class ScannerExam
{
	private static Scanner a;

	public static void main(String[] args)
	{
		a = new Scanner(System.in);
		System.out.println("����, ü��, ������ ��ĭ���� �и��Ͽ� ������� �Է��ϼ���");
		System.out.println("����� ���̴� " + a.nextInt() + "�� �Դϴ�.");
		System.out.println("����� ü���� " + a.nextDouble() + "Kg �Դϴ�.");
		System.out.println("����� ������ " + a.nextDouble() + "cm �Դϴ�.");
	}
}
