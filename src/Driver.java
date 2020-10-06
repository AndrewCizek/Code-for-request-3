public class Driver 
{
	 void sort(int arr[]) 
	 { 
	     int n = arr.length; 
	  
	     for (int i = 0; i < n-1; i++) 
	     { 
	         int min = i; 
	         for (int j = i+1; j < n; j++) 
	             if (arr[j] < arr[min]) 
	                 min = j; 
	  
	         int temp = arr[min]; 
	         arr[min] = arr[i]; 
	         arr[i] = temp; 
	     } 
	 }
	 void printArray(int arr[]) 
	 { 
	     int n = arr.length; 
	     for (int i=0; i<n; ++i) 
	         System.out.print(arr[i]+" "); 
	     System.out.println(); 
	 } 
	   
	 public static void main(String args[]) 
	 { 
	     Driver ob = new Driver(); 
	     int arr[] = {32,128,8,64,256}; 
	     ob.sort(arr);  
	     ob.printArray(arr); 
	 } 
}
