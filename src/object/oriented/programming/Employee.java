package object.oriented.programming;
 public class Employee  extends Person {
     private String institution;
     private String position;
     private long salary;
     public Employee() {
     }

     public Employee(String institution, String position, long salary,int age, String firstName, String lastName) {
         //Initialise members of Employee
         this.age=age;
         this.firstName=firstName;
         this.lastName=lastName;
         this.institution=institution;
         this.position=position;
         this.salary=salary;

     }


     public String getInstitution() {
         return institution;
     }

     public void setInstitution(String institution) {
         this.institution = institution;
     }

     public String getPosition() {
         return position;
     }

     public void setPosition(String position) {
         this.position = position;
     }

     public long getSalary() {
         return salary;
     }

     public void setSalary(long salary) {
         this.salary = salary;
     }

     @Override
     public String toString() {
         return "Employee [institution=" + institution + ", position=" + position + ", salary=" + salary + ", age=" + age + ", firstName=" + firstName + ", lastName=" + lastName + "]";
     }
 }



