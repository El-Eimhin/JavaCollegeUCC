/** 
 *  Class for the garment type Jacket
 * @author Eimhin Ward (ID 119411722)
 * */ 
public class Jacket extends Coats{
	
	private final static String NAME = "Jacket";
	private final static Double UNITS_REQUIRED = 2.0;
	private final static Tweed FABRIC_USED = new Tweed();
	
	public Jacket() {
		super(NAME,UNITS_REQUIRED,FABRIC_USED);
		
	}

	
}
