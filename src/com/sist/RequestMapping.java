package com.sist;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author user
 *	기억 ==> Class, Source, Runtime //runtime을 줘야 프로그램종료까지 가상머신에서 기억하고 있는다.
 *	//Source는 컴파일하면 지워진다.
 *	대상 ==> 구분자(패키지, 클래스, 메소드, 생성자, 멤버변수(field), 파라메터)
 *
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
//@RequestMapping("a.do")
public @interface RequestMapping {
	public String value();

	//등록할때 xml을 사용하고 찾아올때 annotation을 쓴다.
}
