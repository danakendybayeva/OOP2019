package Problem4;

public class Sort {
	
	static <E extends Comparable<E>> void bubbleSort(E [] a) {
		int n = a.length;
		E temp;
		for(int i = 0; i < n ; i++){
	        for(int j = 1; j < n-i; j++)
	            if(a[j-1].compareTo(a[j]) < 0) { 	//ascending; < descending
	            	temp = a[j];
	                a[j] = a[j-1];
	                a[j-1] = temp;
	            }
		}     
	}
	static <E extends Comparable<E>> void mergingSort(E [] arr, int l, int r) {
		
		if (l < r) {
	        int m = (l + r) / 2;
	        mergingSort(arr, l, m);
	        mergingSort(arr, m + 1, r);
	        merging(arr, l, m, r);
	    }
	}
	
	static <E extends Comparable<E>> void merging(E [] arr, int l, int m, int r) {
	    int n1 = m - l + 1;
	    int n2 = r - m;
	    final Object[] L;
	    L = new Object[n1];
	    final Object[] R;
	    R = new Object[n2];
	    for (int i = 0; i < n1; i++) {
	        L[i] = arr[l + i];
	    }
	    for (int i = 0; i < n2; i++) {
	        R[i] = arr[m + 1 + i];
	    }
	    int uk1 = 0;
	    int uk2 = 0;
	    int k = l;
	    while (uk1 < n1 && uk2 < n2) {
	        if (((E) L[uk1]).compareTo((E) R[uk2]) < 0 || ((E) L[uk1]).compareTo((E) R[uk2]) == 0) {
	        	arr[k] = (E) L[uk1];
	            uk1++;
	        } else {
	        	arr[k] = (E) R[uk2];
	            uk2++;
	        }
	        k++;
	    }
	    while (uk1 < n1) {
	    	arr[k] = (E) L[uk1];
	        uk1++; k++;
	    }
	    while (uk2 < n2) {
	    	arr[k] = (E) R[uk2];
	        uk2++; k++;
	    }
	}
}
