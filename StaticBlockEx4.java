public class StaticBlockEx4{
	int x=90;
	static int y=90;
	public static void main(String[] args) {
		System.out.println(y);//allowed
		//System.out.println(x);//error
		StaticBlockEx4	 s=new StaticBlockEx4();
		System.out.println(s.x);
	}
}
