class Shape{
    void color(){
        System.out.println("This is from shape");
    }
}
// Single level
class Circle extends Shape {
    void ol(){
        System.out.println("This is from Circle");
    }
}
// Multilever
class Reactangle extends Circle{
    void rect(){
        System.out.println("The Rectanglr");
    }
}
//hybrid 
class Triangel extends Shape{
    void sh(){
        System.out.println("trin");
    }
}





class Inhrtnc{
    public static void main(String[] args) {
        /*There are four types of inheritance 
        1. Single 
        2.Multiple 
        3.Hybrid 
        4.hierarchical */
   
        Reactangle rt = new Reactangle();
        rt.rect();
        rt.ol();
        rt.color();
    }
}