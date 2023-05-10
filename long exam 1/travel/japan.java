package travel;
import myself.tourist;

public class japan implements locations{

    public final int airfare = 1500;

    public void accept(tourist tourist){
        tourist.visit(this);
    }
    
}
