package com.sai;


import com.sai.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);

        Alien obj1= context.getBean( Alien.class );
       // obj1.setAge(21);
        System.out.println(obj1.getAge());
        obj1.code();

    //    Desktop dt=context.getBean( Desktop.class);
    //    dt.compile();

    //    Desktop dt1=context.getBean( Desktop.class);
    //    dt.compile();











        //This Approch is used in XML based configuration
       /* ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Alien obj1= context.getBean("Saijeet", Alien.class );
        //obj1.setAge(21);
        System.out.println(obj1.getAge());
        obj1.code(); */

       // Alien obj2= (Alien) context.getBean("Saijeet");

        //  System.out.println(obj2.age);
        //obj2.code();

       // Desktop obj=context.getBean(Desktop.class);
    }
}
