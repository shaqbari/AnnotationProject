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
		
		System.out.println("입력:");//a, b, c
		String data=scan.next();
		
		/*A aa=new A();
		if (data.equals("a")) {
			aa.a();
		}else if (data.equals("b")) {
			aa.b();
		}else if (data.equals("c")) {
			aa.c();
		}기본 자바코딩 스프링에서는 .class만 제공되기 때문에 이렇게 코딩할 수 없다.*/
		
		Class clsName=Class.forName("com.sist.A"); //클래스 이름만 있으면 클래스 정보를 읽는다. 스프링에서 xml에서 읽어 건내준다.
		Object obj=clsName.newInstance();//클래스 이름만 있으면 메모리 할당할 수 있다.
		Method[] methods=clsName.getDeclaredMethods();
		for (Method m : methods) {
			/*String name=m.getName();
			if (data.equals(name)) {
				m.invoke(obj, null);//코드에서 메소드 이름 없어도 메소드 호출가능 (하지만 메소드이름을 입력해줘야 한다.)
			}*/
			RequestMapping rm=m.getAnnotation(RequestMapping.class);
			if (data.equals(rm.value())) {
				//m.invoke(obj, null);//null에는 매개변수를 넣을 수 있다. 매개변수가 여러개면 ,쓰고 붙이면 된다.
				m.invoke(obj, "hello");//이를 가변 데이터 형(ex: Object...)이라고 한다. 예)printf()
				
			}
			
		}
		
	}

}
