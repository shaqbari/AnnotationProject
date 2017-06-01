package com.sist;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author user
 *	��� ==> Class, Source, Runtime //runtime�� ��� ���α׷�������� ����ӽſ��� ����ϰ� �ִ´�.
 *	//Source�� �������ϸ� ��������.
 *	��� ==> ������(��Ű��, Ŭ����, �޼ҵ�, ������, �������(field), �Ķ����)
 *
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
//@RequestMapping("a.do")
public @interface RequestMapping {
	public String value();

	//����Ҷ� xml�� ����ϰ� ã�ƿö� annotation�� ����.
}
