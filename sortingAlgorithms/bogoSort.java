package sortingAlgorithms;

/**
 * 
 * Very inefficient algorithm, Θ(n * n!) complexity.
 * Be careful!
 * 
 */

import java.util.Arrays;

public class bogoSort {

	public static void sort(int[] array) {
		
		while( !isSorted(array) )
			shuffle(array);

	}
	
	public static void shuffle(int[] array) {
		
		int length = array.length;
		
		for( int i = 0; i < length-1; i++ ){
			
			int randomElement = (int) ( Math.random() * length );

			if (randomElement != i) {
				
				array[i] = array[i] ^ array[randomElement];
				array[randomElement] = array[i] ^ array[randomElement];
				array[i] = array[i] ^ array[randomElement];
				
			}
			
		}
		
	}
	
	public static boolean isSorted(int[] array) {
		
		boolean sorted = true;
		
		for( int i = 0; i < array.length-1; i++ ){
			
			if( array[i] > array[i+1] ){
				
				sorted = false;
				break;
				
			}
			
		}
		
		return sorted;
		
	}
	
	public static void main(String[] args) {
		
		int[] array = new int[4];
		
		for( int i = 0; i < array.length; i++)
			array[i] = (int) ( Math.random() * 20 );
		
		System.out.println(Arrays.toString(array)+"\n");
		
		sort(array);
		
		System.out.println(Arrays.toString(array));
		
	}
	
}
