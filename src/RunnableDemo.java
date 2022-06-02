
public class RunnableDemo {

	public static void main(String[] args) {
	
		Runnable runnable=new Runnable() {
			@Override
			public void run() {
			  System.out.println("In Runnable");	
			}
		};
	  new Thread(runnable).start();
		
	  //Java8 using lamda
	  //()->{}
	  Runnable runnable1=()->{
		  System.out.println("Using Lambda,Thread started");
		  };
	  new Thread(runnable1).start();
	  
	  Runnable runnable2=()->System.out.println("Using Lamda,Thread Started 2");
	  new Thread(runnable2).start();
	  
	  new Thread(()->{System.out.println("Using Lambda without assigning");}).start();
	}
}
