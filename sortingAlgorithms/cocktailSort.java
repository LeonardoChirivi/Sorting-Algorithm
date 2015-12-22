package sortingAlgorithms;

import java.util.Arrays;

public class cocktailSort {

	public static void sort(int[] array) {
		
		boolean swapped;
		
		do {
			
			swapped = false;
			
			for( int i = 0; i <= array.length-2; i++ ){
				
				if( array[i] > array[i+1] ){
					
					array[i]   =  array[i]^array[i+1];
					array[i+1] =  array[i]^array[i+1];
					array[i]   =  array[i]^array[i+1];
					swapped = true;
					
				}
				
			}
			
			if(!swapped) {
				break;
			}
			
			swapped = false;
			
			for( int i = array.length-2; i >= 0; i-- ){
				
				if( array[i] > array[i+1] ){
					
					array[i]   =  array[i]^array[i+1];
					array[i+1] =  array[i]^array[i+1];
					array[i]   =  array[i]^array[i+1];
					swapped = true;
					
				}
				
			}
			
		} while (swapped);
		
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
