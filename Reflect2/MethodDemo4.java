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
		//����Ĳ������Ǳ���֮��Ĳ���
		System.out.println(c1==c2);
		
		/*
		 * c1==c2�������true˵������֮�󼯺ϵķ�����ȥ���ͻ���Java�м��ϵķ��ͣ�
		 * �Ƿ�ֹ��������ģ�ֻ�ڱ���׶���Ч���ƹ��������Ч��
		 * ��֤:���ǿ���ͨ�������ķ������������ƹ�����
		 */
		try {
			Method m=c2.getMethod("add", Object.class);
			m.invoke(list1, 20);//�ƹ�����������ƹ��˷���
			System.err.println(list1.size());
			System.out.println(list1);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
