public class TestBox {
	Integer i;
	int j;

	public static void main(String[] args){
		TestBox t = new TestBox();
		t.go();
	}

	public void go(){
		//j=i;
		System.out.println("j = "+j);
		System.out.println("i = "+i);
		String s =String.format("%x",42);
System.out.println(s);
	}
}
