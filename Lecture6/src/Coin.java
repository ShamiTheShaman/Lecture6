import java.util.concurrent.ThreadLocalRandom;

public class Coin {

    public String flip(){
        int random = ThreadLocalRandom.current().nextInt(0,1+1);

        if(random==0){
            return "Head";
        } else
            return "Tails";
    }
}
