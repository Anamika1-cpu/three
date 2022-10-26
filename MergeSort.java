// merge sort using recursion in java

import java.util.*;
public class MergeSort {
	
	public static int[] input() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		return arr;
	}
	
	public static void merge(int[] arr1, int[] arr2, int[] output) {
		int i=0, j=0, k=0;
		
		while(i<arr1.length && j<arr2.length) {
			if(arr1[i] < arr2[j]) {
				output[k] = arr1[i];
				k++;
				i++;
			}
			else {
				output[k] = arr2[j];
				k++;
				j++;
			}
		}
		while(i<arr1.length) {
			output[k] = arr1[i];
			k++;
			i++;
		}
		while(j<arr2.length) {
			output[k] = arr2[j];
			k++;
			j++;
		}
	}
	
	public static void sort(int[] arr) {
		if(arr.length <= 1) {
			return;
		}
		int mid = arr.length/2;
		int[] part1 = new int[mid];
		int[] part2 = new int[arr.length-mid];
		for(int i=0; i<mid; i++) {
			part1[i] = arr[i];
		}
		int k=0;
		for(int i=mid; i<arr.length; i++) {
			part2[k] = arr[i];
			k++;
		}
		sort(part1);
		sort(part2);
		merge(part1, part2, arr);
	}
	
	public static void print(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {
		 int[] nums = input();
		 sort(nums);
		 print(nums);
	}

}