package sortingAlgorithms;

import java.util.Arrays;

public class heapSort {
	
	public static int size;
	public static int[] array;
	public static int right;
	public static int left;
	public static int max;
    
	public static void swap(int i, int max) {
		
//		xor swap trick
		array[i] = array[i]^array[max];
		array[max] = array[i]^array[max];
		array[i] = array[i]^array[max];
		
	} 	

	public static void buildMaxHeap(int[] array) {
		
		size = array.length-1;
		
		for( int i = size/2; i >=0; i-- ){
			maxHeapify(array, i);
		}
		
	}
	
	public static void maxHeapify(int[] array, int i) {
		
		 left =  2*i;
		 right = 2*i+1;
		
		if( left <= size && array[left] > array[i] ){
			
			max = left;
			
		} else max=i;
		
		if( right <= size && array[right] > array[max] ){
			
			max = right;
		}
		
		if(max != i){
			
			swap(i, max);
			maxHeapify(array, max);
			
		}
		
	}
	
	public static void sort(int[] array2) {
		
		array = array2;
		buildMaxHeap(array);
		
		for(int i = size; i > 0; i--){
			
			swap(0, i);
			size--;
			maxHeapify(array, 0);
		}
		 
	}
	
	public static void main(String[] args) {

		int[] array1 = new int[(int) (Math.random() * (20-1)+1)];

		for( int i = 0; i < array1.length; i++ )
			array1[i] = (int) (Math.random() * 20);
	
		System.out.println(Arrays.toString(array1)+"\n");

		sort(array1);
		
		System.out.println(Arrays.toString(array1));
		
		
	}

}
