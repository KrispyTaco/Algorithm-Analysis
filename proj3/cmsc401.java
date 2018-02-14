//Andy Huynh

import java.util.Scanner;

public class cmsc401 {
	
	public static void main(String[] args){
		
	int n, m, row, col;
	Scanner in = new Scanner(System.in);
	n = in.nextInt(); 
	m = in.nextInt();
	
	int numCities[] = new int[n];
	int highways[][] = new int[n][n];
	
	for(int i = 0; i < n-2; i++){
		int k = in.nextInt()-1;
		numCities[k] = in.nextInt();
		}
	
	for(int i = 0; i < m;i++){
		row = in.nextInt()-1;
		col = in.nextInt()-1;
		highways[row][col] = in.nextInt();
		highways[col][row] = highways[row][col];
		
		}
	
	int val[] = new int[n];
	Boolean mst[] = new Boolean[n];
	
	for(int i = 0; i < n; i++){
		val[i] = Integer.MAX_VALUE;
		mst[i] = false;
	}
	
	val[0] = 0;
	
	for(int i = 0; i < n-1; i++){
		row = minVal(val, mst, n);
		mst[row] = true;
	
	
	 for ( col = 0; col < highways.length; col++)
     {
         if(val[row] != Integer.MAX_VALUE && !mst[col] && highways[row][col] != 0)
         {
             if(val[col] > numCities[row] + val[row] + highways[row][col])
             {
                 val[col] = numCities[row] + val[row] + highways[row][col];
             	}
         	}
     	}
     }
	 System.out.println(val[1]);
  }
	
	static int minVal(int val[], Boolean mst[], int vertices){
		
		int minimum = Integer.MAX_VALUE, minimum_index = -1;
		
		for(int i = 0; i < vertices; i++)
			if(minimum > val[i] && mst[i] == false){
				minimum = val[i];
				minimum_index = i;
			}
		return minimum_index;
	}
	
}
