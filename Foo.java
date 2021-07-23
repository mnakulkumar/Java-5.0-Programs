public class Foo{
	static int x;

	public void go() {
		System.out.println(x);
		double r1 =(Math.random()*5);
System.out.println(r1);
double r2 =  (Math.random()*5);
System.out.println(r2);
System.out.println((int)(r2));
	}

public static void main(String[] args){
Foo f=new Foo();
f.go();
}
}
