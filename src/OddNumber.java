import java.util.Random;

public class OddNumber extends Thread {
    String name;
    OddNumber(String name){
        this.name = name;
    }
    @Override
    public void run(){
        try {
            for(int i=0; i<5 ; i++){
                int num = new Random().nextInt(10);
                if( num % 2 == 0){
                    num ++;
                    System.out.println(name +" " + num);
                } else {
                    System.out.println(name +" " + num);
                }
                Thread.sleep(10);
            }
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
