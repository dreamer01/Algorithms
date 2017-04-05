import java.util.Scanner;

public class QuickSort {
	public static void main(String[] args ){
		Scanner cin = new Scanner (System.in);
		System.out.print("Enter The Size of Array : ");
		int n=cin.nextInt();
		int [] a= new int[n];
		System.out.println("Enter The Elements of Array : ");
		for(int i=0;i<n;i++)
			a[i]=cin.nextInt();
		
		sortQuick(a,0,n-1);
		System.out.printf("\nSorted Array : ");
		printArray(a,n);
	}
	
	static void sortQuick(int [] a,int start , int end){
		if(start<end){
			int pivotIndex = partition(a,start,end);
			sortQuick(a,start,pivotIndex-1);
			sortQuick(a,pivotIndex+1,end);
		}		
	}
	
	static int partition(int [] a, int start,int end ){
		int pivotIndex=start,temp;
		int pivot=a[end];
		
		for(int i=start;i<end;i++){		//finding pivot index
			if(a[i]<=pivot){
				temp=a[i];
				a[i]=a[pivotIndex];
				a[pivotIndex]=temp;
				pivotIndex++;
			}
		}		
		temp=a[end];		//setting pivot at its index
		a[end]=a[pivotIndex];
		a[pivotIndex]=temp;
		
		return pivotIndex;
	}
	
	static void printArray(int[] a, int n){
		for(int i=0;i<n;i++)
			System.out.printf("%d  ",a[i]);
		System.out.println();
	}
	
}
