package chart2;
/**
 * �����ջ�ͱ��ط���ջ���
 * 1.�߳������ջ��ȴ��������������������ȣ�StackOverFlowError
 * 2.������������չջʱ�޷����뵽�㹻���ڴ�ռ�(�ڴ�̫С?��ʹ�õ�ջ�ռ�̫��?)��OutOfMemoryError
 * @author wsz
 * @date 2018��1��26��
 */
public class JVMStackSOF {
	
	private int stackLength=1;
	
	/**
	 * ģ���һ�����
	 */
	public void stackLeak() {
		stackLength++;
		stackLeak();
	}
	
	public static void main(String[] args) {
		JVMStackSOF sof = new JVMStackSOF();
		try {
			sof.stackLeak();
		} catch (Throwable e) {
			System.out.println(sof.stackLength);
			throw e;
		}
	}
}
