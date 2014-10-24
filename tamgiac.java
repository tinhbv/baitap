package tamgiac;

public class tamgiac {
	private int a ;
	private int	b ;
	private int	c ;
	public tamgiac(int a,int b, int c)
	{
		this.a = a;
		this.b = b;
		this.c = c;
	}
	public int  kiemtra(int a,int b,int c)
	{
		if(( a + b <= c )||( a +c <= b )||( b + c <= a ))//khong la tam giac
		{
			return 0 ;
		}
		else if(( a == b )&&( b == c ))//tam giac deu
		{
			return 1 ;
		}
		else if(( a == b )||( b == c )||( c == a))//tam giac can
		{
			return 2 ;
		}
		else 
			return 3 ;//tam giac thuong
	}
}
