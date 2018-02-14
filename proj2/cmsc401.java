// Andy Huynh

import java.util.Scanner;
import java.util.Arrays;
public class cmsc401 {

	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int N = in.nextInt();
	int input[] = new int [N];
	int L = in.nextInt();
	int total = 0;
	int previous = 0;
	int count[] = new int [2*L+1];
	int output[] = new int [N];
	for(int i = 0; i < N; i++){
		input[i] = in.nextInt();
	
	}

	for(int i = 0; i < N; i++){
		count[input[i]+ L]++;
	}
	for(int i = 0; i < (2 * L+1); i++){
		previous = count[i];
		count[i] = total;
		total += previous;
		
	}
	for(int i = 0; i < N; i++){
			output[count[(input[i] + L)]] = input[i];
			count[input[i] + L]++;
	
	}
	for(int l : output){
		System.out.println(l);
	

	}
	}
}


