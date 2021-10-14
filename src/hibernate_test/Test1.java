package hibernate_test;

import hibernate_test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        //                        "hibernate.cfg.xml"

        try (SessionFactory factory = new Configuration()
                .configure(
//                        "hibernate.cfg.xml"
                )
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory()) {
            Session session = factory.getCurrentSession();
            Employee emp = new Employee("Syzana", "Cheko", "HR", 180);
            System.out.println("1:" + emp);
            session.beginTransaction();
            System.out.println("2:" + emp);
            session.save(emp);
            System.out.println("3:" + emp);
            session.getTransaction().commit();

            System.out.println("Done!");
            System.out.println("4:" + emp);
        }

    }
}
