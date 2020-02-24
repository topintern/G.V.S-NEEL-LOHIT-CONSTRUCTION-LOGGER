package CostEstimate.CostEstimate;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
//class Construction is a subclass of User
public class Construction extends User {
	private static final Logger LOGGER =LogManager.getLogger(Construction.class);
	//array containing price per square feet for all standards
	private static int construction_cost_persqft[]={1200,1500,1800,2500};
	// method to calculate and return the total cost
	public static double cost(){
		double final_cost;
		final_cost=(automate?(construction_cost_persqft[user_material_standard]+700):construction_cost_persqft[user_material_standard])*area;
	    LOGGER.debug("debug cost is: "+final_cost);
		return final_cost;
	}
}
	