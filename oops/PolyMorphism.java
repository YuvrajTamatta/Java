class Employee{
    void info(String name){
        System.out.println(name);
    }
    void info(int age){
        System.out.println(age);
    }
    void info(String name, int age){
        System.out.println(name+" "+age);
    }
    void info(char bldgrp, String add){
        System.out.println(bldgrp + " "+ add);
    }
}
public class PolyMorphism {
// PolyMorphism 
// poly = many
// morphism = form
// Two types:
// Compile Time = function overloading
// Runtime = function overriding.
public static void main(String[] args) {
    Employee E = new Employee();
    E.info("Yuvraj");
    E.info("hello",38);
    E.info('f',"surat");
}
    

}
