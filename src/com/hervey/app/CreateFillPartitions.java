package com.hervey.app;

import java.util.Set;
import java.util.TreeSet;

public class CreateFillPartitions {

	public static int fetchPartitionLength(int partitionCount, Set<Integer> setValues) {
		int minValueCollection = ((TreeSet<Integer>) setValues).first();
		int maxValueCollection = ((TreeSet<Integer>) setValues).last();
		
		if(maxValueCollection-minValueCollection<1) {
			return 1;
		}
		return (maxValueCollection-minValueCollection+1)/partitionCount;
	}

	public static void determineMinMaxForEachPartitin(int partitionCount, TreeSet<Integer> setValues) {

		
		//Let's check what we have:
		System.out.println("Partition count is:  " + partitionCount);
		System.out.println("setValues are:  " + setValues.toString() + " and size is:  " + setValues.size());
		int partitionLength = fetchPartitionLength(partitionCount, setValues);
		System.out.println("Partition Length:   " + partitionLength);
		
		
		int minValueCollection = setValues.first();
		int maxValueCollection = setValues.last();
		
		System.out.println("min value of collection is:  " + minValueCollection + "  and max value of collection is: " + maxValueCollection);
		
		//This collection will have this number of partitions:  partitionCount
		//The length of each partition will be partitionLength (except maybe the last partition which gets any leftovers)
		//The lowest value to be allocated to partitions and thus the lowest range in the 0 partition is minValueCollection
		//The highest value to be allocated to the highest range in the last partition is maxValueCollection
		
		//the minimum range value in any partition labeled starting from #=0 to #=partitionCount-1
		//    is: partitionMinOfPartition#= (minValueCollection * partition#)-partition#
		
		//the maximum range value in any partition labeled starting from #=0 to #=partitionCount-1 EXCEPT the last partition which will just be maxValueCollection
		//    is:  partitionMaxOfPartition# = partitionMinOfPartition# + partitionLength -1 
		
		//starting off with a trivial case of partitionCount =3, And A setValues that produces range of 4>>10 with 4, 5, 6, 7, 8, 9, 10
		

		int tempDemoMin = 0;
		int tempDemoMax = 0;
		
		for(int partitionNumber=0; partitionNumber<partitionCount; partitionNumber++) {
			if(partitionNumber==0) {
				tempDemoMin=minValueCollection;
			}
			else {
				tempDemoMin = tempDemoMax+1;
			}
			if(partitionNumber!=partitionCount-1) {
			tempDemoMax = (tempDemoMin + partitionLength -1);
			}
			else {
				tempDemoMax = maxValueCollection;
			}
			System.out.println("Partition "+ partitionNumber +" min is:  " + tempDemoMin +" , and max is:  " + tempDemoMax);
			
			//Here create map for this partition
				//loop through setValues
					//if setValue is in this range
						//add map element of the account number/account value with that setValue to key with corresponding value
		}
		

		
		
		
	}
	
	
	
	
	
	
}
