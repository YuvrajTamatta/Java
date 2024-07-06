 class Pen{
    String name;
    String type;

    void write(){
        System.out.println("this is writable");
    }
    void pritnname(){
        System.out.println(name);
        System.out.println("");
    }
}
class Person{
   String name;
   int age;
   public void printinfo(){
    System.out.println(this.name);
    System.out.println(this.age);
    System.out.println("");
   }
}

class ClassObj{
    public static void main(String[] args) {
        
        // Pen p= new Pen();
        // p.name="cello";
        // p.type="pointn";
        // p.write();
        // p.pritnname();

        // Pen p1= new Pen();
        // p1.name="ollo  ";
        // p1.type="hello";
        // p1.write();
        // p1.pritnname();

        Person y = new Person();
        y.name="yuvraj";
        y.age=25;
        y.printinfo();

        Person y1 = new Person();
        y1.name="Raj";
        y1.age=250;
        y1.printinfo();
    }
    
}