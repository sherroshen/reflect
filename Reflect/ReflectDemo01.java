package part;

public class ReflectDemo01 {
	// Java����:ʵ������(new)�������(Class����)
	public static void main(String[] args) {
		String s1 = "helloworld";
		// 1.���s1ָ��Ķ���������
		Class<?> c1 = s1.getClass();
		System.out.println(c1.getName());
		System.out.println(c1.getSimpleName());
		
		//�ж��ǲ��ǽӿ�
		System.out.println(c1.isInterface());
		
		String s2 = new String("helloworld");
		Class<?> c2 = s2.getClass();
		// ���е������������ֻ��һ��
		System.out.println(c1 == c2);
	}
	// .class-->���ص��ڴ�-->���������
}
