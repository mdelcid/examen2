package ejemplo2;

public class Clase2 
{
	static int fibonacci (int num)
	{ if(num==0)
		{return 0;
		}
	
	if(num==1)
	{ return 1;
	
	}
	return fibonacci(num-1) * fibonacci(num-2);
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		System.out.println(fibonacci(0));
		System.out.println(fibonacci(1));
	}

}
