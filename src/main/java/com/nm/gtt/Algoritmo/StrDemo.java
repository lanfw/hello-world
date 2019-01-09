package com.nm.gtt.Algoritmo;

public class StrDemo {
	public static void main(String[] args) {
		String str1 = "我java";
		StringBuilder sb = new StringBuilder(str1);//构造一个StringBuilder对象
		sb.insert(0, "正在学习");//在指定的位置1，插入指定的字符串
		str1 = sb.toString();
		System.out.println(str1);

		}
}
