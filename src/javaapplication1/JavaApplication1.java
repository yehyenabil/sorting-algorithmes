
package javaapplication1;

import java.util.Scanner;

public class JavaApplication1 {
public static void SelectionSort(int arr[]){
int n = arr.length; 
        for (int i = 0; i < n-1; i++) 
        { 
         int smallest  = i; 
            for (int j = i+1; j < n; j++) 
                if (arr[j] < arr[smallest ]) 
                    smallest  = j; 
            int temp = arr[smallest ]; 
            arr[smallest ] = arr[i]; 
            arr[i] = temp; 
        } 
}
public static void insertionsort(int arr[]){    
    for(int i=1;i<arr.length-1;i++){
      int key=arr[i];
        int hole=i;
     while(hole>0&&arr[hole-1]>key){
      arr[hole] =arr[hole-1];
      hole--;   
     }  
     arr[hole]=key;
     }           
 }
  public static  void merge(int arr[], int l, int m, int r) 
    { 
        int n1 = m - l + 1; 
        int n2 = r - m; 
 int L[] = new int [n1]; 
 int R[] = new int [n2]; 
 for (int i=0; i<n1; ++i) 
            L[i] = arr[l + i]; 
        for (int j=0; j<n2; ++j) 
            R[j] = arr[m + 1+ j]; 
  int i = 0, j = 0; 
    int k = l; 
        while (i < n1 && j < n2) 
        { 
            if (L[i] <= R[j]) 
            { 
                arr[k] = L[i]; 
                i++; 
            } 
            else
            { 
                arr[k] = R[j]; 
                j++; 
            } 
            k++; 
        } 
   while (i < n1) 
        { 
            arr[k] = L[i]; 
            i++; 
            k++; 
        } 
while (j < n2) 
        { 
            arr[k] = R[j]; 
            j++; 
            k++; 
        } 
    } 
   public static void mergesort(int arr[], int l, int r) 
    { 
        if (l < r) 
        {
            int m = (l+r)/2; 
   mergesort(arr, l, m); 
   mergesort(arr , m+1, r); 
   merge(arr, l, m, r); 
        } 
    } 
  public static int partition(int arr[], int f, int l){
    int  i=f;
    int  w=f+1;
    while (w<=l){
         if(arr[w]<arr[f]){
        i++;
         int temp = arr[w]; 
               arr[w] = arr[i]; 
               arr[i] = temp; 
        
    }
     w++;       
    }
        int temp = arr[f]; 
      arr[f] = arr[i]; 
       arr[i] = temp; 
      
      
    return i;  
  }
    public static void sort(int arr[], int f, int l) 
    { 
        if (f < l) 
        { 
            int pi = partition(arr, f, l);
            sort(arr, f, pi-1); 
            sort(arr, pi+1, l); 
        } 
    }
public static void bubblesort(int arr[]){
   boolean sorted = true ;

do{
sorted = true ;
for (int i = 0 ; i < arr.length - 1 ; i ++ )

if (arr[i] > arr[i+1]) { 
int temp = arr[i] ;
arr[i] = arr[i +1] ;
arr[i+1] = temp ;
sorted = false ;
}
} while (!sorted ) ;
}
 public static void print (int arr[]){
       for (int i = 0 ; i < arr.length; i++){
           if(i!=arr.length-1){
         System.out.print( arr[i] +",");}
           else{
            System.out.print( arr[i]);   
           }
       }
       System.out.println();
   }
    
    public static void main(String[] args) {


Scanner scan = new Scanner(System.in);
       int arr[]={8,1,4,1,5,9,2,6,5};
       boolean x=true;
int chois = 0;
while(x==true){
System.out.println("enter(0) to sort arrey by bubblesort ");
System.out.println("enter (1)to sort arrey by mergesort");
System.out.println("enter (2) to sort arrey by  sort");
System.out.println("enter (3) to sort arrey bySelectionSort");
System.out.println("enter (4) to sort arrey by insertionsort");

chois = scan.nextInt();
System.out.println("the array");
switch(chois){
            case 0:
  bubblesort(arr);
                	break;
            case 1:
  mergesort( arr,0,arr.length-1); 
                	break; 
            case 2:
    sort( arr,0,arr.length-1); 
                	break;
            case 3:
    SelectionSort(arr);
                	break; 
            case 4:
    insertionsort(arr);
                	break;            
            
            
          }
        print(arr); 
System.out.println("if you need another choice  enter 0");  
 int con = scan.nextInt();
if (con==0)
x =true;
else
x=false;
       }

    }
    
}
