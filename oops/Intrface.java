interface Student{
    public void study();
}

class Strmo implements Student{
    public void study(){
        System.out.println("All Student study");
    }
}


public class Intrface {
    public static void main(String[] args) {
        Strmo st = new Strmo();
        st.study();
        
    }
}
