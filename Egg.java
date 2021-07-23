import java.util.ArrayList;
class Egg {
	private String color;

	public void setColor(String color){
		this.color=color;
	}

	public String getColor(){
		return  color;
	}
	public static void main(String[] args){
		Egg egg =new Egg();
		Egg e=new Egg();
		e.setColor("Brown");
		egg.setColor("White");

		ArrayList<Egg> myList = new ArrayList<Egg>();
		myList.add(egg);
		myList.add(e);
		for(Egg eg:myList){
		

		 System.out.println(eg.getColor());
		}
		System.out.println(myList.size());
		boolean isIn = myList.contains(e);
		System.out.println(isIn);
		int idx = myList.indexOf(egg);
		System.out.println(idx);	
		boolean empty = myList.isEmpty();
		System.out.println(empty);
myList.remove(egg);
idx = myList.indexOf(e);
		System.out.println(idx);	
	}
}
