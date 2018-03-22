package chart2;

import java.util.ArrayList;
import java.util.List;

/**
 * 运行时常量池溢出
 * String.intern():如果字符串常量池中以及包含一个等于此String对象的字符串，则返回代表池中这个字符串的String对象；
 * 否则，将此String对象包含的字符串添加带常量池中，并且返回此String对象的引用。
 * @author wsz
 * @date 2018年1月26日
 */
public class RuntimeConstantPoolOOM {

	public static void main(String[] args) {
//		outOfMemory();
		internTest();
	}

	static void outOfMemory() {
		List<String> list = new ArrayList<String>();
		long i=0L;
		while(true) {
			list.add(String.valueOf(i++).intern());
		}
	}
	static void internTest() {
		String str1 = new StringBuilder("aaa").append("bbb").toString();
		System.out.println(str1.intern() == str1);
		
		String str2 = new StringBuilder("j").append("ava").toString();
		System.out.println(str2.intern() == str2);
		
		String str3 = new StringBuilder("aaa").append("bbb").toString();
		System.out.println(str3.intern() == str3);
	}
}
