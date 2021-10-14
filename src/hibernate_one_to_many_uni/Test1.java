package hibernate_one_to_many_uni;

import hibernate_one_to_many_uni.entity.Department;
import hibernate_one_to_many_uni.entity.Employee;
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
                        .addAnnotatedClass(Department.class)
                        .buildSessionFactory();
                Session session = factory.getCurrentSession()
        ) {
//            Department department = new Department("HR", 200, 1200);
//            Employee employee1 = new Employee("Alex", "Shaf", 2000);
//            Employee employee2 = new Employee("Elena", "Skil", 12000);
//            department.addEmployeeToDepartment(employee1);
//            department.addEmployeeToDepartment(employee2);
//
            session.beginTransaction();
//
//            session.save(department);

//            Department department = session.get(Department.class, 23);
//            System.out.println(department);
//            System.out.println(department.getEmployees());

//            Employee employee = session.get(Employee.class, 1);
//            System.out.println(employee);
//            System.out.println(employee.getDepartment());

            Department department = session.get(Department.class, 20);
//            Employee employee = session.get(Employee.class, 17);
            session.delete(department);

            session.getTransaction().commit();
            System.out.println("Done!");
        }
    }
}
