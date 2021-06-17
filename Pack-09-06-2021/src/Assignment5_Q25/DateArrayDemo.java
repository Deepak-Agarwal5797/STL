/**
 * Author :deepak.agarwal@stl.tech
 * Creation Date: 9-Jun-2021 
 * Version:1.0
 * Copyright :Sterlite Technologies Ltd.
 * **/
package Assignment5_Q25;
public class DateArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyDate[] arr =new MyDate[2];
		arr[0] = new MyDate(12,3,2021);
		arr[1]= new MyDate(13,5,2000);
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]+" ");
		}
		
		MyDate arr2[] = {new MyDate(22,12,2000),new MyDate(23,2,2010)};
		for(MyDate r: arr2)
		{
			System.out.println(r+" ");
		}
	}

}
