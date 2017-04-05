import java.util.Scanner;

public class MergeSort {
	
	public static void main(String[] args ){
		Scanner cin = new Scanner (System.in);
		System.out.print("Enter The Size of Array : ");
		int n=cin.nextInt();
		int [] a= new int[n];
		System.out.println("Enter The Elements of Array : ");
		for(int i=0;i<n;i++)
			a[i]=cin.nextInt();
		
		sortMerge(a,n);
		System.out.printf("\nSorted Array : ");
		printArray(a,n);
	}
	
	static void sortMerge(int [] a,int n){
		if(n>1){
			int mid=n/2;
			int [] l= new int[mid];
			int [] r= new int[n-mid];
			
			for(int i=0;i<mid;i++)
				l[i]=a[i];
			for(int i=mid,j=0;i<n;i++,j++)
				r[j]=a[i];
			
			printArray(l,mid);
			printArray(r,n-mid);
			System.out.println();
			sortMerge(l,mid);
			sortMerge(r,n-mid);
			merge(l,r,a);
		}		
	}
	
	static void merge(int[] l,int[] r,int[] a){
		int nl=l.length;
		int nr=r.length; 
		int i=0,j=0,k=0;
		while(i<nl && j<nr){
			if(l[i]<=r[j]){
				a[k]=l[i];
				k++;
				i++;
			}
			else{
				a[k]=r[j];
				k++;
				j++;
			}
		}
		while(i<nl){
			a[k]=l[i];
			k++;
			i++;
		}
		while(j<nr){
			a[k]=r[j];
			k++;
			j++;
		}
	}
	
	static void printArray(int[] a, int n){
		for(int i=0;i<n;i++)
			System.out.printf("%d  ",a[i]);
		System.out.print("      ");		
	}
}
