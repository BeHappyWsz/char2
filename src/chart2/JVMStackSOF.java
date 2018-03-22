package chart2;
/**
 * 虚拟机栈和本地方法栈溢出
 * 1.线程请求的栈深度大于虚拟机所允许的最大深度：StackOverFlowError
 * 2.如果虚拟机在扩展栈时无法申请到足够的内存空间(内存太小?已使用的栈空间太大?)：OutOfMemoryError
 * @author wsz
 * @date 2018年1月26日
 */
public class JVMStackSOF {
	
	private int stackLength=1;
	
	/**
	 * 模拟第一种溢出
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
