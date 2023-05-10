package travel;
import myself.tourist;

public class batanes implements locations{

    public int airfare = 100;

    public void accept(tourist tourist){
        tourist.visit(this);
    }
}
