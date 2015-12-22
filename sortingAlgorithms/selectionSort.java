package sortingAlgorithms;

import java.util.Arrays;

public class selectionSort {

	public static void sort(int array[]) {

		for( int i = array.length-1; i >= 1; i-- ){

			int max = i;

			for( int j = 0; j < i; j++ ){

				if( array[j] > array[max] )
					max = j;			

			}
			
			if(max != i){
				
				array[i] = array[i] + array[max];
				array[max] = array[i] - array[max];
				array[i] = array[i] - array[max];

			}
			
		}

	}

	public static void main(String[] args) {

		int[] array = new int[(int) (Math.random() * (20-1)+1)];

		for( int i = 0; i < array.length; i++ )
			array[i] = (int) (Math.random() * 20);

		System.out.println(Arrays.toString(array));

		sort(array);

		System.out.println(Arrays.toString(array));

	}

}
