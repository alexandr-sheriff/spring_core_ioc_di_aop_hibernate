package hibernate_one_to_one;

import hibernate_one_to_one.entity.Employee;
import hibernate_one_to_one.entity.Detail;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        //                        "hibernate.cfg.xml"

        try (
                SessionFactory factory = new Configuration()
                        .configure(
//                        "hibernate.cfg.xml"
                        )
                        .addAnnotatedClass(Employee.class)
                        .addAnnotatedClass(Detail.class)
                        .buildSessionFactory();
                Session session = factory.getCurrentSession()
        ) {
//            Session session = factory.getCurrentSession();
//            Employee employee = new Employee("Alex", "Shaf", "IT", 2000);
//            Detail detail = new Detail("Batumi", "1342314123", "test@mail.ru");
//            employee.setEmpDetail(detail);
//
//            session.beginTransaction();
//
//            session.save(employee);
//
//            session.getTransaction().commit();
//            System.out.println("Done!");

//            Session session = factory.getCurrentSession();
//            Employee employee = new Employee("Oleg", "Deko", "IT", 3500);
//            Detail detail = new Detail("Batumi", "32143241", "oleg@mail.ru");
//            employee.setEmpDetail(detail);
//
//            session.beginTransaction();
//
//            session.save(employee);
//
//            session.getTransaction().commit();
//            System.out.println("Done!");


            session.beginTransaction();

            Employee employee = session.get(Employee.class, 2);
            System.out.println(employee.getEmpDetail());
            session.delete(employee);

            session.getTransaction().commit();
            System.out.println("Done!");
        }
    }
}
