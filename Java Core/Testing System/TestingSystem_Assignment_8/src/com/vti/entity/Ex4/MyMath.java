package com.vti.entity.Ex4;

/**
 * This class is . 
 * 
 * @Description: .
 * @author: TĐGiang
 * @create_date: Apr 7, 2021
 * @version: 1.0
 * @modifer: TĐGiang
 * @modifer_date: Apr 7, 2021
 */
public class MyMath<N extends Number> {
	public static	<N extends Comparable<N>>  N maximum(N[] numbers) {
		N max = numbers[0];
		for (int i = 1; i < numbers.length; i++) {
			if (max.compareTo(numbers[i])<0) {
				max = numbers[i];
			}
		}
		return max;
		
	}
	public static <N extends Number> N Sum(N[] numbers) {
		Double sum = 0.0;
		for (N n : numbers) {
			sum += n.doubleValue();
		}
		return (N) sum;
	}
	public static <N extends Number> N Subtrac(N a, N b) {
		Double subtrac = a.doubleValue() - b.doubleValue();
		return (N) subtrac;
	}
	public static <N extends Number> N Power(N a, N b) {
		
		Double result = Math.pow(a.doubleValue(), b.doubleValue());
		
		return (N) result;
	}
}
