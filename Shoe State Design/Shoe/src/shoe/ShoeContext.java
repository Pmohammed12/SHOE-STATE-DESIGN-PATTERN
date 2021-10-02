package shoe;

public class ShoeContext 
{
	private ShoeState shoeState;
	public void setShoeState(ShoeState shoeState)
	{
		this.shoeState = shoeState;
	}
	public ShoeState getShoeState()
	{
		return shoeState;
	}
}
