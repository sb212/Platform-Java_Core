package JavaAssignment_PartB;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TransformersOptimus {
	private static int x = 0;
	private static int y = 0;
	private static char[] Directions = new char[10];
	

	public static void main(String[] args) throws IOException {
		try { 
			BufferedReader rd = new BufferedReader (new InputStreamReader(System.in));
			System.out.println("Enter U R L or D");
			String moves = rd.readLine();
			Directions = moves.toCharArray();
			
			if (moves.length() > 10) {
				System.out.println("No more characters allowed");
				
			}
			if (moves.length() > 0 && moves.length() < 10) {
				for(char move : Directions) {
					if(move == 'u') {
						y += 1;
					}else if(move == 'r') {
						x += 1;
					}else if(move == 'd') {
						y -= 1;
					}else if(move == 'l') {
						x -= 1;
					}else {
						System.out.println("You have entered a wrong lettte");
					}
				}
			}
			System.out.println(x + "," + y);
			
		}catch (Exception e) {
			
		}
	}

}
