
public class Trousers extends Garment {

	
	/**
	 * 
	 * @param name name of Coat
	 * @param units_of_fabric_required number of units of fabric to make coat
	 * @param fabric_used name of fabric used to make coat
	 */
	
	public Trousers(String name, Double units_of_fabric_required, Fabric fabric_used) {
		super(name,units_of_fabric_required, fabric_used);
		// TODO Auto-generated constructor stub
	}
	
	
	/**
	 * Overriding print purpose of superclass Garment		
	 */
	@Override
	public void printPurpose() {
		
		System.out.println("Cover the legs");
		
	}

}
