package part;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

class Rect{//����һ������
	private int width;
	private int height;
	public Rect() {
	}
	public Rect(int width,int height){
		this.width=width;
		this.height=height;
	}
	public int getArea(){
		return width*height;
	}
}
//<bean id="rect" class="part01.Rect" method="getArea"/>
public class ReflectDemo03 {
	public static void main(String[] args)throws Exception {
		//Rect c1=new Rect();
		
		//���ָ����������
		Class<?> c1=Class.forName("part.Rect");
		//����������ʵ��
		Rect rect1=(Rect)c1.newInstance();//(Ĭ�ϻ����Rect���޲εĹ��캯��)
		System.out.println(rect1);
		
		
		//������еĹ��캯������
		//c1.getDeclaredConstructors();
		Constructor<?> c=c1.getDeclaredConstructor(int.class,int.class);
		//ͨ�����캯�����󹹽���Ķ���(ʵ��)
		Rect rect2=(Rect)c.newInstance(20,10);
		
		
		//ͨ��������ö��󷽷�
		Method m1=c1.getDeclaredMethod("getArea");
		Object result=m1.invoke(rect2);
		System.out.println(result);
	}
}
