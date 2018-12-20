package reflect.com.imooc;

import java.lang.reflect.Method;

public class ClassUtil {
	public  static void printClassMessage(Object obj){
		//Ҫ��ȡ�����Ϣ ����Ҫ��ȡ���������
		Class c=obj.getClass();
		//��ȡ�������
		System.out.println("��������:"+c.getName());
		
		System.out.println("================");
		/*
		 * Method�࣬��������
		 * һ����Ա��������һ��Method����
		 * getMethods()������ȡ�������е�public�ĺ�������������̳ж�����
		 * getDeclaredMethods()��ȡ�������и����Լ������ķ��������ʷ���Ȩ��
		 */ 
		Method[] ms=c.getMethods();
		for(int i=0;i<ms.length;i++){
			//�õ������ķ���ֵ���͵�������
			Class returnType=ms[i].getReturnType();
			System.out.print(returnType.getName()+"");
			//�õ�����������
			System.out.print(ms[i].getName()+"(");
			//��ȡ��������->�õ����ǲ����б�����͵�������
			Class[] paramTypes=ms[i].getParameterTypes();
			for(Class class1:paramTypes){
				System.out.print(class1.getName()+",");
			}
			System.out.println(")");
		}
	}
	
}
