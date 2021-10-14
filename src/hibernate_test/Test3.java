package hibernate_test;

import hibernate_test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Test3 {
    public static void main(String[] args) {
        //                        "hibernate.cfg.xml"

        try (SessionFactory factory = new Configuration()
                .configure(
//                        "hibernate.cfg.xml"
                )
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory()) {
            Session session = factory.getCurrentSession();
            session.beginTransaction();

            List<Employee> employees;
//            employees = session.createQuery("from Employee").getResultList();
            employees = session.createQuery("from Employee " +
                            "where name = 'Alex' and salary > 650")
                    .getResultList();

            for (Employee e :
                    employees) {
                System.out.println(e);
            }

            session.getTransaction().commit();

            System.out.println("Done!");
        }

    }
}
