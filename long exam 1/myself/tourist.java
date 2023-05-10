package myself;
import travel.*;

public interface tourist {

    int budget = 0;

    void visit();

    void visit(boracay boracay);
    void visit(batanes batanes);
    void visit(cebu cebu);
    void visit(iloilo iloilo);
    void visit(palawan palawan);
    void visit(japan japan);

    default void visit (locations locations){
        System.out.println("arrived at the destination");
    }
    void checkbudget();
    
}
