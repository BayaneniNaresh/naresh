
public class lambda_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		arthematic add=(a,b)->a+b;
		System.out.println(add.operation(10,20));
		arthematic sub=(a,b)->a-b;
		System.out.println(sub.operation(20,10));
		arthematic mul=(a,b)->a*b;
		System.out.println(mul.operation(10,20));
		arthematic div=(a,b)->a/b;
		System.out.println(div.operation(20,10));
		
	}
	interface arthematic
	{
		int operation(int a,int b);
	}

}
