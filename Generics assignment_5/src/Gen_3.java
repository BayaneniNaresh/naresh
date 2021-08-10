class Gen1_3<T> {
	private T[] arr;
	public T[] getArr()
	{
		return arr;
	}

	public void setArr(T[] arr) 
	{
		this.arr = arr;
	}

	public Gen1_3(T[] arr)
	{
		super();
		this.arr = arr;
	}
	public <E> void Exchange(E[] arr) {
		System.out.println("Before Exchange : "+arr[0]+" "+arr[1]);
		E temp=(E) arr[0];
		arr[0]=arr[1];
		arr[1]=temp;
		System.out.println("After  Exchange : "+arr[0]+" "+arr[1]);
	}
}
class Gen_3{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer arr[]= {20,30};
		Gen1_3<Integer> g=new Gen1_3<Integer>(arr);
		g.Exchange(arr);
	}

}
