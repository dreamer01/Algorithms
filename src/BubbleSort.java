import java.util.*;

public class BubbleSort {
	public static void main(String[] args ){
		Scanner cin = new Scanner (System.in);
		System.out.print("Enter The Size of Array : ");
		int n=cin.nextInt();
		int [] a= new int[n];
		System.out.println("Enter The Elements of Array : ");
		for(int i=0;i<n;i++)
			a[i]=cin.nextInt();
		
		sortBubble(a,n);
		System.out.printf("\nSorted Array : ");
		printArray(a,n);
	}
	
	static void sortBubble(int [] a,int n){
		int i,j,temp;
		for(i=0;i<n-1;i++){
			for(j=0;j<n-1;j++){
				if(a[j]>a[j+1]){
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
			printArray(a,n);
		}
	}
	
	static void printArray(int[] a, int n){
		for(int i=0;i<n;i++)
			System.out.printf("%d  ",a[i]);
		System.out.println();
	}
	
}
