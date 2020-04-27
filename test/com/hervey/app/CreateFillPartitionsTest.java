package com.hervey.app;

import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Set;
import java.util.TreeSet;

import org.junit.jupiter.api.Test;

class CreateFillPartitionsTest {

//	@Test
//	void test() {
//		fail("Not yet implemented");
//	}
	
	//let's test partition Count =2; range minimum is 4, range maximum is 10; result partition Length is 3
	@Test
	void testCount2Min4Max10() {
		//fail("first run");
		int partitionCount =2;
		int rangeMin = 4;
		int rangeMax = 10;
		Set<Integer> setValues = new TreeSet<Integer>();
		setValues.add(rangeMin);
		setValues.add(rangeMax);
		
		int expectedResult = 3;
		assertEquals(expectedResult, CreateFillPartitions.fetchPartitionLength(partitionCount, setValues));
		
	}
	
	//test for negative range
	@Test
	void testOnePartition() {
		//fail("first run");
		int partitionCount =1;
		int rangeMin = 1;
		int rangeMax = 10;
		Set<Integer> setValues = new TreeSet<Integer>();
		setValues.add(rangeMin);
		setValues.add(rangeMax);
		int expectedResult = 10;
		assertEquals(expectedResult, CreateFillPartitions.fetchPartitionLength(partitionCount, setValues));
	}
	
	@Test
	void testPartitionRanges() {
		//fail("first run");
		int partitionCount =3;
		Set<Integer> setValues = new TreeSet<Integer>();
		setValues.add(4);
		setValues.add(5);
		setValues.add(6);
		setValues.add(7);
		setValues.add(8);
		setValues.add(8);
		setValues.add(9);
		setValues.add(10);
		//Need to add test parameters to make it real
		
		CreateFillPartitions.determineMinMaxForEachPartitin(partitionCount, (TreeSet<Integer>) setValues);
		
		
		
		
	}
	
	
	

}
