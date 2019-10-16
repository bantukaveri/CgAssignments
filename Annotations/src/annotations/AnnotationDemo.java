package annotations;

import java.lang.annotation.Annotation;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Inherited
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface SmartPhone{
	String os();

	int version();
}


@SmartPhone(os="android", version=6)
class NokiaAseries
{
	 String  model;
	int size=6;
	
	
	public NokiaAseries(String model, int size) {
		super();
		this.model = model;
		this.size = size;
	}

	
	
	
}
public class AnnotationDemo {
	
	
	public static void main(String args[]) {
		
		 NokiaAseries obj= new  NokiaAseries("fire",5);
		 System.out.println(obj.model);
		 Class c=obj.getClass();
		 Annotation an= c.getAnnotation(SmartPhone.class);
		 SmartPhone s= (SmartPhone)an;
		 System.out.println(s.os());
		 
		 
	
	
	
}

}
