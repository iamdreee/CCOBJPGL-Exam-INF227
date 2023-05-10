import myself.*;
import travel.*;

public class run {
    public static void main(String[] args){

        locations boracay = new boracay();
        locations batanes = new batanes();
        locations cebu = new cebu();
        locations iloilo = new iloilo();
        locations palawan = new palawan();
        locations japan = new japan();

        tourist a = new me();

        boracay.accept(a);
        batanes.accept(a);
        cebu.accept(a);
        iloilo.accept(a);
        palawan.accept(a);
        japan.accept(a);


    }
    
}
