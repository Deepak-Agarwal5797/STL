package com.phoenix.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import com.phoenix.comparators.CompareNum;

public class NumList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> numList = new ArrayList<Integer>();
		numList.add(140);
		numList.add(200);
		numList.add(400);
		
		for(int i=0;i<numList.size();i++)
		{
			int ele= numList.get(i);
			System.out.println(ele);
		}
		
		// using iterator
		System.out.println(" using iterator");
		Iterator<Integer> i1= numList.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		// using for each loop
		for(Integer i:numList)
		{
			System.out.println(i);
		}
		
		
		// sort in descending order
		Collections.sort(numList, new CompareNum());
		System.out.println("User defined collections sort");
		System.out.println(numList);
	}

}
