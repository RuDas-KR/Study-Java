class Point
{
	int x, y; // �� ���� �����ϴ� x, y ��ǥ
	void set(int x, int y)
	{
		this.x = x; this.y = y;
	}
	
	void showPoint()
	{ // ���� ��ǥ ���
		System.out.println("(" + x + "," + y + ")");
	}
}