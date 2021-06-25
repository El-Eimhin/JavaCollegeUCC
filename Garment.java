/** 
 *  Class for all Garments 
 * @author Eimhin Ward (ID 119411722)
 * */ 

public class Garment {
	
	private final String name;
	private final Double units_of_fabric_required;
	private final Fabric fabric_used;
	
	/**
	 * 
	 * Constructor for the instance of this class with a given name
	 * 
	 * @param name the name of the garment
	 * @param units_of_fabric_required the number of units required to make this garment
	 * @param fabric_used the fabric used to make the garment
	 */
	
	public Garment(final String name, final Double units_of_fabric_required, final Fabric fabric_used) {
		
		this.name = name;
		this.units_of_fabric_required = units_of_fabric_required;
		this.fabric_used = fabric_used;
	}
	
	/** 
	 * Get the name of this instance.
	 * 
	 * @return The name of this instance.  
	 */    
	public String getName( ) { 
		return name;    
	}
	
	/**
	 * 
	 * @return the fabric used to create the garment
	 */
	public Fabric getFabric() {
		return fabric_used;
	}
	
	/**
	 * 
	 * @return the number of units of fabric required to make the garment
	 */
	public Double getUnitsOfFabricRequired() {
		return units_of_fabric_required;
	}
	
	
	/**
	 * Print the purpose of this garment
	 */
	public void printPurpose() {
		
		System.out.println("This is a general, non-specific Garment");
		
	}
	
	public void printItemisedBill() {
		
		final String return_string;
		final Double c = fabric_used.getPricePerUnit();
		final Double e = 2.0;
		final Double u = this.units_of_fabric_required;
		final Double enviroCost;
		final String fabricSource;
		final Double taxAmount;
		
		if (this.fabric_used instanceof SyntheticFabric) {
			
			enviroCost = e * u;
			fabricSource = "";
			taxAmount = u;
		}
		else {
			
			enviroCost = 0.0;
			fabricSource = "made of " + this.fabric_used.getSource();
			taxAmount = 0.0;
		}
		
		return_string =String.format( "Itemised bill for %s " + "\n" +
						"Made of %.1f units of %s " + fabricSource + "\n" +
						"Enviroment tax: 2.0 * %.1f = %.1f" + "\n" +
						"Base Price: %.1f * %.1f = %.1f" + "\n" +
						"Grand Total: (%.1f * %.1f) + (%.1f * %.1f) = %.1f", this.getName(),
						this.getUnitsOfFabricRequired(), this.getFabric().getName(),
													taxAmount, enviroCost,
													c, u, c*u,
													c,u,      e, taxAmount,    (c*u)+(e * taxAmount) );
		System.out.println(return_string);
		
	}
	
	
}


