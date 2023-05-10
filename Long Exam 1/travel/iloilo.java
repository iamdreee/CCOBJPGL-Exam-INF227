package travel;
import myself.tourist;

public class iloilo implements locations{

    public final int airfare = 170;
    
    public void accept(tourist tourist){
        tourist.visit(this);
    }


    
}
