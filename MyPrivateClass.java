class A{
	private int a;

	public A(int b){
		System.out.println("Object under construction...");
 		a =b;
	}

	public int getValue(){
		return a;
	}
}

class MyPrivateClass {
	//private int a;

	

	public static void main(String[] args){
		A a = new A(8);
		System.out.println(a.getValue());
	}
}


