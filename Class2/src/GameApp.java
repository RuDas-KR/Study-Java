import java.util.Scanner;

public class GameApp
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("가위 바위 보 게임입니다. 가위, 바위, 보 중에서 입력하세요");
		System.out.print("철수 >> ");
		String a = s.next(); 
		
		System.out.print("영희 >> ");
		String b = s.next(); 
		
		s.close();
		
		if(a.equals("가위"))
		{ // 철수가 가위인 경우
			if(b.equals("가위"))
			System.out.println("비겼습니다.");
			
			else if(b.equals("바위"))
			System.out.println("영희가 이겼습니다.");
			
			else
			System.out.println("철수가 이겼습니다.");
		}
		
		else if(a.equals("바위")) 
		{ // 철수가 바위인 경우
			if(b.equals("가위"))
			System.out.println("철수가 이겼습니다.");
			
			else if(b.equals("바위"))
			System.out.println("비겼습니다.");
			
			else
			System.out.println("영희가 이겼습니다.");
		}
		
		else
		{ // 철수가 보인 경우
			if(b.equals("가위"))
			System.out.println("영희가 이겼습니다.");
			
			else if(b.equals("바위"))
			System.out.println("철수가 이겼습니다.");
			
			else
			System.out.println("비겼습니다.");
		}
	}
}
