package kr.hs.dgsw.java.dept1.d0627.binarysearch;

public class BinarySearch implements Searcher {
	
	public int search(int[] sortedValues, int value) {
		
		int start=0;
		int last = sortedValues.length-1;
		int mid;
		
		while(true) {
			if(start > last) break;
			
			mid = (start + last) / 2;
			
			if(sortedValues[mid] == value) {
				return mid;
			} else if(sortedValues[mid] > value) {
				last = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		
		return 0;
	}

}
