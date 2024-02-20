package threads.demo2;

public class Example {
    public static void main(String[] args) {
        OddPrinter op = new OddPrinter();
        EvenPrinter ep = new EvenPrinter();

        Thread opt = new Thread(op);
        Thread ept = new Thread(ep);

        opt.start();
        ept.start();
    }
}

class OddPrinter implements Runnable{
    @Override
    public void run() {
        for (int i=0; i<50; i++){
            if(i%2!=0){
                System.out.println("I am odd:" + i);
            }
        }
    }
}

class EvenPrinter implements Runnable{

    @Override
    public void run() {
        for (int i=0; i<50; i++){
            if(i%2==0){
                System.out.println("I am even:" + i);
            }
        }
    }
}