
import org.springframework.stereotype.Service;
 
@Service("helloService")
public class HelloService {
 
	private String name;
 
	public void setName(String name) {
		this.name = name;
	}
 
	public String sayHello() {
		return "Hello! " + name;
	}
}