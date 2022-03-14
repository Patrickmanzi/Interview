package drishtcon;

public class TreadName extends Thread{

    public static void main(String[] args) {
        TreadName tr = new TreadName();
        tr.start();
    }
    public void run() {
        for(int i=0; i<5; i++) {
            System.out.println("me");
        }
    }
}
