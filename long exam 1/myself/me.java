package myself;
import travel.*;

public class me implements tourist{

     int budget = 1000;

 

   public void visit(){
        System.out.println("enjoy");
    }
    public void visit (boracay boracay){
        if (budget >= boracay.airfare){
            budget -= boracay.airfare;
        System.out.println("hola boracay!");
        System.out.println("remaining budget = "+ budget);
        } else {
            System.out.println("poor no money");
            System.out.println("remaining budget = "+ budget);
       }
    }
    public void visit (batanes batanes){
        if (budget >= batanes.airfare){
            budget -= batanes.airfare;
        System.out.println("hola batanes!");
        System.out.println("remaining budget = "+ budget);
        } else {
            System.out.println("poor no money");
            System.out.println("remaining budget = "+ budget);
        }
    }
    public void visit (cebu cebu){
        if(budget >= cebu.airfare){
           budget -= cebu.airfare;
        System.out.println("hola cebu!");
        System.out.println("remaining budget = "+ budget);
        } else {
            System.out.println("poor no money");
            System.out.println("remaining budget = "+ budget);
        }
    }
    public void visit (iloilo iloilo){
        if (budget >= iloilo.airfare){
            budget -= iloilo.airfare;
        System.out.println("hola iloilo!");
        System.out.println("remaining budget = "+ budget);
        } else {
            System.out.println("poor no money");
            System.out.println("remaining budget = "+ budget);
        }
    }
    public void visit (palawan palawan){
        if (budget >= palawan.airfare){
            budget -= palawan.airfare;
        System.out.println("hola palawan!");
        System.out.println("remaining budget = "+ budget);
        } else {
            System.out.println("poor no money");
            System.out.println("remaining budget = "+ budget);
        }
    }
    public void visit (japan japan ){
        if (budget >= japan.airfare){
            budget -= japan.airfare;
        System.out.println("konnichiwa japan!");
        System.out.println("remaining budget = "+ budget);
        } else {
            System.out.println("poor no money");
            System.out.println("remaining budget = "+ budget);
        }
    }
    public void checkbudget(){
        System.out.println("my budget is "+ budget);
    }
}

  
