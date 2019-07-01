package model;
import model.Student;

public class Demo {

    public static void main(String[] args) {

        Student student = new Student();
        student.setAge(20);
        student.setName("Ethan");
        student.setSex("man");
        student.setNumber("20190701");

        System.out.println(student.name);
        System.out.println(student.sex);
        System.out.println(student.age);
        System.out.println(student.number);

    }

}
