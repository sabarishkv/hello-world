package Sampleprog;

public class sumprogram {
	  
	public void sum (int a, int b) //void is when you print value	
	{
		System.out.println(a+b);
	}
	public int sum(int a, int b, int c)
	
	{ 
		return(a+b+c);
			
	}
	public static void main(String[] args) {
		
		sumprogram obj=new sumprogram();
		obj.sum(100,200);
		int x=obj.sum(100, 200, 300);
		System.out.println(x);
		// TODO Auto-generated method stub

	}

}
