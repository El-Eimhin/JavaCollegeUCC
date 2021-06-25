
public class RainCoat extends Coats{
	
	private final static String NAME = "Rain Coat";
	private final static Double UNITS_REQUIRED = 2.5;
	private final static Acrylic FABRIC_USED = new Acrylic();
	
	public RainCoat() {
		super(NAME, UNITS_REQUIRED,FABRIC_USED);
		
	}

	
}
