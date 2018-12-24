package reflect.com.imooc;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassUtil {
	/**
	 * ��ӡ����ĳ�Ա����public ��Ϣ
	 * @param obj
	 */
	public  static void printClassMethodMessage(Object obj){
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
			
			System.out.println("**********");
			printFieldMessage(c);
		}
	}

	/**
	 * ��ȡ��Ա��������Ϣ
	 * @param obj
	 */
	public static void printFieldMessage(Object obj) {
		Class c=obj.getClass();
		/**
		 * ��Ա����Ҳ�Ƕ���
		 * java.lang.reflect.Field
		 * Field���װ�˹��ڳ�Ա�����Ĳ���
		 * getFields()������ȡ�������е�public�ĳ�Ա��������Ϣ
		 * getDeclaredFields��ȡ���Ǹ����Լ������ĳ�Ա��������Ϣ
		 * 
		 */
		//Field[] fs=c.getFields();
		Field[] fs=c.getDeclaredFields();
		for(Field field:fs){
			//�õ���Ա���������͵�������
			Class fieldType=field.getType();
			String typeName=fieldType.getName();
			//�õ���Ա����������
			String fieldName=field.getName();
			System.out.println(typeName+""+fieldName);
		}
	}
	
	/**
	 * ��ӡ����Ĺ��캯������Ϣ
	 * @param obj
	 */
	public static void printConMessage(Object obj){
		//��ȡ�ö����������
		Class c=obj.getClass();
		/*
		 * ���캯��Ҳ�Ƕ���
		 * java.lang.Constructor�з�װ�˹��캯������Ϣ
		 * getConstructors��ȡ���е�public�Ĺ��캯��
		 * getDeclaredConstructors�õ����е��Լ������Ĺ��캯��
		 */
		//Constructor[] cs=c.getConstructors();
		Constructor[] cs=c.getDeclaredConstructors();
		//for->Alt+/
		for (Constructor constructor : cs) {
			System.out.print(constructor.getName()+"(");
			//��ȡ���캯���Ĳ����б�-->�õ����ǲ����б��������
			Class[] paramTypes=constructor.getParameterTypes();
			for (Class class1 : paramTypes) {
				System.out.print(class1.getName()+",");
			}
			System.out.println(")");
		}
	}
}