package SortingAlgorithms;
import java.util.Arrays;
class merge2{
	public int a[];
	public int result[];
	public merge2(int a[]) {
		this.a=a;
		result=new int[a.length];
	}
	public void merge(int a[],int left,int mid,int right) {
		int i=left;
		int j=mid+1;
		int x=0;
		while(i<=mid && j<=right) {
			if(a[i]<a[j]) {
				result[x++]=a[i];
				i++;
			}else {
				result[x++]=a[j];
				j++;
			}
		}
		if(j>right) {
			for(int v=i;v<=mid;v++) {
				result[x++]=a[v];
			}
		}
		if(i>mid) {
			for(int v=j;v<=right;v++) {
				result[x++]=a[v];
			}
		}
//		This is main part 
		for(int y=left;y<=right;y++) {
			a[y]=result[y-left];
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
public class MergeSort2 {
	public static void main(String[] args) {
		int a[]= {30,90,80,10,40,60,20,50,70};
		merge2 q=new merge2(a);
		q.mergeSort(a, 0, a.length-1);
		q.print();
	}
}
