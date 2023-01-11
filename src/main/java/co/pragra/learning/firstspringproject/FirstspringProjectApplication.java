package co.pragra.learning.firstspringproject;

import co.pragra.learning.firstspringproject.business.FirstTimeBuyerProvider;
import co.pragra.learning.firstspringproject.business.PaymentCalculator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//@SpringBootApplication
public class FirstspringProjectApplication {

	public static void main(String[] args) {
		//SpringApplication.run(FirstspringProjectApplication.class, args);

		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		PaymentCalculator calculator = context.getBean("calculator", PaymentCalculator.class);
		double payment = calculator.calculatePayment();
		System.out.println("payment = " + payment);

	}

}
