package log4j;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;




@SpringBootApplication
public class MsLog4jApplication {
	static Logger log=Logger.getLogger(MsLog4jApplication.class);
	public static void main(String[] args) {
			SpringApplication.run(MsLog4jApplication.class, args);
//			BasicConfigurator.configure();
			PropertyConfigurator.configure("log4j.properties");
			log.info("Information");
			log.warn("Warning");
			log.error("Error");
			log.debug("Debugging");
			log.warn("warning");
	}
}