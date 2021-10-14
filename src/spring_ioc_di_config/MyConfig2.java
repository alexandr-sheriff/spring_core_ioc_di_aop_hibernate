package spring_introduction;

import org.springframework.context.annotation.*;

@Configuration
@PropertySource("myApp.properties")
public class MyConfig2 {

    @Bean
    @Scope("singleton")
    public Pet catBean() {
        System.out.println("!!!");
        return new Cat();
    }

    @Bean
    public Person personBean() {
        return new Person(catBean());
    }

}
