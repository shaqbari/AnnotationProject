package com.sist;
import java.lang.reflect.Method;
import java.util.*;
/**
 * @author user
 *	
 */
class A{
	@RequestMapping("a.do")
	public void asadsf(String a){
		System.out.println("a() call..."+a);
		
	}
	@RequestMapping("b.do")
	public void bsdafsf(){
		System.out.println("b() call...");

	}
	@RequestMapping("c.do")
	public void casdfasdfasfd(){
		System.out.println("c() call...");

	}
	
}

public class MainClass {

	public static void main(String[] args) throws Exception{
		Scanner scan=new Scanner(System.in);
		
		System.out.println("�Է�:");//a, b, c
		String data=scan.next();
		
		/*A aa=new A();
		if (data.equals("a")) {
			aa.a();
		}else if (data.equals("b")) {
			aa.b();
		}else if (data.equals("c")) {
			aa.c();
		}�⺻ �ڹ��ڵ� ������������ .class�� �����Ǳ� ������ �̷��� �ڵ��� �� ����.*/
		
		Class clsName=Class.forName("com.sist.A"); //Ŭ���� �̸��� ������ Ŭ���� ������ �д´�. ���������� xml���� �о� �ǳ��ش�.
		Object obj=clsName.newInstance();//Ŭ���� �̸��� ������ �޸� �Ҵ��� �� �ִ�.
		Method[] methods=clsName.getDeclaredMethods();
		for (Method m : methods) {
			/*String name=m.getName();
			if (data.equals(name)) {
				m.invoke(obj, null);//�ڵ忡�� �޼ҵ� �̸� ��� �޼ҵ� ȣ�Ⱑ�� (������ �޼ҵ��̸��� �Է������ �Ѵ�.)
			}*/
			RequestMapping rm=m.getAnnotation(RequestMapping.class);
			if (data.equals(rm.value())) {
				//m.invoke(obj, null);//null���� �Ű������� ���� �� �ִ�. �Ű������� �������� ,���� ���̸� �ȴ�.
				m.invoke(obj, "hello");//�̸� ���� ������ ��(ex: Object...)�̶�� �Ѵ�. ��)printf()
				
			}
			
		}
		
	}

}
