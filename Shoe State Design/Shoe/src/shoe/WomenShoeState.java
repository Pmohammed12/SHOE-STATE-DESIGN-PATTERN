package shoe;

public class WomenShoeState implements ShoeState 
{

	@Override
	public void menShoes(ShoeContext shoeContext) {
		System.out.println("Not Suitable for Men");
		shoeContext.setShoeState(this);
	}

	@Override
	public void womenShoes(ShoeContext shoeContext) {
		System.out.println("Women Shoes: Pumps, Stilettos, Kitten Heels etc..");
		shoeContext.setShoeState(this);
	} 
	public String toString()
	{
		return "Women Shoe State";
	}
}
