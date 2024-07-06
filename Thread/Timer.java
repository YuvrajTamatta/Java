class Time extends Thread 
 {
    public void run()
    {
        try {
            for(int i =4; i>0; i--)
        {
            System.out.println(i);
            Thread.sleep(1000);
        }
        System.out.println("Game start");
        } catch (InterruptedException ie) {
            System.out.println(ie);            
        
    }
}

}

public class Timer {
    public static void main(String[] args)  {

        Time t = new Time();
        t.start();
        
    }
    
}
