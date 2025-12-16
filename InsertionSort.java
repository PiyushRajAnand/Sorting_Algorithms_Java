package SortingAlgorithms;
import java.util.Arrays;
class Insertion{
	public int arr[];
	public Insertion(int arr[]) {
		this.arr=arr;
	}
	public void sort() {
		for(int i=1;i<arr.length;i++) {
			int temp=arr[i];
			int j=i;
			while(j>0 && temp<arr[j-1]) {
				arr[j]=arr[j-1];
				j--;
			}
			arr[j]=temp;
		}
		print();
	}
	public void print() {
		System.out.println("Sorted using insertion sort:");
		System.out.print("Sorted array:");
		System.out.println(Arrays.toString(arr));
	}
}
public class InsertionSort {

	public static void main(String[] args) {
		int a[]= {8,2,9,1,3,5,4,7,6,10};
		Insertion s=new Insertion(a);
		s.sort();
	}
}
