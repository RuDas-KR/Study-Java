import java.util.Scanner;

public class GameApp
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("���� ���� �� �����Դϴ�. ����, ����, �� �߿��� �Է��ϼ���");
		System.out.print("ö�� >> ");
		String a = s.next(); 
		
		System.out.print("���� >> ");
		String b = s.next(); 
		
		s.close();
		
		if(a.equals("����"))
		{ // ö���� ������ ���
			if(b.equals("����"))
			System.out.println("�����ϴ�.");
			
			else if(b.equals("����"))
			System.out.println("���� �̰���ϴ�.");
			
			else
			System.out.println("ö���� �̰���ϴ�.");
		}
		
		else if(a.equals("����")) 
		{ // ö���� ������ ���
			if(b.equals("����"))
			System.out.println("ö���� �̰���ϴ�.");
			
			else if(b.equals("����"))
			System.out.println("�����ϴ�.");
			
			else
			System.out.println("���� �̰���ϴ�.");
		}
		
		else
		{ // ö���� ���� ���
			if(b.equals("����"))
			System.out.println("���� �̰���ϴ�.");
			
			else if(b.equals("����"))
			System.out.println("ö���� �̰���ϴ�.");
			
			else
			System.out.println("�����ϴ�.");
		}
	}
}
