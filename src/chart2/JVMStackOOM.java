package chart2;
/**
 * 创建线程导致内存溢出异常
 * @author wsz
 * @date 2018年1月26日
 */
public class JVMStackOOM {

	private void donotStop() {
		while(true) {
		}
	}
	
	public void stackLeakByThread() {
		while(true) {
			new Thread(new Runnable() {
				@Override
				public void run() {
					donotStop();
				}
			}).start();
		}
	}
	
	public static void main(String[] args) {
		JVMStackOOM oom = new JVMStackOOM();
		oom.stackLeakByThread();
	}

}
