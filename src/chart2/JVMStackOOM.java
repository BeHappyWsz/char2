package chart2;
/**
 * �����̵߳����ڴ�����쳣
 * @author wsz
 * @date 2018��1��26��
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
