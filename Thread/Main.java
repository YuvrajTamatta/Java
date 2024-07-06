class Thread2 extends Thread{
    @Override
    public void run(){
        try {
            for(int i=4; i>=1; i--)
        {
            System.out.println(i);
            Thread.sleep(1000);
        }
        System.out.println("Game start");
        } catch (InterruptedException e) {
            System.out.println(e);
            
        }
    }
}

class Main{
    public static void main(String[] args) {
    

        Thread2 t2= new Thread2();
        t2.start();
        
    }
}