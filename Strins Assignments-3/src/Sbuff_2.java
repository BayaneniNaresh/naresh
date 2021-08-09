public class Sbuff_2 {
	public static void main(String args[])
	{
		StringBuffer sb=new StringBuffer("It is used to _ at the specified index position.");
		sb.replace(14,15, "insert text");
		System.out.println(sb);
	}
}