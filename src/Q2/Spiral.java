package Q2;

import java.util.*;  

public class Spiral {
	
	public static void printPosition(int gridWidth, int currCol, int currRow) {
		int value = gridWidth*(currRow-1)+currCol;
		System.out.print(value + " ");
	}
	
	public static void makeSpiral() {
		char[] direction = {'u', 'l', 'd', 'r'};
	}
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String str= sc.next();
		int gridHeight = Character.getNumericValue(str.charAt(0));
		int gridWidth = Character.getNumericValue(str.charAt(1));
		int startCol = Character.getNumericValue(str.charAt(2));
		int startRow = Character.getNumericValue(str.charAt(3));
		HashMap<Integer, Boolean> grid = new HashMap<>();
	}
}
