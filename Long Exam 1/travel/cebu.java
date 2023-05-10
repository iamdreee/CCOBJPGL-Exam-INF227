package travel;
import myself.tourist;

public class cebu implements locations{

    public final int airfare = 150;

    public void accept (tourist tourist){
        tourist.visit(this);
    }

    
}
