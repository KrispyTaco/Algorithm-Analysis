//Andy Huynh CSMC 401 08/30/2017
import java.util.Scanner;
import java.util.ArrayList;
public class cmsc401 {

	
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		ArrayList <Integer> lastTwo = new ArrayList <Integer>(); //array to store the product of the last two elements in each iteration
		int numLines = in.nextInt();							//numLines = the number of lines the program will have
		for(int i = 0; i < numLines; i++){
			int n = in.nextInt();								//the number of elements the array will have
			ArrayList<Integer> h = new ArrayList<Integer>(n);
			for(int j = 0; j < n; j++){
				int k;
				h.add(k = in.nextInt());
						}
			int lastOne = h.get(n-1);			//lastOne = the last element in the array
			int lastSecond = h.get(n-2);		//lastSecond = the second to last element in the array
			lastTwo.add((h.get(lastSecond-1)) * (h.get(lastOne-1)));
						}
		for(int l : lastTwo){				//goes through each element in the array lastTwo and prints them out one by one
			System.out.println(l);
			}
		}

	}
			

		
