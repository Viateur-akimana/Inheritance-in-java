package object.oriented.programming;

public class App {
    public static void main(String[] args){
        Person peter=new Person(12, "Mugisha","Davis");
        System.out.println(peter);
        // Create a Person of type Employee with a Default Constructor
        //Not Possible to set additional information of employee
        Employee p2=new Employee();
        p2.setAge(18);
        p2.setFirstName("Mahoro");
        p2.setLastName("Dan");
        p2.setInstitution("RCA");
        p2.setSalary(120);
        p2.setPosition("Instructor");
        System.out.println(p2);
        System.out.println(p2.getFirstName());
        System.out.println(p2.getInstitution());
        Person p3=new Employee("RCA","Instructor",120, 18,"MUGISHA","Davis");
        System.out.println(p3);
        //Create a Student
        Person p4=new Student("Mugisha","Manzi","S5","RCA","SPE");
        System.out.println(p4.getFirstName());
        System.out.println(p4);
        //Everything is an Object
        Object p5=new Employee("Nyabihu","Nurse",120,18,"Mugabo","Mike");
        System.out.println(p5);
    }

}



