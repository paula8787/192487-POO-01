package Parcial;

import utils.Student;

public class App {

    public static void main(String[] args) {

        Student student1 = new Student();
        student1.setName("Alice"); 
        student1.setAge(20);
        student1.setId("S12345");  
        student1.showInfo();

        Student student2 = new Student("Bob", 22);
        student2.setId("S67890");
        student2.showInfo();

        Student student3 = new Student("Charlie", 21, "S54321");
        student3.showInfo();
    }

}