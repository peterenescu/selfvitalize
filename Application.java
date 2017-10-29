/*
 * Project: SelfVitalize
 * Founders: Peter Enescu, Dennis Mariano, Eric Perez
 * Copyright © 2017
 * 
 * File: Application.java
 * Description: Application Runner
 * Last Written by: Peter Enescu 
 * Date Last Update: October 28st, 2017
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

  public static void main(String[] args) throws Exception {
    SpringApplication.run(Application.class, args);
  }

}