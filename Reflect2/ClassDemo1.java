package reflect.com.imooc;

public class ClassDemo1 {

	public static void main(String[] args) {
		Foo foo1=new Foo();
		//任何一个类都是Class的实例对象，这个实例对象有三种表示方式
		//第一种表示方式-->实际在告诉我们任何一个类都有一个隐含的静态成员变量class
		Class c1=Foo.class;
		
		//第二种表示方式，已经知道该类对象通过getClass方法
		Class c2=foo1.getClass();
		//不管c1 c2都代表了Foo类的类类型，一个类只可能是Class类的一个实例对象
		System.out.println(c1==c2);
		
		//1,2静态加载(编译时刻加载需要用到的类，找不到需要的类编译失败).3动态加载(运行时刻加载类，运行找不到需要的类运行出错)
		
		//第三种表示方式
		Class c3=null;
		try {
			c3=Class.forName("reflect.com.imooc.Foo");
			//不仅表示了类的类类型，还代表了动态加载类
			//区分编译、运行
			//编译时刻加载类是静态加载类，运行时刻加载类是动态加载类
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println(c2==c3);
		
		//我们完全可以通过类的类类型创建该类的对象实例-->通过c1 c2 c3创建Foo的实例
		try {
			Foo foo=(Foo)c1.newInstance();//前提需要无参构造方法
			foo.print();
		} catch (InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		}
		
		
	}
}
class Foo{
	void print(){
		System.out.println("foo");
	}
}
