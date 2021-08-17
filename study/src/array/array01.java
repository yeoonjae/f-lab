package array;

import java.util.ArrayList;
import java.util.Arrays;

public class array01 {
	public static void main(String[] args) {
		//변수에 대해서 공부하자!
		int[] d = {1,2,3};
		System.out.println(d);
		System.out.println(d[0]);
		System.out.println(d.toString());
		System.out.println(d.toString());
		
		System.out.println(Arrays.toString(d));
		
		int[] a = {1,2,3};
		for(int i = 0; i <a.length;i++) {
			System.out.println(a[i]);
		}
		System.out.println(Arrays.toString(a));
	}
}
