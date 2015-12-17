package sortingAlgorithms;

import java.util.Arrays;

public class insertionSort {

	public static void sort(int[] array) {
		
		for( int i = 1; i < array.length; i++ ){
			
			int key = array[i];
			int j = i-1;
			
			while( j >= 0 && array[j] > key ){
				
				array[j+1] = array[j];
				j--;
				
			}
			
			array[j+1] = key;
			
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
