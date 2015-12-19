package sortingAlgorithms;

import java.util.Arrays;

public class mergeSort { 
	
	public static void sort(int[] array, int low, int high) {
		
		if( low < high ){
			
			int middle = ( low + high ) / 2;
			
			sort( array, low, middle );
			sort( array, middle+1, high );
			merge( array, low, middle, high );
			
		}
		
	}

	public static void merge(int[] array, int low, int middle, int high) {
		
		int size = array.length;
		int[] tmp = new int[size];
		
		for(int i = low; i <= high; i++) tmp[i] = array[i];
		
		int i = low;
        int j = middle + 1;
        int k = low;
        
		while( i <= middle && j <= high ){
			
			if( tmp[i] <= tmp[j] ){
				
				array[k] = tmp[i];
				i++;
				
			} else {
				
				array[k] = tmp[j];
				j++;
				
			}
			
			k++;
			
		}
        
		while(i <= middle){
			
			array[k] = tmp[i];
			k++;
			i++;
			
		}
		
	}

	public static void main(String[] args) {
		
		int[] array = new int[(int) (Math.random() * (20-1)+1)];
		for( int i = 0; i < array.length; i++ )
			array[i] = (int) (Math.random() * 20);

		
		System.out.println(Arrays.toString(array)+"\n");

		sort(array, 0, array.length-1);
		
		System.out.println(Arrays.toString(array));
		
	}
	
}
