package shoe;

public class MenShoeState implements ShoeState 
{

	@Override
	public void menShoes(ShoeContext shoeContext) {
		System.out.println("Mens Shoes: Sneakers, Monk shoes, Moccasins etc..");
		shoeContext.setShoeState(this);
	}

	@Override
	public void womenShoes(ShoeContext shoeContext) {
		System.out.println("Not Suitable for Womens");
		shoeContext.setShoeState(this);
	} 
	public String toString()
	{
		return "Men Shoe State";
	}
}
