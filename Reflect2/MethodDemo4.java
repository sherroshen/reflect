package reflect.com.imooc;

import java.lang.reflect.Method;
import java.util.ArrayList;

public class MethodDemo4 {

	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		ArrayList<String> list1=new ArrayList<String>();
		list1.add("hello");
		
		Class c1=list.getClass();
		Class c2=list.getClass();
		//反射的操作都是编译之后的操作
		System.out.println(c1==c2);
		
		/*
		 * c1==c2结果返回true说明编译之后集合的泛型是去泛型化的Java中集合的泛型，
		 * 是防止错误输入的，只在编译阶段有效，绕过编译就无效了
		 * 验证:我们可以通过方法的反射来操作，绕过编译
		 */
		try {
			Method m=c2.getMethod("add", Object.class);
			m.invoke(list1, 20);//绕过编译操作就绕过了泛型
			System.err.println(list1.size());
			System.out.println(list1);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
