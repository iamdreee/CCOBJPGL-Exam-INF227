package travel;
import myself.tourist;

public class japan implements locations{

    public final int airfare = 1550;

    public void accept(tourist tourist){
        tourist.visit(this);
    }
    
}
