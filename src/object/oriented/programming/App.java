package object.oriented.programming;

public class App {
    public static void main(String[] args) {
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



