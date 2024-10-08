
package com.mycompany.bubblesort;


class BubbleSort { 
	void bubbleSort(int arr[]) 
	{ 
	int n = arr.length; 
	for (int i = 0; i < n - 1; i++) 
	for (int j = 0; j < n - i - 1; j++) 
	if (arr[j] > arr[j + 1]) { 
        
        // swap temp and arr[i] 
	int temp = arr[j]; 
	arr[j] = arr[j + 1]; 
	arr[j + 1] = temp; 
				} 
	} 

	// Prints the array 
	void printArray(int arr[]) 
	{ 
		int n = arr.length; 
		for (int i = 0; i < n; ++i) 
		System.out.print(arr[i] + " "); 
		System.out.println(); 
	} 

	// Driver method to test above 
	public static void main(String args[]) 
	{ 
		BubbleSort ob = new BubbleSort(); 
		int arr[] = { 62, 32, 25, 12, 22, 21, 80 }; 
                System.out.println("array before sorting: ");
                ob.printArray(arr);
                System.out.println();
                
		ob.bubbleSort(arr); 
		System.out.println("array after : "); 
		ob.printArray(arr); 
	} 
}

