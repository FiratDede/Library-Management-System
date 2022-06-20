
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {		
		ApplicationContext context= new ClassPathXmlApplicationContext("Beans.xml");

		UI ui=(UI) context.getBean("UI");
		ui.run();

		

	}
	

}
