package edu.njust.lambda;

import java.util.Arrays;
import java.util.List;

public class lambda2 {
	public static void main(String[] args) {
		// Java 8之后：
		List features = Arrays.asList("Lambdas", "Default Method", "Stream API", "Date and Time API");
		features.forEach(n -> System.out.println(n));
// 使用Java 8的方法引用更方便，方法引用由::双冒号操作符标示，
// 看起来像C++的作用域解析运算符
		features.forEach(System.out::println);

		long count = features.stream().count();
		System.out.println("count:"+ count);

		long count1 =  features.stream().filter(str->str.toString().contains("API")).count();
		System.out.println("count1:"+count1);
	}
}
