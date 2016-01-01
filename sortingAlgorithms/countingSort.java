package sortingAlgorithms;

import java.util.Arrays;

public class countingSort {

	public static void sort(int[] array) {
		
		int min = array[0], max = array[0];
		
		for( int i = 1; i < array.length;i++ ){
			
			if( array[i] > max ){
				
				max = array[i];
				
			} else if( array[i] < min ) {
				
				min = array[i];
				
			}
			
		}
		
		int[] tmp = new int[ max - min + 1 ];
		
		for( int i = 0; i < array.length; i++ )
			tmp[ array[i] -min ] = tmp[ array[i] - min ]+1;
		
		int k = 0;
		
		for( int i = 0; i < tmp.length; i++ ){
			
			while( tmp[i] > 0 ){
				
				array[k] = i+min;
				k++;
				tmp[i]--;
				
			}
			
		}
		
	}
	
	public static void main(String[] args) {
		
		int[] array = new int[(int) (Math.random() * (20-1)+1)];

		for( int i = 0; i < array.length; i++ )
			array[i] = (int) (Math.random() * 20);

		System.out.println(Arrays.toString(array)+"\n");
		
		sort(array);
		
		System.out.println(Arrays.toString(array));

		
	}
	
}
