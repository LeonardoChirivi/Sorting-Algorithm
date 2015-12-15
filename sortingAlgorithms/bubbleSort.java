package sortingAlgorithms;

import java.util.Arrays;

public class bubbleSort {

	public static void sort(int[] array) {

		for( int i = array.length-1; i > 1; i-- ){		
			for( int j = 0; j < i; j++ ){

				if( array[j] > array[j+1] ){

					array[j] = array[j] + array[j+1];
					array[j+1] = array[j] - array[j+1];
					array[j] = array[j] - array[j+1];

				}

			}

		}

	}

	public static void main(String[] args) {

		int[] array = new int[(int) (Math.random() * 20)];

		for( int i = 0; i < array.length; i++ )
			array[i] = (int) (Math.random() * 20);

		System.out.println(Arrays.toString(array)+"\n");

		sort(array);

		System.out.println(Arrays.toString(array));

	}

}
