package reflect.com.imooc;

public class ClassDemo1 {

	public static void main(String[] args) {
		Foo foo1=new Foo();
		//�κ�һ���඼��Class��ʵ���������ʵ�����������ֱ�ʾ��ʽ
		//��һ�ֱ�ʾ��ʽ-->ʵ���ڸ��������κ�һ���඼��һ�������ľ�̬��Ա����class
		Class c1=Foo.class;
		
		//�ڶ��ֱ�ʾ��ʽ���Ѿ�֪���������ͨ��getClass����
		Class c2=foo1.getClass();
		//����c1 c2��������Foo��������ͣ�һ����ֻ������Class���һ��ʵ������
		System.out.println(c1==c2);
		
		//�����ֱ�ʾ��ʽ
		Class c3=null;
		try {
			c3=Class.forName("reflect.com.imooc.Foo");
			//������ʾ����������ͣ��������˶�̬������
			//���ֱ��롢����
			//����ʱ�̼������Ǿ�̬�����࣬����ʱ�̼������Ƕ�̬������
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println(c2==c3);
		
		//������ȫ����ͨ����������ʹ�������Ķ���ʵ��-->ͨ��c1 c2 c3����Foo��ʵ��
		try {
			Foo foo=(Foo)c1.newInstance();//ǰ����Ҫ�޲ι��췽��
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