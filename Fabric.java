/** 
 *  Class for all Fabrics
 * @author Eimhin Ward (ID 119411722)
 * */ 
public class Fabric {
	
	private final String name;
	private final Double price_per_unit;

	
	/**
	 * 
	 * Constructor for the instance of this class with a given name
	 * 
	 * @param name the name of the fabric
	 * @param price_per_unit the price per unit of size of the fabric
	 */
	
	public Fabric(final String name, final Double price_per_unit) {
		
		this.name = name;
		this.price_per_unit = price_per_unit;
	}
	/**
	 * 
	 * @return name of fabric
	 */
	public String getName( ) { 
		return name;    
	}
	
	/**
	 * 
	 * @return the price per unit of fabric
	 */
	public Double getPricePerUnit() {
		return price_per_unit;
	}
	
	public String getSource() {
		
		return "xx";
	}
}
