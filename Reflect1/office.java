public class office{
	public static void main(String[] args){
		//new��������ʱ��̬�����࣬�ڱ���ʱ�̾���Ҫ�������еĿ���ʹ�õ�����
		//ͨ����̬��������Խ��������
		if("Word".equals(args[0])){
			Word w=new Word();
			w.start();
		}
		if("Excel".equals(args[0])){
			Excel e=new Excel();
			e.start();
		}
	}
}
