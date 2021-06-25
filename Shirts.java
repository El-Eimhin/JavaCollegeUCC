
public class Shirts extends Garment {

	public Shirts(String name, Double units_of_fabric_required, Fabric fabric_used) {
		super(name,units_of_fabric_required, fabric_used);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void printPurpose() {
		
		System.out.println("Cover the body");
		
	}

}
