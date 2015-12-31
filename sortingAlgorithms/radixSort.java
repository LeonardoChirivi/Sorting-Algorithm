package sortingAlgorithms;

import java.util.Arrays;

public class radixSort {

	public static void sort(int[] array) {
		
		int[] tmpArray = new int[array.length];
		int radix = 1;
		int maxNumber = max(array);
		
		while( maxNumber/radix > 0 ){
			
			int[] bucket = new int[10];
			
			for( int i = 0; i < array.length; i++ )
				bucket[ ( array[i]/radix ) % 10 ]++;
			
			for( int i = 1; i < 10; i++ )
				bucket[i] += bucket[i-1];
			
			for( int i = array.length-1; i >= 0; i-- )
				tmpArray[ --bucket[(array[i] / radix) % 10] ] = array[i];
			
			for( int i = 0; i < array.length; i++ )
				array[i] = tmpArray[i];
			
			radix *= 10;
			
		}
		
	}
	
	public static int max(int[] array) {
		
		int m = array[0];
		
		for( int item : array )
			m = (item > m) ? item : m;
		
		return m;
		
	}
	
	public static void main(String[] args) {
		
		int[] array = new int[(int) (Math.random() * (20-1)+1)];

		for( int i = 0; i < array.length; i++ )
			array[i] = (int) (Math.random() * 2000);

		System.out.println(Arrays.toString(array)+"\n");
	
		sort(array);
		
		System.out.println(Arrays.toString(array));
		
	}
	
}
