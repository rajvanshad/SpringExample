package com.tutorialspoint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
	
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		
		TextEditor te = (TextEditor) context.getBean("textEditor");		
		
		//te.getSpellChecker();
		te.spellCheck();
		
		/*jc.getAddressList();
		jc.getAddressSet();
		jc.getAddressMap();
		jc.getAddressProp();*/
		
		
		
		
	}

}
