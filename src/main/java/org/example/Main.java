package org.example;

public class Main {
    public static void main(String[] args) {

        Person person = new Person("John", "Doe", 20);

        System.out.println("Firstname: " + person.getFirstName());

        System.out.println("LastName: " + person.getLastName());

        System.out.println("Age: " + person.getAge());

        Person omer = new Person("Omer", "Kenar", 30, 1.75, 83.7,"Erkek");

        System.out.println("Yaş: " + omer.age);
        System.out.println(omer.toString());


        Wall wall = new Wall(5,4);

        System.out.println("area= " + wall.getArea());
        System.out.println("width= " + wall.getWidth());

        wall.setHeight(-1.5);

        System.out.println("width= " + wall.getWidth());

        System.out.println("height= " + wall.getHeight());

        System.out.println("area= " + wall.getArea());

    }
}
