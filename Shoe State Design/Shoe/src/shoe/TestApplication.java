package shoe;

public class TestApplication {

	public static void main(String[] args) {
		ShoeContext shoeContext = new ShoeContext();
		MenShoeState mstate=new MenShoeState();
		mstate.menShoes(shoeContext);
		mstate.womenShoes(shoeContext);
		System.out.println(shoeContext.getShoeState().toString());

		WomenShoeState wstate=new WomenShoeState();
		wstate.menShoes(shoeContext);
		wstate.womenShoes(shoeContext);
		System.out.println(shoeContext.getShoeState().toString());
	}

}
