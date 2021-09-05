import java.lang.String;
class MyEx extends Exception { }

public class ExTestDrive {

	public static void main(String[] args){
//int length=args.length();
for(int i=0;i<args.length;i++){
		String test=args[i];
		try{
			System.out.print("t");
			doRisky(test);
			System.out.print("r");
			System.out.print("o");
			
		}catch(MyEx e){
			System.out.print("a");
		}finally{
			System.out.print("w");
			System.out.println("s");
		}
}


	}

	static void doRisky(String t) throws MyEx{
		System.out.print("h");
		if("yes".equals(t)){
			throw new MyEx();
		}

		

	}

}
