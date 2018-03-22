package chart2;

import java.util.ArrayList;
import java.util.List;

/**
 * 堆溢出异常:
 * 只要不断地创建对象，并且保证GC Roots到对象之间有可达路径来避免垃圾回收机制清除这些对象，
 * 那么在对象数量达到最大堆的容量限制后就会产生内存溢出异常
 * @author wsz
 * @date 2018年1月26日
 */
public class HeapError {

	static class HeapObject{
		
	}
	
	public static void main(String[] args) {
		
		List<HeapObject> list = new ArrayList<HeapObject>();
		while(true) {
			list.add(new HeapObject());
		}
	}
}
