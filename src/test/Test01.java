package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import test.main.java.entity.Person;

public class Test01 {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("test/spring.xml");
		Person person = (Person)applicationContext.getBean("person1");
		System.out.println(person);
	}

}
