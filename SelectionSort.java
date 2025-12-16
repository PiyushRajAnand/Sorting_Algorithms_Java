package SortingAlgorithms;
import java.util.Arrays;
class Selection{
	public int arr[];
	public Selection(int arr[]) {
		this.arr=arr;
	}
	public void sort() {
		for(int i=0;i<arr.length;i++) {
			int min=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[min]>arr[j]) {
					min=j;
				}
			}
			if(min!=i) {
				int temp=arr[min];
				arr[min]=arr[i];
				arr[i]=temp;
			}
		}
		print();
	}
	public void print() {
		System.out.println("Sorted using selection sort:");
		System.out.print("Sorted array:");
		System.out.println(Arrays.toString(arr));
	}
}
public class SelectionSort {
	public static void main(String[] args) {
		int a[]= {8,2,9,1,3,5,4,7,6,10};
		Selection s=new Selection(a);
		s.sort();
	}
}
