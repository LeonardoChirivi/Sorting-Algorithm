package sortingAlgorithms;

import java.util.Arrays;

public class quickSort {

	public static void sort(int[] array, int p, int r) {
		
		if( p < r ){
			
			int q = partition( array, p, r );
			sort( array, p, q-1 );
			sort( array, q+1, r );
			
		}
		
	}
	
	public static int partition( int[] array, int p, int r ) {
		
		int pivot = array[r];
		int wall = p-1;
		
		for( int i = p; i <= r-1; i++ ){
			
			if( array[i] <= pivot ){
				
				wall++;
				int tmp=array[wall];
				array[wall]=array[i];
				array[i]=tmp;
				
			}
			
		}
		
		int tmp = array[wall+1];
		array[wall+1] = array[r];
		array[r] = tmp;
		return wall+1;
		
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
