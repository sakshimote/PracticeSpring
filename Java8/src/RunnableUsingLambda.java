
public class RunnableUsingLambda {
	
	public static void main(String[] args) {
		
		
		/*
		 * prior to java 8
		 */
		
		Runnable runnable=new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("inside runnable");
			}
		};
		
		new Thread(runnable).start();
		
		/*
		 * using java 8 lambda syntax
		 */
		
		Runnable runnableLambda=()->{
			System.out.println("inside runnable using lambda1");
		};
		
		Runnable runnableLambda2=()->System.out.println("inside runnable lambda 2");
		new Thread(runnableLambda2).start();
		new Thread(()->System.out.println("inside runnable lambda 3")).start();;		
		new Thread(runnableLambda).start();
		
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("inside runnable using legacy way:");
			}
		}).start();;
	}

}
