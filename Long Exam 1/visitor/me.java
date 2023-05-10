package myself;
import travel.*;

public class me implements tourist{

     int budget = 1000;

 

   public void visit(){
        System.out.print("Enjoying my stay");
    }
    public void visit (boracay boracay){
        if (budget >= boracay.airfare){
            budget -= boracay.airfare;
        System.out.println("hello boracay!");
        System.out.println("remaining budget "+ budget);
        } else {
            System.out.println("boracay, maybe next time!");
            System.out.println("remaining budget "+ budget);
       }
    }
    public void visit (batanes batanes){
        if (budget >= batanes.airfare){
            budget -= batanes.airfare;
        System.out.println("hello batanes!");
        System.out.println("remaining budget "+ budget);
        } else {
            System.out.println("batanes, maybe next time!");
            System.out.println("remaining budget "+ budget);
        }
    }
    public void visit (cebu cebu){
        if(budget >= cebu.airfare){
           budget -= cebu.airfare;
        System.out.println("hello cebu!");
        System.out.println("remaining budget "+ budget);
        } else {
            System.out.println("cebu, maybe next time!");
            System.out.println("remaining budget "+ budget);
        }
    }
    public void visit (iloilo iloilo){
        if (budget >= iloilo.airfare){
            budget -= iloilo.airfare;
        System.out.println("hello iloilo!");
        System.out.println("remaining budget "+ budget);
        } else {
            System.out.println("iloilo, maybe next time!");
            System.out.println("remaining budget "+ budget);
        }
    }
    public void visit (palawan palawan){
        if (budget >= palawan.airfare){
            budget -= palawan.airfare;
        System.out.println("hello palawan!");
        System.out.println("remaining budget "+ budget);
        } else {
            System.out.println("palawan, maybe next time!");
            System.out.println("remaining budget "+ budget);
        }
    }
    public void visit (japan japan ){
        if (budget >= japan.airfare){
            budget -= japan.airfare;
        System.out.println("konnichiwa japan!");
        System.out.println("remaining budget "+ budget);
        } else {
            System.out.println("japan, maybe next time!");
            System.out.println("remaining budget "+ budget);
        }
    }
    public void checkbudget(){
        System.out.println("my budget is "+ budget);
    }
}

  
