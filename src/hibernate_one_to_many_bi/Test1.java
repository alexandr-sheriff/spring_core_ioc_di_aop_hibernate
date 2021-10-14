package hibernate_one_to_many_bi;

import hibernate_one_to_many_bi.entity.Department;
import hibernate_one_to_many_bi.entity.Employee;
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
//            Department department = new Department("ID", 200, 1200);
//            Employee employee1 = new Employee("Alex", "Shaf", 2000);
//            Employee employee2 = new Employee("Elena", "Skil", 12000);
//            Employee employee3 = new Employee("Kdssd", "Dsdds", 2400);
//            department.addEmployeeToDepartment(employee1);
//            department.addEmployeeToDepartment(employee2);
//            department.addEmployeeToDepartment(employee3);

            session.beginTransaction();

//            session.save(department);

            System.out.println("GET DEPARTMENT");
            Department department = session.get(Department.class, 24);
            System.out.println("SHOW DEPARTMENT");
            System.out.println(department);
            System.out.println("LOAD EMPLOYEES");
            System.out.println(department.getEmployees().get(0));


//            Employee employee = session.get(Employee.class, 1);
//            System.out.println(employee);
//            System.out.println(employee.getDepartment());

//            Employee employee = session.get(Employee.class, 9);
//            session.delete(employee);

            session.getTransaction().commit();

            System.out.println("SHOW EMPLOYEES");
            System.out.println(department.getEmployees());

            System.out.println("Done!");
        }
    }
}
