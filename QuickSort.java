package SortingAlgorithms;

import java.util.Arrays;

class Quick{
//	here in quick sort we divide on basic of pivot calling partition method
	public int partition(int arr[],int start,int end) {
//		REMEMBER this 
		int pivot=end;
		int i=start-1;
		for(int j=start;j<=end;j++) {
			if(arr[j]<=arr[pivot]) {
				i++;
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		return i;
	}
//	this is main method where divide and conquer is executed
	public void quickSort(int arr[],int left,int right) {
		if(left<right) {
			int pivot=partition(arr,left,right-1);
			quickSort(arr,left,pivot);
			quickSort(arr,pivot+1,right);
		}
		System.out.println("Sorted using Quick sort:");
		System.out.print("Sorted array:");
		System.out.println(Arrays.toString(arr));
	}
}
public class QuickSort {
	public static void main(String[] args) {
		int a[]= {30,90,80,10,40,60,20,50,70};
		Quick q=new Quick();
		q.quickSort(a, 0, a.length);
	}
}
