package ru.icl.bbcodeconverter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Simple web-service allocated on localhost on port: 9555
 * This application can convert inputted text from BBCode to HTML format
 *
 * @author Danil Yusupov
 */
@SpringBootApplication
public class BbcodeConverterApplication {

	public static void main(String[] args) {
		SpringApplication.run(BbcodeConverterApplication.class, args);
	}
}
