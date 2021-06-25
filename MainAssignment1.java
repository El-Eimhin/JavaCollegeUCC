import java.util.List;
import java.util.ArrayList;

public class MainAssignment1 {

	public static void main(String[] args) {
		final List<Garment> items = new ArrayList<Garment>( );
		Jeans jn1 = new Jeans();
		Tshirts ts1 = new Tshirts();
		Jacket jk1 = new Jacket();
		WinterCoat wc1 = new WinterCoat();
		RainCoat rc1 = new RainCoat();
		
		
		items.add(jk1);
		items.add(rc1);
		items.add(ts1);
		items.add(wc1);
		items.add(jn1);
		
		
		for (Garment item : items) {
			item.printPurpose( );
		}

		
		System.out.println( );
		
		for (Garment item : items) {
			item.printItemisedBill( );
			System.out.println( "---------------------------------------------");
		}

		
	
		
		
		
	}

}
