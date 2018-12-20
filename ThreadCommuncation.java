package part2;

public class ThreadCommuncation {
	static String context;
	public static void main(String[] args) {
		new Thread(){
			public void run(){
				context="helloworld";
			}
		}.start();
		System.out.println(context.toUpperCase());
	}
}
