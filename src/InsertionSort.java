 import java.util.Scanner;

public class InsertionSort {
	public static void main(String[] args ){
		Scanner cin = new Scanner (System.in);
		System.out.print("Enter The Size of Array : ");
		int n=cin.nextInt();
		int [] a= new int[n];
		System.out.println("Enter The Elements of Array : ");
		for(int i=0;i<n;i++)
			a[i]=cin.nextInt();
		
		sortInsertion(a,n);
		System.out.printf("\nSorted Array : ");
		printArray(a,n);
	}
	
	static void sortInsertion(int [] a,int n){
		int i,j,pos,item;
		for(i=1;i<n;i++){
			pos=i;
			item=a[i];
			while(pos>0 && item < a[pos-1]){
				a[pos]=a[pos-1];
				pos=pos-1;
			}
			a[pos]=item;
			printArray(a,n);
		}
	}
	
	static void printArray(int[] a, int n){
		for(int i=0;i<n;i++)
			System.out.printf("%d  ",a[i]);
		System.out.println();
	}
	
}
