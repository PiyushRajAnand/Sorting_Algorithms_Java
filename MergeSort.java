package SortingAlgorithms;

import java.util.Arrays;

class Merge{
	public int a[];
	public Merge(int a[]) {
		this.a=a;
	}
	public void merge(int a[],int left,int middle,int right) {
		
		int leftTemp[]=new int[middle-left+2];
		int rightTemp[]=new int[right-middle+1];
		for(int i=0;i<=middle-left;i++) {
			leftTemp[i]=a[left+i];
		}
		for(int i=0;i<right-middle;i++) {
			rightTemp[i]=a[middle+i+1];
		}
		leftTemp[middle-left+1]=Integer.MAX_VALUE;
		rightTemp[right-middle]=Integer.MAX_VALUE;
		int g=0;int b=0;
		for(int k=left;k<=right;k++) {
			if(leftTemp[g]<rightTemp[b]) {
				a[k]=leftTemp[g];
				g++;
			}else {
				a[k]=rightTemp[b];
				b++;
			}
		}
	}
	public void mergeSort(int a[],int left,int right) {
		if(left<right) {
			int mid=(left+right)/2;
			mergeSort(a,left,mid);
			mergeSort(a,mid+1,right);
			merge(a,left,mid,right);
		}
	}
	public void print() {
		System.out.println(Arrays.toString(a));
	}
}
public class MergeSort {

	public static void main(String[] args) {
		int a[]= {30,90,80,10,40,60,20,50,70};
		Merge q=new Merge(a);
		q.mergeSort(a, 0, a.length-1);
		q.print();
	}
}
