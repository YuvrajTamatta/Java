class Student{
    String name;
    int age;

    Student(){
        System.out.println("Hello");
    }
    Student(String name, int age){
        System.out.println(name);
        System.out.println(age);
    }

}

public class Contru {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("yuvraj", 38);

    }

}
