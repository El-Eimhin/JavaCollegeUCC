/** 
 *  Class for Coats 
 * @author Eimhin Ward (ID 119411722)
 * */ 
public class Coats extends Garment{
	/**
	 * 
	 * @param name name of Coat
	 * @param units_of_fabric_required number of units of fabric to make coat
	 * @param fabric_used name of fabric used to make coat
	 */
	public Coats(String name, Double units_of_fabric_required, Fabric fabric_used) {
		super(name, units_of_fabric_required, fabric_used);
		
	}
	
	
	/**
	 * Overriding print purpose of superclass Garment		
	 */
	@Override
	public void printPurpose() {
		
		System.out.println("Provide extra protection against the elements");
		
	}
}
