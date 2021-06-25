
public class NaturalFabric extends Fabric{

	private final String source;
	
	public NaturalFabric(String name, Double price_per_unit, String Source) {
		super(name, price_per_unit);
		this.source = Source;
		
	}
	
	public String getSource() {
		
		return source;
	}

}
