package chart2;

import java.util.ArrayList;
import java.util.List;

/**
 * ������쳣:
 * ֻҪ���ϵش������󣬲��ұ�֤GC Roots������֮���пɴ�·���������������ջ��������Щ����
 * ��ô�ڶ��������ﵽ���ѵ��������ƺ�ͻ�����ڴ�����쳣
 * @author wsz
 * @date 2018��1��26��
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
