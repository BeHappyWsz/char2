package chart2;

import java.util.ArrayList;
import java.util.List;

/**
 * ����ʱ���������
 * String.intern():����ַ������������Լ�����һ�����ڴ�String������ַ������򷵻ش����������ַ�����String����
 * ���򣬽���String����������ַ�����Ӵ��������У����ҷ��ش�String��������á�
 * @author wsz
 * @date 2018��1��26��
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
