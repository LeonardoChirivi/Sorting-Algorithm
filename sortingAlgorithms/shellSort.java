package sortingAlgorithms;

import java.util.Arrays;

public class shellSort {

    public static void sort(int[] array) {
		
    	for( int gap = array.length/2; gap > 0; gap /= 2 ){
    		
    		for( int i = gap; i < array.length; i++ ){
    			
    			for( int j = i-gap; j >= 0; j -= gap ){
    				
    				if( array[j+gap] >= array[j] )
    					break;
    				
    				else {
    					
    					array[j]   = array[j] ^ array[j+1];
    					array[j+1] = array[j] ^ array[j+1];
    					array[j]   = array[j] ^ array[j+1];
    					
    				}
    				
    			}
    			
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
