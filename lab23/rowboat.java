
public class rowboat extends Ship{

	public rowboat(int price) {
		super(price);
	}
	
	@Override
	public void move() {
		System.out.println("Rowboat Moves");
	}
	
	@Override
	public void dropAnchor() {
		System.out.println("Rowboat has no Anchor");
	}

}
