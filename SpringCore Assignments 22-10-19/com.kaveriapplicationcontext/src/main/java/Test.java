package main.java;
    import org.springframework.context.ApplicationContext;
	import org.springframework.context.support.AbstractApplicationContext;
	import org.springframework.context.support.ClassPathXmlApplicationContext;
	public class Test {
		public static void main(String[] args) {
			AbstractApplicationContext  context = new ClassPathXmlApplicationContext("beans.xml");
			ApplicationContextAwareTest appcontext= (ApplicationContextAwareTest)context.getBean("appcontext");
			ApplicationContext appCon =appcontext.getContext();
			A a= (A)appCon.getBean("testA");
			a.doTask();
			context.registerShutdownHook();
		}
	}

