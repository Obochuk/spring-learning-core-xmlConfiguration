package com.obochuk;

import com.obochuk.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringLsSc {

    public static void main(String[] args) {

        // load the Spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Lifecicle-Scope-applicationContext.xml");

        //retrieve the bean
        Coach theCoach = context.getBean("myCoach", Coach.class);

        //call methods on the bean
        System.out.println(theCoach.getDailyWorkout());

        //let`s call the method for fortune
        System.out.println(theCoach.getDailyFortune());

        //close the context
        context.close();

    }

}
