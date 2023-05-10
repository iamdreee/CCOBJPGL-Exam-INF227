package travel;
import myself.tourist;

public class boracay implements locations{

     public final int airfare = 100;

    public void accept(tourist tourist){
        tourist.visit(this);
    }
    
}
