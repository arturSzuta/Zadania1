package JavaAdvanced.Day1.Serializable;

import java.io.*;

public class WriterReader {
    public static void main(String[] args) {
        Person person1 = new Person("Bob", 13, "Male");
        Person person2 = new Person("Johanna", 65, "Female");
        Person person3 = new Person("John", 43, "Male");
        try{
            FileOutputStream fos = new FileOutputStream("myPerson.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(person1);
            oos.writeObject(person2);
            oos.writeObject(person3);

            fos.close();
            oos.close();

            // Read from file
            FileInputStream fis = new FileInputStream("myPerson.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);

            Person bob = (Person) ois.readObject();
            Person johanna = (Person) ois.readObject();
            Person john = (Person) ois.readObject();

            System.out.println(person1 + "" + bob);
            System.out.println(person2 + "" + johanna);
            System.out.println(person3 + "" + john);

        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}
