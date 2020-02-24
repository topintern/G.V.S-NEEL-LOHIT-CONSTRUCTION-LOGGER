package CostEstimate.CostEstimate;
import java.util.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class User {
	private static final Logger LOGGER =LogManager.getLogger(User.class);
	//Input class variables input material standard,area of house, fully automate option 
	public static int user_material_standard;
	public static double area;
	public static boolean automate;
	
	public static void estimate() { 
	
	//Initialising  the scanner
	Scanner sc=new Scanner(System.in);
	
	//taking input
	user_material_standard=sc.nextInt();
	area=sc.nextDouble();
	automate=sc.nextBoolean();
	if(automate)
	LOGGER.warn("Automation charges will prevail");
	
	//closing scanner
	sc.close();
	
	new Construction();
	LOGGER.info("Construction Estimate is INR "+Construction.cost());
	
	}
	public static void main(String args[])
	{
		LOGGER.info("enter input");
		estimate();
	}
}
