package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test4 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext2.xml");

//        Bean Scope = Singleton
//        Dog myDog = context.getBean("myPet", Dog.class);
//        myDog.setName("Belka");
//        Dog yourDog = context.getBean("myPet", Dog.class);
//        yourDog.setName("Strelka");
//
//        System.out.println(myDog.getName());
//        System.out.println(yourDog.getName());

//        System.out.println("Peremennie ssilayutsya na odin i tot je obiekt? " + (myDog == yourDog));
//        System.out.println(myDog);
//        System.out.println(yourDog);

//        Bean Scope = Prototype
        Dog myDog = context.getBean("myPet", Dog.class);
//        myDog.setName("Belka");
        Dog yourDog = context.getBean("myPet", Dog.class);
//        yourDog.setName("Strelka");

//        System.out.println(myDog.getName());
//        System.out.println(yourDog.getName());

        System.out.println("Peremennie ssilayutsya na odin i tot je obiekt? " + (myDog == yourDog));
        System.out.println(myDog);
        System.out.println(yourDog);



        context.close();
    }
}
