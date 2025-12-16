package SortingAlgorithms;
import java.util.Arrays;
class Bubble{
	public int arr[];
	public Bubble(int arr[]) {
		this.arr=arr;
	}
	public void sort() {
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		printArray();
	}
	public void printArray() {
		System.out.println("Sorted using bubble sort");
		System.out.print("Sorted array:");
		System.out.println(Arrays.toString(arr));
	}
}
public class bubbleSort {

	public static void main(String[] args) {
		int a[]= {8,2,9,1,3,5,4,7,6,10};
	    Bubble bs=new Bubble(a);
	    bs.sort();
	}
}
