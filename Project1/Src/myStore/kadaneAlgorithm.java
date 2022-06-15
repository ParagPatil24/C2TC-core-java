package myStore;


import java.util.*;

public class kadaneAlgorithm {

	public static void main(String[] args) {
		// Kadane's  Algorithm
		// To find Maximum sum of Sub-Array for a given integer.
		
		int [] firstArray= {-2,-3,4,-1,-2,1,5,-3};
		
		
		int j=0;
		int r= firstArray.length-1;
		
		List<Integer> list= new ArrayList<Integer>();
		
		list.add(firstArray[0]);
		list.add(firstArray[r]);
		
		for (int i=0;i<=firstArray.length-1;i++) {
			int n= firstArray[i];
			
			for(j=i+1;j<=firstArray.length-1;j++) {
				n+=firstArray[j];
				//System.out.println(n+"P");
				
				list.add(n);
				}	
		}
	
		
		Collections.sort(list);
		//System.out.println(list);
		if((list.get(list.size()-1)< 0)) {
			System.out.println("Maximum Sum is negative = -1");
		}
		else {
			System.out.println("Maximum sum Of Subarray= "+list.get(list.size()-1));
		}
	
	}

}
