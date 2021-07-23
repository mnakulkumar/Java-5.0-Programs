import java.io.* ;
import java.util.*;

public class GameHelper{
	private static final String alphabet = "abcdefg";
	private int gridLength=7;
	private  int gridSize=49;
	private int []grid =new int[gridSize];
	private int comCount =0;

	public String getUserInput(String prompt){
		String inputLine= null;
		System.out.print(prompt +" ");
		try {
			BufferedReader is= new BufferedReader (new InputStreamReader(System.in));
			inputLine = is.readLine();
			if (inputLine.length () == 0) return null;
		} catch (IOException e) {
		System.out.println("IOException: " + e);
		}
		return inputLine.toLowerCase();
	}

	public ArrayList<String> placeDotCom(int comSize) {
		ArrayList<String> alphaCells=new ArrayList<String>();
		String[] alphacoords=new String[comSize];
		String temp=null;
		int[] coords=new int[comSize];
		int attempts=0;
		boolean success=false;
		int location=0;

		comCount++;
		int incr=1;
		if((comCount %2)==1){
			incr=gridLength;System.out.print("odd com");
		}

		while(!success & attempts++ < 200){System.out.print(" main while" + "success= "+success);
			location =(int) (Math.random() *gridSize);
			System.out.print(" try " + location);
			int x=0;
			success =true;
			while(success && x < comSize) {System.out.print(" nested while");
				if (grid[location]==0) {
					coords[x++]=location;
					location += incr;			System.out.println(" location : " + location);
					if(location>=gridSize){
						success=false;			System.out.println(" location > gridzize " );
					}
					if(x>0 && (location % gridLength== 0)){
						success=false;			System.out.print(" inside nested if");
					}
				}else {
					System.out.print(" used " + location);
				success=false;
				}
			}
		}

		int x=0;
		int row=0;
		int column=0;
		System.out.println("\n");
		while(x<comSize){
			grid[coords[x]]=1;
			row=(int)(coords[x]/gridLength);
			column=coords[x]%gridLength;			System.out.print("\n row : "+row+" \ncolumn : "+column +"\n");
			temp=String.valueOf(alphabet.charAt(column));

			alphaCells.add(temp.concat(Integer.toString(row)));
			x++;
			System.out.print(" coord "+x+" = " + alphaCells.get(x-1));
		}
		System.out.println("\n");
		return alphaCells;
	
	}


}
