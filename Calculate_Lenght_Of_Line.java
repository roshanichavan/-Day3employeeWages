package Employee_Wages;

public class Calculate_Lenght_Of_Line {
	public static void main(String[] args) {
		int x1 = (int) Math.floor(Math.random()*10);
		int x2 = (int) Math.floor(Math.random()*10);
		int y1 = (int) Math.floor(Math.random()*10);
		int y2 = (int) Math.floor(Math.random()*10);
    	System.out.println("point A is"+" "+"("+x1 +","+y1 +")");
    	System.out.println("point B is"+" "+"("+x2 +","+y2 +")");
    	double len =Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
    	System.out.println("lenght of line AB "+ len);
    }
}

