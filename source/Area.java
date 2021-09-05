class Area {
	int calcArea(int height,int width) {
		System.out.println(height*width);
		return height*width;
	}
public static void main(String[] args){
		Area area=new Area();
		long t =42;
		int h = area.calcArea(4,20,1);
		System.out.println("Area a = "+h);
	}
	
}


