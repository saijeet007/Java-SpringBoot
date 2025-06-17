package com.sai.config;

import com.sai.Alien;
import com.sai.Computer;
import com.sai.Desktop;
import com.sai.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("com.sai")
public class AppConfig {

 /*   @Bean
    public Alien alien( @Autowired Computer com){ //@Qualifier("desktop") -> if we need to make this bean as primary
        Alien obj=new Alien();
        obj.setAge(21);
        obj.setCom(com);
        return obj;
    }

    //@Bean(name = "com2")
    @Bean
    //@Scope("prototype")
    public Desktop desktop(){
        return new Desktop();
    }

    @Bean
    @Primary
    public Laptop laptop(){
        return new Laptop();
    } */


}
