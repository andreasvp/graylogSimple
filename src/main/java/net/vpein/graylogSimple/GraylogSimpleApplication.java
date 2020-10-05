package net.vpein.graylogSimple;

import lombok.extern.java.Log;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Log
@SpringBootApplication
public class GraylogSimpleApplication {

	public static void main(String[] args) {
		SpringApplication.run(GraylogSimpleApplication.class, args);
	}

}
