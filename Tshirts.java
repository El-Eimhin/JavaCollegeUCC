
public class Tshirts extends Shirts {

	
	private final static String NAME = "T-Shirt";
	private final static Double UNITS_REQUIRED = 1.5;
	private final static Cotton FABRIC_USED = new Cotton();
	
	public Tshirts() {
		super(NAME, UNITS_REQUIRED, FABRIC_USED);
		
	}

}
