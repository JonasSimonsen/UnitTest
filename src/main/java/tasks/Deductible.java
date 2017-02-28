package tasks;

/**
 *
 * @author jonassimonsen
 */
public class Deductible {
    
    public static void main(String[] args) throws Exception {
        System.out.println(new Deductible().getReimbursing(true, "Doctor"));
    }
    
    public int getReimbursing(boolean deductibleMet, String typeOfVisit) throws Exception {
        if(!typeOfVisit.equalsIgnoreCase("Hospital") && !typeOfVisit.equalsIgnoreCase("Doctor")) 
            throw new Exception();
        
        if(!deductibleMet) 
            return 0;
        
        if(typeOfVisit.equalsIgnoreCase("Doctor")) 
            return 50;
        
        if(typeOfVisit.equalsIgnoreCase("Hospital"))
            return 80;
        
        return 0;
    }
}
