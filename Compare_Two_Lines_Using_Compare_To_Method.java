package Employee_Wages;

public class Compare_Two_Lines_Using_Compare_To_Method {
	public static void main(String[] args) {
		int x1 = (int) Math.floor(Math.random()*10);
		int x2 = (int) Math.floor(Math.random()*10);
@@ -19,13 +19,17 @@ public static void main(String[] args) {
    	System.out.println("point C is"+" "+"("+x_1 +","+y_1 +") "+ "point D is"+ "(" +x_2 +","+ y_2 +")");
    	double len2 =Math.sqrt(Math.pow(x_2-x_1,2)+Math.pow(y_2-y_1,2));
    	System.out.println("lenght of line CD "+ len2);
    	String str1 = Double.toString(len1);
    	String str2 = Double.toString(len2);
    	if(str1.equals(str2)) {
    		System.out.println("line AB and line CD are equal");
    	Double ab = new Double(len1);
    	Double cd = new Double(len2);
    	int compare=ab.compareTo(cd);
    	if(compare > 0) {
    		System.out.println("line AB is greater than line CD");
    	}
    	else if(compare < 0 ) {
    		System.out.println("line AB is less than line CD ");
    	}
    	else {
    		System.out.println("line AB and line CD  are not equal");
    		System.out.println("line AB equal to line CD");
    	}
    }

}
