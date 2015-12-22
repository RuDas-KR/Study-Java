import java.util.Scanner;

class Goodss
{
	private String name;
	private int price;
	private int numberOfStock;
	private int sold;

	Goodss(String name, int price, int numberOfStock, int sold)
	{
		this.name = name;
		this.price = price;
		this.numberOfStock = numberOfStock;
		this.sold = sold;
	}

	String getName() {return name;}
	int getPrice() {return price;}
	int getnumberOfStock() {return numberOfStock;}
	int getSold() {return sold;}
}

public class GoodsArray
{	
	@SuppressWarnings("resource")
	public static void main(String[] args)
	{
		Goodss [] goodsArray;
		goodsArray = new Goodss [3];

		Scanner s = new Scanner(System.in);
		
		for(int i=0; i<goodsArray.length; i++)
		{
			String name = s.next();
			int price = s.nextInt();
			int n = s.nextInt();
			int sold = s.nextInt();
			goodsArray[i] = new Goodss(name, price, n, sold);
		}
		
		for(int i=0; i<goodsArray.length; i++)
		{
			System.out.print(goodsArray[i].getName()+" ");
			System.out.print(goodsArray[i].getPrice()+" ");
			System.out.print(goodsArray[i].getnumberOfStock()+" ");
			System.out.println(goodsArray[i].getSold());
		}
	}
}